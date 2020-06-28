package me.ivillarroelr.tarea1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.ivillarroelr.tarea1.model.ModoPago;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

public interface IModoPagoRepo extends JpaRepository<ModoPago, Integer>{
    
}