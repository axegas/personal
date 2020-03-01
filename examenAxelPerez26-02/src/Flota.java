/*
 * Axel Perez Gaspar
 * 26-02-2020
 * 
 * Paco wars
 * 
 */

import java.util.*;
import javax.swing.JOptionPane;

public class Flota {
	
	private String nombre;
	private ArrayList<Nave> naves = new ArrayList<Nave>();
	private int numNaves = 0;
	
	public Flota(String nombre) {
		this.nombre=nombre;
	}
	
	public void meteNave(Nave nav) {
		naves.add(nav);
		numNaves++;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getNaves() {
		return numNaves;
	}
	public String verFlota() {
		String str = "";
		Iterator<Nave> iter = naves.iterator();
		while(iter.hasNext()) {
			str += iter.next().getNave() + "\n";				
		}
		return str;
	}
}
