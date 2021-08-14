package com.everis.crud.app.service;

import java.util.List;

import com.everis.crud.app.domain.Producto;

public interface IProductoService {
	public Producto guardarProducto(Producto p);
	public List<Producto> listarProducto();
	public Producto updateProducto(Producto p);
	public void eliminarProducto(Long id);
	public Producto buscarProducto(Long id);	
}
