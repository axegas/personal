package ejercicio95b;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PacoAirways {

	private static int contador=0;
	
	private String origen;
	private String destino;
	private String FechaSalida;
	private String FechaLlegada;
	private int codigo;
	private String estado="";
	private String HoraLlegada;
	private String HoraSalida;
	private String sSalida;
	private String sLlegada;
	private Date salida;
	private Date llegada;
	
	
	
	private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
		
	public PacoAirways(String or, String des, String FechaSal, String HoraSalida, String FechaLlegada, String HoraLlegada) throws Exception{
		this.HoraLlegada = HoraLlegada;
		this.HoraSalida = HoraSalida;
		this.FechaLlegada = FechaLlegada;
		this.FechaSalida = FechaSal;
		sSalida = FechaSal + " " + HoraSalida;
		sLlegada = FechaLlegada + " " + HoraLlegada;
		salida = formato.parse(sSalida);
		llegada = formato.parse(sLlegada);
		
		
		origen = or;
		destino = des;
		contador++;
		codigo = contador;		
		
		
		
	}
	
	public String toString(char op) {
		return codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado;			
	}	
	
	public void cancelar() {
		estado="CANCELADO";
	}
	public String getEstado() {
		return estado;
	}
	
	public int duración() {
		
		int duracion = (int) (llegada.getTime()-salida.getTime())/86400000;
		
		return duracion;
	}
	
}
