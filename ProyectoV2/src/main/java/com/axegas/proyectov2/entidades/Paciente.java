package com.axegas.proyectov2.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Paciente implements Comparable<Paciente> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idpaciente;
	
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
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fecha_nacimiento;
	
	private String diagnostico;
	
	@OneToMany(mappedBy = "paciente")
    private List<Factura> facturas = new ArrayList<Factura>();
	
	@OneToMany(mappedBy = "paciente")
    private List<Cita> citas = new ArrayList<Cita>();
		
	public Paciente() {
		super();
	}
	
	public Paciente(String nombre, String dni, int telefono, Date fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public Paciente(long idpaciente, String nombre, String dni, int telefono, Date fecha_nacimiento, String diagnostico) {
		super();
		this.idpaciente = idpaciente;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.diagnostico = diagnostico;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public long getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(long idpaciente) {
		this.idpaciente = idpaciente;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	@Override
	public String toString() {
		return dni + " - " + nombre;
	}

	@Override
	public int compareTo(Paciente o) {
		return getFecha_nacimiento().compareTo(o.getFecha_nacimiento());
	}
	
}
