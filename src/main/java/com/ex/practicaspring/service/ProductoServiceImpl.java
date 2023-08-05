package com.ex.practicaspring.service;

import com.ex.practicaspring.entity.Producto;
import com.ex.practicaspring.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void actualizarPorId(int idProducto,Producto producto) {
        Producto oldProducto=productoRepository.findById(idProducto).orElse(null);
        if(oldProducto!=null)
        {
            oldProducto.setNombre_producto(producto.getNombre_producto());
            oldProducto.setPrecio(producto.getPrecio());
            oldProducto.setDescripcion(producto.getDescripcion());
            productoRepository.save(oldProducto);
        }
    }

    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }



    @Override
    public void eliminar(int idProducto) {
        productoRepository.deleteById(idProducto);
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public Producto buscarPorId(int idProducto) {
        return productoRepository.findById(idProducto).orElse(null);
    }
}
