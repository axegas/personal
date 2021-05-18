package com.axegas.sanitapp.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Factura implements Comparable<Factura>  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idfactura;	
	
	private Date fecha;
	
	private float importe;
	
	@ManyToOne
	@JoinColumn(name = "idpaciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "idespecialista")
	private Especialista especialista;
	
	@ManyToMany
    @JoinTable(name = "factura_tiene_productos",
            joinColumns = @JoinColumn(name = "idfactura", referencedColumnName = "idfactura"),
            inverseJoinColumns = @JoinColumn(name = "idproducto", referencedColumnName = "idproducto"))
    private List<Producto> productos = new ArrayList<Producto>();

	public Factura() {
		this.fecha = new Date();
	}
	
	public Factura(Paciente paciente, Especialista especialista) {
		super();
		this.paciente = paciente;
		this.especialista = especialista;
	}	

	public Factura(long idfactura, Date fecha, Paciente paciente, Especialista especialista, float importe) {
		super();
		this.idfactura = idfactura;
		this.fecha = fecha;
		this.paciente = paciente;
		this.importe = importe;
		this.especialista = especialista;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}

	public long getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(long idfactura) {
		this.idfactura = idfactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Factura [id=" + idfactura + ", fecha=" + fecha + ", paciente=" + paciente + "]";
	}

	@Override
	public int compareTo(Factura o) {
		return o.getFecha().compareTo(getFecha()); 
	}
	
}
