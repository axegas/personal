package com.axegas.proyectov2.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idespecialidad;
	
	@Column(nullable = false, unique=true)
	private String nombre;
	
	@OneToMany(mappedBy = "especialidad")
    private List<Especialista> especialistas = new ArrayList<Especialista>();
	
	@OneToMany(mappedBy = "especialidad")
    private List<Cita> citas = new ArrayList<Cita>();

	public Especialidad() {
		super();
	}

	public Especialidad(long idespecialidad, String nombre) {
		super();
		this.idespecialidad = idespecialidad;
		this.nombre = nombre;
	}

	public Especialidad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public List<Cita> getCitas() {
		Collections.sort(citas);
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public long getIdespecialidad() {
		return idespecialidad;
	}

	public void setIdespecialidad(long idespecialidad) {
		this.idespecialidad = idespecialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Especialista> getEspecialistas() {
		return especialistas;
	}

	public void setEspecialistas(List<Especialista> especialistas) {
		this.especialistas = especialistas;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
