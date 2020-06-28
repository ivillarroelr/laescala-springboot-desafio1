package me.ivillarroelr.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivillarroelr.tarea1.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{
    
}