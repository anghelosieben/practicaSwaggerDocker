package com.ex.practicaspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="producto")
public class Producto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private int idProducto;
    private String nombre_producto;
    private String descripcion;
    private double precio;

}
