package ar.org.centro8.java.curso.proyecto_final_poo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Cliente;
import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Producto;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Optional <Producto> buscar(int id) {
        return repo.findById(id);
    }

    public Producto guardar(Producto p) {
        return repo.save(p);
    }

    public Producto actualizar(Producto p) {
        return repo.save(p);
    }

    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
