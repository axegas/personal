package prueba;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		String cadena = "";
		
		System.out.println("introduce un entero");
		numero = scan.nextInt();
		cadena = scan.nextLine();
		
		System.out.println("introduce una cadena");
		cadena = scan.nextLine();
		
		
	}

}
