/*
Nombre: Axel Perez
1º DAM
Gestionar una cola de cine utilizando Queue.
*/

import java.util.*;

public class Ejer93 {

	public static void main(String[] args) {
		Queue<String> cola = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		String colacine = "";
		String personas;
		int pers = 0;

		String[] vec;
		
		do {//introducir personas en la cola
			System.out.println("Introduzca nombres para ENTRAR separados por @, 'nadie' para que no entre nadie o 'salir' para finalizar el programa:");
			colacine = scan.nextLine();
			colacine = colacine.toLowerCase();
			if(colacine.equals("salir")) {
				break;
			}else {
				if(!colacine.equals("nadie")) {
					vec = colacine.split("@");
					for(int i=0;i<vec.length;i++) {//añade los nombres, separándolos por la @ 
						cola.add(vec[i]);
					}
					muestraCola(cola,"ENTRAR");
				}
				do {//sacar personas de la cola
					System.out.println("Introduzca nº de personas para SALIR de la cola:");
					personas = scan.nextLine();
					personas = personas.toLowerCase();
					if(personas.equals("salir")) {
						break;
						
					}else {
							pers = Integer.parseInt(personas);
							if(pers>cola.size()) {
								System.out.println("No pueden salir " + pers + " personas porque en la cola hay " + cola.size() + " personas.");
							}
							else {
								for(int i=0;i<pers;i++) {
									System.out.println("Sale de la cola " + cola.element());
									cola.remove();									
								}
								muestraCola(cola,"SALIR");
							}
							break;							
						}
						
					}while(true);				
			}			
		}while(!colacine.equals("salir"));
		
	}
	public static void muestraCola(Queue<String> cola, String accion) {//muestra el estado de la cola
		Iterator<String> iter = cola.iterator();
		System.out.println("Estado de la cola después de " + accion + ":");
		while(iter.hasNext()) {
			System.out.println(iter.next());									
		}	
	}
	
}

