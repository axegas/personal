package kinepolis_hashmap;

public class Cliente {

	private String nombre;
	private int edad;
	
	public Cliente(String nom, int ed) {
		nombre = nom;
		edad = ed;
	}
	
	public String verCliente() {		
		return nombre + "," + edad + ".";
	}
}
