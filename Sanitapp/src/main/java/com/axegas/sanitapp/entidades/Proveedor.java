package com.axegas.sanitapp.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproveedor;
	
	@NotEmpty(message = "{notempty}")
	@Column(nullable = false)
	private String nombre;

	@NotEmpty(message = "{notempty}")
	@Pattern(regexp = "^[0-9]{8}[A-Za-z]{1}", message="{dni}")
	@Column(nullable = false, unique = true)
	private String dni;
	
	@Min(value = 100000000, message = "{telefono}")
	@Max(value = 999999999, message = "{telefono}")
	private int telefono;
	
	@OneToMany(mappedBy = "proveedor")
    private List<Producto> productos = new ArrayList<Producto>();
	
	public Proveedor() {
		super();
	}

	public Proveedor(String nombre, String dni, int telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}

	public Proveedor(long idproveedor, String nombre, String dni, int telefono) {
		super();
		this.idproveedor = idproveedor;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}

	public long getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(long idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return dni + " - " + nombre;
	}
	
}
