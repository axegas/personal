package PruebaEvaluable;

import java.util.Random;

public class Luchador {
	
	private int vida;
	private String nombre;
	private int victorias;
	private String mensaje;
	private boolean ganador;
	

	public Luchador(String nombre, String mensaje) {
		this.nombre = nombre;		
		this.vida=100;
		this.victorias = 0;
		this.mensaje = mensaje;
		this.ganador = false;
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
		int ran = (int) (r.nextDouble()*50+1);
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
	/*
	public void setGanador() {
		this.ganador=true;
	}
	*/
	public void setGanador(boolean gana) {
		this.ganador=gana;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias() {
		victorias = 0;
	}
	
	
	
	
	
	
	
}
