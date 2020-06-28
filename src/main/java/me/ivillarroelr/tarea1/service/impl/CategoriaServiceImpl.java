package me.ivillarroelr.tarea1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import me.ivillarroelr.tarea1.repo.ICategoriaRepo;
import me.ivillarroelr.tarea1.service.ICategoriaService;
import me.ivillarroelr.tarea1.model.Categoria;

public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private ICategoriaRepo repo;
    
    @Override
	public Categoria registrar(Categoria categoria) {
		return repo.save(categoria);
	}
	
	@Override
	public Categoria modificar(Categoria categoria) {
		return repo.save(categoria);
	}
	
	@Override
	public List<Categoria> listar() {
		return repo.findAll();
	}
	
	@Override
	public Categoria leerPorId(Integer id) {
		Optional<Categoria> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Categoria();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}


}