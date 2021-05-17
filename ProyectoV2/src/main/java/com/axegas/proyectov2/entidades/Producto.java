package com.axegas.proyectov2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproducto;
	
	@NotEmpty(message = "{notempty}")
	@Column(nullable = false)
	private String nombre;
	
	@NotEmpty(message = "{notempty}")
	private String descripcion;

	private float precio;
	
	@ManyToOne
	@JoinColumn(name = "idproveedor")
	private Proveedor proveedor;

	public Producto() {
		super();
	}
	
	public Producto(String nombre, String descripcion, float precio, Proveedor proveedor) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.proveedor = proveedor;
	}

	public Producto(long idproducto, String nombre, String descripcion, float precio, Proveedor proveedor) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.proveedor = proveedor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", descripcion: " + descripcion;
	}

}
