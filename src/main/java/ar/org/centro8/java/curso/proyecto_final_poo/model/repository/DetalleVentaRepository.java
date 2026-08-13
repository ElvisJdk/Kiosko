package ar.org.centro8.java.curso.proyecto_final_poo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.DetalleVenta;

import java.util.List;

@Repository
public interface  DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{

    

    


























    /** 
    private final JdbcTemplate jdbc;

    private final RowMapper<DetalleVenta> mapper = (rs, rowNum) -> {
        DetalleVenta d = new DetalleVenta();
        d.setIdVenta(rs.getInt("id_venta"));
        d.setIdProducto(rs.getInt("id_producto"));
        d.setPrecioUnitario(rs.getDouble("precio_unitario"));
        d.setCantidad(rs.getInt("cantidad"));
        d.setSubtotal(rs.getDouble("subtotal"));
        return d;
    };

    public DetalleVentaRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }

    public List<DetalleVenta> findByVenta(int idVenta) {
        return jdbc.query("SELECT * FROM detalle_ventas WHERE id_venta=?", mapper, idVenta);
    }

    public void save(DetalleVenta d) {
        jdbc.update("INSERT INTO detalle_ventas (id_venta, id_producto, precio_unitario, cantidad, subtotal) VALUES (?,?,?,?,?)",
                d.getIdVenta(), d.getIdProducto(), d.getPrecioUnitario(), d.getCantidad(), d.getSubtotal());
    }

    public void deleteByVenta(int idVenta) {
        jdbc.update("DELETE FROM detalle_ventas WHERE id_venta=?", idVenta);
    }
        */
}
