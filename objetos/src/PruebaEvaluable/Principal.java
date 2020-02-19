package PruebaEvaluable;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
				
		Luchador l1 = new Luchador("Ken", "He ganado, Eres un paquete.");
		Luchador l2 = new Luchador("Ryu", "He ganado, ves a llorarle a tu madre.");
		Luchador l3 = new Luchador("Mr Bison", "He ganado, a la proxima vuelves.");
		
		Escenario e1 = new Escenario("El templo de Pekin",l1,l2);	
		Luchador ganador = e1.combate();
		Escenario e2 = new Escenario("Bison Mansion",ganador,l3);
		Luchador ganaTorneo = e2.combate();	
		System.out.println("El ganador del torneo es: " + ganaTorneo.getNombre());
	}

}
