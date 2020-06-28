package me.ivillarroelr.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivillarroelr.tarea1.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer>{
    
}