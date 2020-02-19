package PruebaEvaluable;

import java.util.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);		
		
		ArrayList <Luchador> participantes = new ArrayList<Luchador>();
		ArrayList <String> mensajes = new ArrayList<String>();
		int k=1;
		String mensaje;
		
		System.out.print("Cuantos participantes hay? ");
		int cant = scan.nextInt();
		for(int i=0;i<cant;i++) {
			participantes.add(new Luchador("L"+i,"he ganado"));
		}		
		for(int j=0;j<participantes.size();j++) {
			for(int i=j+1;i<participantes.size();i++) {
				Escenario e1 = new Escenario("templo" + j + "-"+i,participantes.get(j),participantes.get(i));
				Luchador ganador = e1.combate();
				mensaje = "El combate nº " + k + " donde compiten los luchadores " + participantes.get(j).getNombre() + " y " + participantes.get(i).getNombre() + " lo ha ganado el luchador " + ganador.getNombre();
				mensajes.add(mensaje);
				if(participantes.get(j).equals(ganador)) {
					participantes.get(j).aumentaVictoriasEnTorneo();
				}else {
					participantes.get(i).aumentaVictoriasEnTorneo();
				}
				k++;
			}
		}		
		for(int i=0; i<mensajes.size();i++) {
			System.out.println(mensajes.get(i));
		}
		
		Luchador ganaTorneo = participantes.get(0);
		for(int i=0;i<participantes.size();i++) {
			System.out.println("El luchador " + participantes.get(i).getNombre() + " ha ganado: " + participantes.get(i).muestraVictoriasEnTorneo() + " veces.");
			if(participantes.get(i).muestraVictoriasEnTorneo()>ganaTorneo.muestraVictoriasEnTorneo()) {
				ganaTorneo = participantes.get(i);
			}			
		}
		System.out.println("El ganador del torneo es: " + ganaTorneo.getNombre());		
	}
}
