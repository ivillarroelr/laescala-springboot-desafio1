package me.ivillarroelr.tarea1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import me.ivillarroelr.tarea1.model.Cliente;
import me.ivillarroelr.tarea1.repo.IClienteRepo;
import me.ivillarroelr.tarea1.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{
    
    @Autowired
    private IClienteRepo repo;
    
    @Override
	public Cliente registrar(Cliente cliente) {
		return repo.save(cliente);
	}
	
	@Override
	public Cliente modificar(Cliente cliente) {
		return repo.save(cliente);
	}
	
	@Override
	public List<Cliente> listar() {
		return repo.findAll();
	}
	
	@Override
	public Cliente leerPorId(Integer id) {
		Optional<Cliente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Cliente();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}


}