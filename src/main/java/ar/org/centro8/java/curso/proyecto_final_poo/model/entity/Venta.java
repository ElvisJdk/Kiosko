package ar.org.centro8.java.curso.proyecto_final_poo.model.entity;

import java.time.LocalDateTime;

import ar.org.centro8.java.curso.proyecto_final_poo.model.enums.EstadoVenta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "ventas")
public class Venta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Integer idVenta;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)

    private Cliente cliente;
    @Column(nullable = false)

    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    
    @Column(nullable = false, length = 20)
    private EstadoVenta estado;
    
    @Column(nullable = false)
    private Double total;
}
