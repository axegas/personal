package personal;

import java.util.Scanner;

public class Reto_117 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int personas = scan.nextInt();
		scan.nextLine();
		String nombre;
		String soy;
		
		for(int i=0;i<personas;i++) {
			soy = scan.next();
			nombre = scan.next();
			System.out.println("Hola, " + nombre + ".");	
			}
		}
	}