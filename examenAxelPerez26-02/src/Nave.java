/*
 * Axel Perez Gaspar
 * 26-02-2020
 * 
 * Paco wars
 * 
 */

import java.util.*;

import javax.swing.JOptionPane;

public class Nave {

	private String nombre;
	private int numTripulantes = 0;
	private ArrayList<Tripulante> tripulantes = new ArrayList<Tripulante>();
	private String flota = "";
	
	public Nave(String nombre) {
		this.nombre=nombre;		
	}
	
	public void meteTripulante(Tripulante t) {
		tripulantes.add(t);
		numTripulantes++;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String verNave() {
		String str = "";
		Iterator<Tripulante> iter = tripulantes.iterator();
		while(iter.hasNext()) {
			str += iter.next().getTripulante() + "\n";						
		}
		return str;
	}
	
	public int getTripulantes() {
		return numTripulantes;
	}
	public String getNave() {
		return "\t- " + nombre;
	}
	
	public void meteFlota(String f) {
		flota = f;
	}
	
	public String getFlota() {
		return flota;
	}
	
	
	
}
