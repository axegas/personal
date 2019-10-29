package personal;

import java.util.Scanner;

public class Ejer55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dni;
		System.out.print("Introduce los numeros de tu DNI: ");
		dni = scan.nextInt();
		int resto = dni%23;
		
		char[] array = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println(array.length + " " + resto);
		
		String DNI = dni + "" + array[resto];
		System.out.println(DNI);

	}

}
