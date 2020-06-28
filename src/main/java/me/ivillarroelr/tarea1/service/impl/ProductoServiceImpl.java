package me.ivillarroelr.tarea1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import me.ivillarroelr.tarea1.model.Producto;
import me.ivillarroelr.tarea1.repo.IProductoRepo;
import me.ivillarroelr.tarea1.service.IProductoService;

public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepo repo;

    @Override
    public Producto registrar(Producto obj) {
        return repo.save(obj);
    }

    @Override
    public Producto modificar(Producto obj) {
        return repo.save(obj);
    }

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public Producto leerPorId(Integer id) {
        Optional<Producto> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Producto();
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
        return true;
    }
    
}