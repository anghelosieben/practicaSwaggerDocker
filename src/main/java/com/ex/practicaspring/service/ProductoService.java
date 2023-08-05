package com.ex.practicaspring.service;

import com.ex.practicaspring.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    Producto guardar(Producto producto);


    List<Producto> listar();

    void eliminar(int idProdcuto);
    List<Producto> buscarPorNombre(String nombre);
    Producto buscarPorId(int idProducto);
    Producto actualizar(Producto producto);
    public void actualizarPorId(int idProducto,Producto producto);
}
