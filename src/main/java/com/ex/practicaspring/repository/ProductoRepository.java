package com.ex.practicaspring.repository;

import com.ex.practicaspring.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface ProductoRepository extends JpaRepository  <Producto,Integer>{
  /*  @Query(value="select c from Producto where nombreProducto like '%:nombre%'")
    List<Producto> encontrarPorductoPorNombre(@Param("nombre") String nombre);
    @Query(value="select * from producto where nombre_producto like '%:nombre%'",nativeQuery = true)
    List<Producto> encontrarPorductoPorNombreNativo(@Param("nombre") String nombre);
*/
    //List<Producto> findByNombreProductos(String nombre);
}
