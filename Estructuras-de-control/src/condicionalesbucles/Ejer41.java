package condicionalesbucles;

import java.util.Scanner;

public class Ejer41 {

	public static void main(String[] args) {
		int base;
		int exponente;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		base = scan.nextInt();
		System.out.print("Introduce el exponente: ");
		exponente = scan.nextInt();
		int r=1;
		
		for(int i=0;i<exponente;i++) {
			r=r*base;
			}
		System.out.println(r);
	}

}
