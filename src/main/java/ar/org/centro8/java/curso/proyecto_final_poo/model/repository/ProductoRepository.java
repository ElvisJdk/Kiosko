package ar.org.centro8.java.curso.proyecto_final_poo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.java.curso.proyecto_final_poo.model.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

    



/** 
    private final JdbcTemplate jdbc;

    private final RowMapper<Producto> mapper = (rs, rowNum) -> {
        Producto p = new Producto();
        p.setId(rs.getInt("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecioCompra(rs.getDouble("precio_compra"));
        p.setPrecioVenta(rs.getDouble("precio_venta"));
        p.setStock(rs.getInt("stock"));
        return p;
    };

    public ProductoRepository(JdbcTemplate jdbc) { this.jdbc = jdbc; }

    public List<Producto> findAll() {
        return jdbc.query("SELECT * FROM productos", mapper);
    }

    public Producto findById(int id) {
        return jdbc.queryForObject("SELECT * FROM productos WHERE id=?", mapper, id);
    }

    public void save(Producto p) {
        jdbc.update("INSERT INTO productos (nombre, precio_compra, precio_venta, stock) VALUES (?,?,?,?) ",
                p.getNombre(), p.getPrecioCompra(), p.getPrecioVenta(), p.getStock());
    }

    public void update(Producto p) {
        jdbc.update("UPDATE productos SET nombre=?,precio_compra=?, precio_venta=?, stock=? WHERE id=?",
                p.getNombre(), p.getPrecioCompra(), p.getPrecioVenta(), p.getStock(), p.getId());
    }

    public void delete(int id) {
        jdbc.update("DELETE FROM productos WHERE id=?", id);
    }

    */
}
