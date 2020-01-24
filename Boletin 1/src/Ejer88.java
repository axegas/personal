import java.util.*;

public class Ejer88 {

	public static void main(String[] args) {
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		Scanner scan = new Scanner(System.in);
		mapa.put(1,"usuario1");
		mapa.put(2,"usuario2");
		mapa.put(3,"usuario3");
		mapa.put(4,"usuario4");
		mapa.put(5,"usuario5");
		
		int pass;
		String nombre;
		int opor = 3;
		boolean correcto = false;
		
		while(opor>0 && !correcto) {
			System.out.print("Inserte su nombre de usuario: ");
			nombre = scan.nextLine();
			System.out.print("Inserte su contraseña: ");
			pass = scan.nextInt();
			scan.nextLine();
			
			if(mapa.containsKey(pass)) {
				if(mapa.get(pass).equals(nombre)) {
					System.out.println("Ha accedido al área restringida");
					correcto = true;
				}else {
					System.out.println("Error");
					opor--;
				}
			}else {
				System.out.println("Error");
				opor--;
			}			
		}
		if(opor==0) {
			System.out.println("Lo siento, no tienes acceso al área restringida");	
		}
	}
}
