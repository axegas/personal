package prueba;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int primera;
		int central;
		int ultima;
		
		System.out.print("Introduce un número de 3 cifras: ");
		n=scan.nextInt();
		
		primera=n/100;
		central=n%100;
		central=central/10;
		ultima=n%10;
		
		System.out.printf("Primera cifra de %s es: %s\n", n, primera);
		System.out.printf("La cifra central de %s es: %s\n", n, central);
		System.out.printf("La ultima cifra de %s es: %s\n", n, ultima);
		
		

	}

}
