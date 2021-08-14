package com.everis.crud.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.crud.app.domain.Producto;
import com.everis.crud.app.repository.IRepositoryProducto;
import com.everis.crud.app.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	public IRepositoryProducto repo;
	
	@Override
	public Producto guardarProducto(Producto p) {
		return repo.save(p);
	}
	
	@Override
	public List<Producto> listarProducto() {
		return repo.findAll();
	}
	
	@Override
	public Producto updateProducto(Producto p) {
		return repo.save(p);
	}
	
	@Override
	public void eliminarProducto(Long id) {
		repo.deleteById(id);
		
	}
	
	@Override
	public Producto buscarProducto(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
}
