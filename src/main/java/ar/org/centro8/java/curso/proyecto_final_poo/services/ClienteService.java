package ar.org.centro8.java.curso.proyecto_final_poo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Cliente;
import ar.org.centro8.java.curso.proyecto_final_poo.model.repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Optional <Cliente> buscar(Long id) {
        return repo.findById(id);
    }

    public void guardar(Cliente c) {

        repo.save(c);
    }

    public Cliente actualizar(Cliente c) {
       return repo.save(c);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
