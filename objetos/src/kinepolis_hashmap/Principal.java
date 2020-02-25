package kinepolis_hashmap;

import java.util.*;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Cuantas salas? ");
		int salas = validaEnteros();
		int opc;
		
		HashMap <Integer, Salas> cine = new HashMap<Integer, Salas>();
		for(int i=1;i<=salas;i++) {
			cine.put(i, new Salas());
		}		
		
		do {			
			opc = menu();			
			switch(opc){
			case 1:
				encolarcliente(validaSala(cine),cine);
				break;
			case 2:
				desencolarCliente(validaSala(cine),cine);
				break;
			case 3:
				informacionSala(validaSala(cine),cine);				
				break;
			case 4:
				estadoCine(cine);
				break;
			case 5:
				System.out.println("Muchas gracias.");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;			
			}			
		}while(opc!=5);
	}
	public static void encolarcliente(int num, HashMap <Integer, Salas> cine) {
		System.out.println("Introduzca nombre del nuevo cliente para la cola " + num + ":");
		String nom = scan.nextLine();
		System.out.println("Introduzca su edad: ");
		int ed = validaEnteros();
		cine.get(num).meteCliente(new Cliente(nom,ed));	
		System.out.println("A�adimos a la cola " + num + " el cliente " + nom + " de " + ed + " a�os.");
	}
	
	public static void desencolarCliente(int num, HashMap <Integer, Salas> cine) {
		cine.get(num).borraCliente();
		System.out.println("Desencolamos el primer cliente de la cola " + num);
	}
	
	public static void informacionSala(int num, HashMap <Integer, Salas> cine) {
		System.out.println("La sala " + num + " tiene encolados los siguientes clientes:");
		cine.get(num).verSala();
	}
	
	public static void estadoCine(HashMap <Integer, Salas> cine) {
		
		for(int i=1;i<=cine.size();i++) {
			System.out.println("Clientes en la sala " + i + ":");
			cine.get(i).verSala();
		}
	}
	
	public static int validaSala(HashMap <Integer, Salas> cine) {
		System.out.println("Que sala?");
		int sala = validaEnteros();
		do {			
			if(sala>cine.size() || sala<1) {
				System.out.println("Introduzca una sala correcta. Valores del 1 al " + cine.size());
				sala = validaEnteros();
			}else {
				break;
			}
		}while(true);		
		return sala;		
	}
	
	public static int menu() {	
		System.out.println("1-Encolar");
		System.out.println("2-Desencolar");
		System.out.println("3-Informacion sala");
		System.out.println("4-Estado cine");
		System.out.println("5-Salir");		
		return validaEnteros();
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
