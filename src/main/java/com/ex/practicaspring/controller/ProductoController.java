package com.ex.practicaspring.controller;

import com.ex.practicaspring.entity.Producto;

import com.ex.practicaspring.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//controlador rest
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl service;
    //post crear
    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        return service.guardar(producto);
    }
    //put actualizar
    @PutMapping
    public Producto actualizar(@RequestBody Producto producto){
        return service.guardar(producto);
    }
    @PutMapping("/actualizar/{id}")
    public void actualizarPorId(@PathVariable Integer id,
            @RequestBody Producto producto){
        service.actualizarPorId(id,producto);
    }
    //Delete eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        service.eliminar(id);
    }
    //get listar, buscar
    @GetMapping
    public List<Producto> listar(){
        return service.listar();
    }
    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }
}
