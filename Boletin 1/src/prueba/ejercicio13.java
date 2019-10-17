package prueba;

public class ejercicio13 {

	public static void main(String[] args) {
		int entrada;
		int refresco;
		int dulces;
		int palomitas;
		
		int patricia;
		int elena;
		int oscar;
		int total;
		
		entrada=9;
		palomitas=6;
		refresco=palomitas/2;
		dulces=(int) Math.pow(refresco, 3);
		
		patricia=entrada+palomitas+refresco+dulces;
		elena = patricia;
		oscar = entrada + refresco;
		
		total = patricia+elena+oscar;
		
		
		System.out.println("Patricia ha gastado "+patricia+" euros");
		System.out.println("Elena ha gastado "+elena+" euros");
		System.out.println("Oscar ha gastado "+oscar+" euros");
		
		System.out.println("En total la broma les ha salido por "+total+" euros");
		


	}

}