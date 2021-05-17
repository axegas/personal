package com.axegas.proyectov2.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Especialista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idespecialista;
	
	@NotEmpty(message = "{notempty}")
	@Column(nullable = false)
	private String nombre;
	
	@NotEmpty(message = "{notempty}")
	@Column(nullable = false, unique = true)
	@Pattern(regexp = "^[0-9]{8}[A-Za-z]{1}", message="{dni}")
	private String dni;
	
	@Min(value = 100000000, message = "{telefono}")
	@Max(value = 999999999, message = "{telefono}")
	private int telefono;
	
	@ManyToOne
	@JoinColumn(name = "idespecialidad")
	private Especialidad especialidad;
	
	@OneToOne
	@JoinColumn(name = "idusuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "especialista")
    private List<Sesion> sesiones = new ArrayList<Sesion>();
	
	@OneToMany(mappedBy = "especialista")
    private List<Factura> facturas = new ArrayList<Factura>();

	public Especialista() {
		super();
	}

	public Especialista(long idespecialista, String nombre, String dni, int telefono, Especialidad especialidad, Usuario usuario) {
		super();
		this.idespecialista = idespecialista;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.usuario = usuario;
	}

	public Especialista(String nombre, String dni, int telefono, Especialidad especialidad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}

	public List<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<Sesion> sesiones) {
		this.sesiones = sesiones;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public long getIdespecialista() {
		return idespecialista;
	}

	public void setIdespecialista(long idespecialista) {
		this.idespecialista = idespecialista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sesion> getHistoriales() {
		return sesiones;
	}

	public void setHistoriales(List<Sesion> sesiones) {
		this.sesiones = sesiones;
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

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return dni + " - " + nombre;
	}	
	
}
