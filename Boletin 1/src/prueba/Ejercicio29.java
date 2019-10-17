package prueba;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Introduce la frase en minúsculas:");
		frase = scan.nextLine();
		
		System.out.println("\nTu frase en minúsculas es:\t" + frase);
		System.out.println("Y en mayúsculas es:\t" + frase.toUpperCase());
		
		

	}

}
