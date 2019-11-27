import java.util.Scanner;

import matematicas.Matematicas;

public class Ejer71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador=0;
		int num;
		
		System.out.print("Introduce un número: ");
		num = scan.nextInt();
		if(Matematicas.esPrimo(num)) System.out.println("El numero es primo.");
		else System.out.println("El numero no es primo.");
		
		System.out.println("==============");
		System.out.println("del 2 al 1000");
		System.out.println("==============");
		for(int i=2;i<1000;i++) {
			if(Matematicas.esPrimo(i)) {
				System.out.print(i + " ");
				contador++;
				}
			if(contador==4) {
				System.out.println("");
				contador=0;
				}			
		}
	}

}
