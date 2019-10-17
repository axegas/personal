package iesserpis.ed;


import java.util.Scanner;

public class HolaMundo {	

	public static void muestraHola() {
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Inserte su nombre: ");
		String nombre = scanner.nextLine();	
		System.out.print("Inserte su edad: ");
		int edad = scanner.nextInt();
		
		
		
		System.out.println("Hola " + nombre + ". El año que viene tendras " + (edad+1));
		
		return;
	
	}

}
