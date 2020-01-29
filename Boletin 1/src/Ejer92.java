/*
Nombre: Axel Perez
1º DAM
Eurovisión utilizando HashMap.
*/

import java.util.*;

public class Ejer92 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		String pais = "";
		int cont = 3;
		int punt;
		int max = 0;
		String gana = "";
		
		
		System.out.println("¡Bienvenido a Eurovisión!");
				
		do {//bucle para introducir los paises participantes
			System.out.println("Introduzca el nombre del pais " + map.size() +": ");
			pais = scan.nextLine();
			pais = pais.toLowerCase();
			if(pais.equals("salir") && cont<=0) {			
				break;
			}else {
				if(!pais.equals("salir")) {
					punt = (int)(Math.random()*12+1);
					map.put(pais, punt);
					if(punt>max) {
						max = punt;
						gana = pais;
					}	
					
					cont--;
				}else {
					pais = "";
				}				
			}
		}while(!pais.equals("salir"));
		System.out.println("Con las puntuaciones repartidas, el país ganador es: " + gana + " con " + map.get(gana) + " puntos.");
		do {//bucle para hacer auditoria de los puntos de cada pais
			System.out.println("Introduzca el nombre del pais para saber su puntuación: ");
			pais = scan.nextLine();
			pais = pais.toLowerCase();
			if(pais.equals("salir")) {			
				break;
			}else {
				if(map.containsKey(pais)) {
					System.out.println(pais + " ha recibido: " + map.get(pais) + " votos.");
				}else {
					System.out.println(pais + " no ha participado en el festival.");
				}
			}
		}while(!pais.equals("salir"));		
	}
}
