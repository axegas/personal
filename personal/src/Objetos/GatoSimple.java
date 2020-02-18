package Objetos;

public class GatoSimple {

	private String color, raza, sexo;
	private int edad;
	private double peso;
	
	//////////////////////////////constructores//////////////////////////////
	public GatoSimple() {//constructor por defecto
		
	}
	public GatoSimple(GatoSimple gato) {//constructor copia
		this.color = gato.getColor();
		this.raza = gato.getRaza();
		this.sexo = gato.getSexo();
		this.edad = gato.getEdad();
		this.peso = gato.getPeso();
		
	}
	public GatoSimple(String sexo, String raza, String color, int edad, double peso){//constructor por parametros
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;		
	}
	//////////////////////////////getters//////////////
	public String getRaza() {
		return raza;
	}
	public String getColor() {
		return color;
	}
	
	public String getSexo() {
		return sexo;
	}
	public int getEdad() {
		return edad;
	}
	public double getPeso() {
		return peso;
	}
	/////////////////////////////setters///////////////////
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/////////////metodos//////////////
	
	
	public void maulla() {
		System.out.println("Miauuu");
	}
	
	public void ronronea() {
		System.out.println("mrrrrrr");
	}
	
	public void come(String comida) {
		if(comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias.");
		}else {
			System.out.println("Lo siento, yo solo como pescado.");
		}
	}
	public void peleaCon(GatoSimple contrincante) {
		if(sexo.equals("hembra")) {
			System.out.println("No me gusta pelear.");
		}else {
			if(contrincante.getSexo().equals("hembra")) {
				System.out.println("No peleo contra gatitas.");
			}else {
				System.out.println("ven aquí que te vas a enterar.");
			}
		}
	}
	
	
	
	
}
