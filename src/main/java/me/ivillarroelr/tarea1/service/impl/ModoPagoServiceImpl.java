package me.ivillarroelr.tarea1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import me.ivillarroelr.tarea1.model.ModoPago;
import me.ivillarroelr.tarea1.repo.IModoPagoRepo;
import me.ivillarroelr.tarea1.service.IModoPagoService;

public class ModoPagoServiceImpl implements IModoPagoService{
    
    @Autowired
    private IModoPagoRepo repo;
    
    @Override
	public ModoPago registrar(ModoPago modoPago) {
		return repo.save(modoPago);
	}
	
	@Override
	public ModoPago modificar(ModoPago modoPago) {
		return repo.save(modoPago);
	}
	
	@Override
	public List<ModoPago> listar() {
		return repo.findAll();
	}
	
	@Override
	public ModoPago leerPorId(Integer id) {
		Optional<ModoPago> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ModoPago();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}


}