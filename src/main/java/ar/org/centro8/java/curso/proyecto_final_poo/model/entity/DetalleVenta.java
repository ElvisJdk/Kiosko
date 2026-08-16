package ar.org.centro8.java.curso.proyecto_final_poo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table (name = "detalleVentas")
public class DetalleVenta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Integer idDelalle;

    @ManyToOne
    @JoinColumn(name = "id_producto",nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Venta venta;

    @Column(nullable = false)
    private Double precioUnitario;

    @Column(nullable = false)
    private Integer cantidad;
    
    @Column(nullable = false)
    private Double subtotal;
}
