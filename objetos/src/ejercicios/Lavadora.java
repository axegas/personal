package ejercicios;
import java.util.*;

public class Lavadora {

	//atributos
	private String color;
	private int revoluciones;
	private String marca;
	private int tamanyo;
	private String codigo = "";
	
	static int contador=0;
	static ArrayList<String> lavadoras= new ArrayList<String>();
		
	//constructor
	public Lavadora(String marc,String col,int rev,int tam) {
		color = col;
		revoluciones = rev;
		tamanyo = tam;
		marca = marc;
		codigo = marca.substring(0, 2).toUpperCase() + col.substring(0, 2).toUpperCase() + contador;
		contador++;
		lavadoras.add(codigo);
	}
	//to String
	public String toString() {
		String str = "La lavadora "+codigo+" es "+color+", tiene "+revoluciones+"rpm y mide "+tamanyo+" metros";
		return str;
	}
	//setters
	public void setColor(String col) {
		color=col;
	}
	//getters
	public String getColor() {		
		return color;
	}
	public String getCodigo() {
		return codigo;
	}
	public ArrayList<String> getCodigos(){
		
		return lavadoras;
	}
	
	
	public void enciende() {
		System.out.println("Encendemos la lavadora");
	}
	
	
	
	
	
	
	
}
