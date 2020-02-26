/*
 * Axel Perez Gaspar
 * 26-02-2020
 * 
 * Paco wars
 * 
 */


public class Tripulante {
	
	private String nombre;
	private String rango;
	private int edad;
	public Tripulante(String nombre, int edad, String rango) {
		this.nombre = nombre;
		this.edad = edad;
		this.rango = rango;		
	}
	
	public String getTripulante() {
		return "-\t" + rango + " " + nombre + " (" + edad + ")";
	}
}
