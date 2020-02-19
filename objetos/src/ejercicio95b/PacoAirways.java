package ejercicio95b;

public class PacoAirways {

	private static int contador=0;
	
	private String origen;
	private String destino;
	private int salida;
	private int llegada;
	private int codigo;
	private String estado="";
		
	public PacoAirways(String or, String des, int sal, int lleg){
		origen = or;
		destino = des;
		salida = sal;
		llegada = lleg;
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
	
}
