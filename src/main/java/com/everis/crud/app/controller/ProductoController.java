package com.everis.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.crud.app.domain.Producto;
import com.everis.crud.app.repository.IRepositoryProducto;
import com.everis.crud.app.service.IProductoService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/productos")
@Log4j2
public class ProductoController {
	
	@Autowired
	public IProductoService productoServicio;
	
	@PostMapping("/guardar")
	public Producto metodoGuardarAlumno(@RequestBody Producto p) {
		return productoServicio.guardarProducto(p);
	}
	
	@GetMapping("/listar")
	public List<Producto> metodoListarProducto(@RequestBody Producto p){
		return productoServicio.listarProducto();
	}
	
	@PutMapping("/actualizar")
	public Producto metodoActualizarProducto(@RequestBody Producto p) {
		return productoServicio.updateProducto(p);
	}
	
	@DeleteMapping("/eliminar")
	public void metodoEliminarProducto(Long id) {
		productoServicio.eliminarProducto(id);
		//log.info("An INFO Message");
	}
	
	@GetMapping("/buscar")
	public Producto metodoBuscarProducto(Long id) {
		return productoServicio.buscarProducto(id);
	}
}
