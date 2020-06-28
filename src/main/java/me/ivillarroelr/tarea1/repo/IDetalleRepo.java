package me.ivillarroelr.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivillarroelr.tarea1.model.Detalle;

public interface IDetalleRepo extends JpaRepository<Detalle, Integer> {
    
}