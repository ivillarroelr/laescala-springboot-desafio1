package me.ivillarroelr.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivillarroelr.tarea1.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto,Integer>{
    
}