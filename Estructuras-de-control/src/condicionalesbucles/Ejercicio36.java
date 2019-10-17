package condicionalesbucles;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float primer;
		float segundo;
		String tercero;
		float media;
		
		System.out.print("Nota del primer control: ");
		primer = scan.nextFloat();
		System.out.print("Nota del segundo control: ");
		segundo = scan.nextFloat();
		
		media = (primer+segundo)/2;
		tercero = scan.nextLine();
		if(media<5) {
			do {
				System.out.print("¿Qual ha sido el resultado de la recuperación? (apto/no apto) ");
				tercero = scan.nextLine();
				}while(!tercero.equals("apto") && !tercero.equals("no apto"));
			if(tercero.equals("apto")) media = 5;
			}	
		System.out.print("Tu nota de programación es " + media);
	}

}
