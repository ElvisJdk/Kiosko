package ar.org.centro8.java.curso.proyecto_final_poo.model.entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_producto;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column (nullable = false)
    private double precioCompra;
    @Column(nullable = false)
    private double precioVenta;
    @Column(nullable = false)
    private int stock;
   
    public Producto() {
    }

    
}
