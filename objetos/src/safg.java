import java.util.HashMap;
import java.util.Scanner;

import kinepolis_hashmap.Salas;

public class safg {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

				
	}
	public static int validaSala(HashMap <Integer, Salas> cine) {
		System.out.println("Que sala?");
		int sala;
		for(;true;) {
			sala = validaEnteros();
			if(sala>cine.size() || sala<1) {
				System.out.println("Introduzca una sala correcta. Valores del 1 al " + cine.size());
			}else {
				break;
			}
		}		
		
		return sala;
	}
	public static int validaEnteros() {
		while(true) {
			try {
				return Integer.parseInt(scan.nextLine());
				
			}catch(NumberFormatException e) {
				System.out.println("Tiene que introducir un número válido.");
				
			}
		}		
		
	}

}


