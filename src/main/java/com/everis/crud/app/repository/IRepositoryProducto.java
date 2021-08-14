package com.everis.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.crud.app.domain.Producto;

public interface IRepositoryProducto extends JpaRepository<Producto, Long>{
 
}
