package ar.org.centro8.java.curso.proyecto_final_poo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    












































   /** private final JdbcTemplate jdbc;

    private final RowMapper<Cliente> mapper = (rs, rowNum) -> {
        Cliente c = new Cliente();
        c.setId(rs.getInt("id"));
        c.setNombre(rs.getString("nombre"));
        c.setApellido(rs.getString("apellido"));
        c.setDni(rs.getString("dni"));
        c.setEmail(rs.getString("email"));
        c.setTelefono(rs.getString("telefono"));
        c.setActivo(rs.getBoolean("activo"));
        return c;
    };

    public ClienteRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }

    public List<Cliente> findAll() {
        return jdbc.query("SELECT * FROM clientes ORDER BY apellido, nombre", mapper);
    }

    public Cliente findById(int id) {
        return jdbc.queryForObject("SELECT * FROM clientes WHERE id=?", mapper, id);
    }

    public void save(Cliente c) {
        jdbc.update("INSERT INTO clientes (nombre, apellido, dni, email, telefono, activo) VALUES (?,?,?,?,?,?)",
                c.getNombre(), c.getApellido(), c.getDni(), c.getEmail(), c.getTelefono(), c.getActivo()==null?true:c.getActivo());
    }

    public void update(Cliente c) {
        jdbc.update("UPDATE clientes SET nombre=?, apellido=?, dni=?, email=?, telefono=?, activo=? WHERE id=?",
                c.getNombre(), c.getApellido(), c.getDni(), c.getEmail(), c.getTelefono(), c.getActivo(), c.getId());
    }

    public void delete(int id) {
        jdbc.update("DELETE FROM clientes WHERE id=?", id);
    }
        */ 
}
