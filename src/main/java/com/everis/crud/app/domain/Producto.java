package com.everis.crud.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_producto", length = 4)
	private Long cod_producto;
	
	@Size(max = 4)
	@Column(name = "nombre_producto", length = 4)
	private String nombre_producto;
	
	@NonNull
	@NotBlank
	@Size(max = 4)
	@Column(name = "precioVenta_producto", length = 4)
	private Double precioVenta_producto;
	
	@NonNull
	@NotBlank
	@Size(max =5)
	@Column(name = "precioCompra_producto", length = 4)
	private double precioCompra_producto;
	
	@Column(name = "stock_producto", length = 3)
	private Integer stock;
	
	@Size(max=50)
	@Column(name = "descripcion_producto", length = 50)
	private String descripcion_producto;
}
