package ar.org.centro8.java.curso.proyecto_final_poo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Cliente;
import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.DetalleVenta;
import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Producto;
import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Venta;
import ar.org.centro8.java.curso.proyecto_final_poo.model.enums.EstadoVenta;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.ClienteRepository;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.DetalleVentaRepository;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.ProductoRepository;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.VentaRepository;

@Service
public class VentaService {
    private final VentaRepository ventaRepo;
    private final DetalleVentaRepository detalleRepo;
    private final ProductoRepository productoRepo;
    private final ClienteRepository clienterepo;

    public VentaService(VentaRepository ventaRepo, DetalleVentaRepository detalleRepo,
            ProductoRepository productoRepo,ClienteRepository clienterepo) {
        this.ventaRepo = ventaRepo;
        this.detalleRepo = detalleRepo;
        this.productoRepo = productoRepo;
        this.clienterepo = clienterepo;
    }

    public List<Venta> listar() {
        return ventaRepo.findAll();
    }

    public Optional<Venta> buscar(int id) {
        return ventaRepo.findById(id);
    }

    @Transactional
    public int crearVenta(int idCliente, List<Map<String, Integer>> items) {

        Cliente cliente = clienterepo.findById(idCliente)
            .orElseThrow(() -> new RuntimeException(
                    "No existe el cliente con ID: " + idCliente
            ));

        Venta venta = new Venta();
        venta.setCliente(cliente);
        venta.setFecha(LocalDateTime.now());
        venta.setEstado(EstadoVenta.PENDIENTE);
        venta.setTotal(0.0);

        venta = ventaRepo.save(venta);
        int idVenta = venta.getId_venta();

        double total = 0.0;

        for (Map<String, Integer> item : items) {
            Integer idProducto = item.get("idProducto");
            Integer cantidad = item.get("cantidad");

            if (idProducto == null || cantidad == null || cantidad <= 0) {
                continue;
            }

            Producto producto = productoRepo.findById(idProducto)
                    .orElseThrow(() -> new RuntimeException(
                            "No existe el producto con ID: " + idProducto));

            if (producto.getStock() < cantidad) {
                throw new RuntimeException(
                        "Stock insuficiente para: " + producto.getNombre());
            }

            double precioUnitario = producto.getPrecioVenta();
            double subtotal = precioUnitario * cantidad;
            total += subtotal;

            DetalleVenta detalle = new DetalleVenta(idVenta,idProducto,);

            detalleRepo.save(detalle);

            producto.setStock(producto.getStock() - cantidad);

            // No hace falta llamar a update().
            productoRepo.save(producto);
        }

        venta.setEstado(EstadoVenta.PAGADA);
        venta.setTotal(total);
        ventaRepo.save(venta);

        return idVenta;
    }

    public List<DetalleVenta> detalles(int idVenta) {
        return detalleRepo.findByVenta(idVenta);
    }

    public void eliminar(int idVenta) {
        detalleRepo.deleteByVenta(idVenta);
        ventaRepo.delete(idVenta);
    }
}
