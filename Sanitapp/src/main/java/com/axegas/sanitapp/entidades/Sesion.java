package com.axegas.sanitapp.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Sesion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idsesion;

	private String descripcion;
	
	@OneToOne
	@JoinColumn(name = "idcita", updatable = false, nullable = false, unique = true)
	private Cita cita;

	@ManyToOne
	@JoinColumn(name = "idespecialista")
	private Especialista especialista;

	private String tratamiento;

	public Sesion() {
		super();
	}

	public Sesion(Cita cita, Especialista especialista) {
		super();
		this.cita = cita;
		this.especialista = especialista;
	}

	public Sesion(long idsesion, String descripcion, Cita cita, Especialista especialista, String tratamiento) {
		super();
		this.idsesion = idsesion;
		this.descripcion = descripcion;
		this.cita = cita;
		this.especialista = especialista;
		this.tratamiento = tratamiento;
	}

	public long getIdsesion() {
		return idsesion;
	}

	public void setIdsesion(long idsesion) {
		this.idsesion = idsesion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public String toString() {
		return "Sesion [idsesion=" + idsesion + ", descripcion=" + descripcion + ", cita=" + cita + ", especialista="
				+ especialista + ", tratamiento=" + tratamiento + "]";
	}
	
}
