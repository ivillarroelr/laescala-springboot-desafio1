package me.ivillarroelr.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivillarroelr.tarea1.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer> {
    
}