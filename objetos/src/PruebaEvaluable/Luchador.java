package PruebaEvaluable;

import java.util.Random;

public class Luchador {
	
	private int vida;
	private String nombre;
	private int victorias;
	private String mensaje;
	private boolean ganador;
	private static int contador=0;
	private String cod;
	private int victoriasEnTorneo=0;
	

	public Luchador(String nombre, String mensaje) {
		this.nombre = nombre;		
		this.vida=100;
		this.victorias = 0;
		this.mensaje = mensaje;
		this.ganador = false;
		contador++;
		cod=nombre + "-" + contador;
	}
	public String getCod() {
		return cod;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int x) {
		vida = x;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int golpe(Luchador l) {
		Random r = new Random();
		int ran = (int) (r.nextDouble()*100+1);
		if((l.getVida()-ran)<0) {
			l.setVida(0);
		}else {
			l.setVida(l.getVida()-ran);
		}
		
		return ran;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void ganaRound() {
		victorias++;
	}
	public boolean getGanador() {
		return ganador;
	}

	public void setGanador(boolean gana) {
		this.ganador=gana;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias() {
		victorias = 0;
	}
	/*
	public boolean equals(Luchador l) {
		if(this.cod.equals(l.getCod())) {
			return true;
		}else {
			return false;
		}		
	}*/
	public void aumentaVictoriasEnTorneo() {
		victoriasEnTorneo++;
	}
	
	public int muestraVictoriasEnTorneo() {
		return victoriasEnTorneo;
	}
	
	
	
	
}
