package com.axegas.proyectov2.entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Cita implements Comparable<Cita> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcita;
	
	@ManyToOne
	@JoinColumn(name = "idpaciente")
	private Paciente paciente;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "idespecialidad")
	private Especialidad especialidad;
	
	private String estado;
	
	@OneToOne(mappedBy = "cita", cascade = CascadeType.ALL)
    private Sesion sesion;

	public Cita() {
		super();
		this.estado = "Pendiente";
	}

	public Cita(long idcita, Paciente paciente, Date fecha, Especialidad especialidad, String estado) {
		super();
		this.idcita = idcita;
		this.paciente = paciente;
		this.fecha = fecha;
		this.especialidad = especialidad;
		this.estado = estado;
	}

	public Cita(Paciente paciente, Date fecha, Especialidad especialidad) {
		this.fecha = fecha;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getIdcita() {
		return idcita;
	}

	public void setIdcita(long idcita) {
		this.idcita = idcita;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return fecha + "      -> Paciente: " + paciente + "      -> Especialidad: " + especialidad;
	}

	@Override
	public int compareTo(Cita o) {
		return -1*o.getFecha().compareTo(getFecha()); 
	}
	
}

