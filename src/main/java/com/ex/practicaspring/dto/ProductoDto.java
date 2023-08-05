package com.ex.practicaspring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDto {
    private String nombre_producto;
    private String descripcion;
    private double precio;
}
