package pizza;

public class Pizza {

	private String tam;
	private String tipo;
	private String estado;
	
	public enum tipopizza
	{
	    Margarita, Funghi, CuatroQuesos, Hawaiana
	}
	public enum tamanyo
	{
	    Mediana, Familiar
	}
	
	public static int totalPedidas=0;
	public static int totalServidas=0;
	
	public Pizza(String tipo, String tam) {
		
		this.tam = tam;
		this.tipo = tipo;
		estado = "Pedida";
		totalPedidas++;	
	}
	
	public Pizza(tipopizza tipo, tamanyo tam) {
		this.tam = tam.toString();		
		this.tipo = tipo.toString();
		estado = "Pedida";
		totalPedidas++;	
	}
	
	public String estadoPizza() {
		return "Pizza de tipo " + tipo + " y tamaño " + tam + ", Estado: " + estado;
	}
	
	public void servir() {
		if(estado.equals("Servida")) {
			System.out.println("Esta pizza ya está servida");
		}else {
			estado = "Servida";
			totalPedidas--;
			totalServidas++;
		}		
	}
	
	
	
	

	
	
	
}
