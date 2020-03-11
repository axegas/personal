package Zoo;

public class Animal {
	
	private String tipo;
	private String nombre;
	private int peso;
	
	public Animal(String tipo, String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
		if(tipo.equals("t")) {
			this.tipo = "Tigre";
		}else {
			this.tipo = "Leon";
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String toString() {
		return tipo + " de nombre " + nombre + " y peso " + peso + "Kg.";
	}
}
