package ar.org.centro8.java.curso.proyecto_final_poo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer>{

    









/* 


    private final JdbcTemplate jdbc;

    private final RowMapper<Venta> mapper = (rs, rowNum) -> {
        Venta v = new Venta();
        v.setId(rs.getInt("id"));
        v.setIdCliente(rs.getInt("id_cliente"));
        Timestamp ts = rs.getTimestamp("fecha");
        v.setFecha(ts==null ? null : ts.toLocalDateTime());
        v.setEstado(EstadoVenta.valueOf(rs.getString("estado")));
        v.setTotal(rs.getDouble("total"));
        return v;
    };

    public VentaRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }

    public List<Venta> findAll() {
        return jdbc.query("SELECT * FROM ventas ORDER BY fecha DESC", mapper);
    }

    public Venta findById(int id) {
        return jdbc.queryForObject("SELECT * FROM ventas WHERE id=?", mapper, id);
    }

    public int save(int idCliente, LocalDateTime fecha, EstadoVenta estado, double total) {
        jdbc.update("INSERT INTO ventas (id_cliente, fecha, estado, total) VALUES (?,?,?,?)",
                idCliente, Timestamp.valueOf(fecha), estado.name(), total);
        Integer id = jdbc.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);
        return id == null ? 0 : id;
    }

    public void updateEstadoYTotal(int id, EstadoVenta estado, double total) {
        jdbc.update("UPDATE ventas SET estado=?, total=? WHERE id=?", estado.name(), total, id);
    }

    public void delete(int id) {
        jdbc.update("DELETE FROM ventas WHERE id=?", id);
    }

    */

}
