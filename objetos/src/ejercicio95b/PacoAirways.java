package ejercicio95b;

public class PacoAirways {

	private String origen;
	private String destino;
	private int salida;
	private int llegada;
	private int codigo;
	private static int contador=0;
	private String estado="";
	
	
	public PacoAirways(String or, String des, int sal, int lleg){
		origen = or;
		destino = des;
		salida = sal;
		llegada = lleg;
		contador++;
		codigo = contador;		
	}

	public void mostrar(char op) {
		
		switch(op) {
		case 'C':
			if(estado.equals("CANCELADO")) {
				System.out.println(codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado);
			}
			break;
		case 'V':
			if(estado.equals("")) {
				System.out.println(codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado);
			}
			break;
		case 'T':
			System.out.println(codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado);
			break;			
		default:
			
			break;		
		}		
	}
	
	/*
	public String mostrar(char op) {		
		switch(op) {
		case 'C':
			if(estado.equals("CANCELADO")) {
				return codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado;
				//System.out.println(codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado);
			}
			break;
		case 'V':
			if(estado.equals("")) {
				return codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado;
				//System.out.println(codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado);
			}
			break;
		case 'T':
			return codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado;
			//System.out.println(codigo + ":"+origen+"-"+destino+" IDA: dia "+salida+" VUELTA: dia "+llegada+" "+estado);
			//break;			
		default:
			break;
		}
		return " ";			
	}	
	*/
	
	public void cancelar() {
		estado="CANCELADO";
	}

	
	
}
