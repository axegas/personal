package personal;

import java.util.Scanner;

public class Ejer55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce los numeros de tu DNI: ");
		int	dni = scan.nextInt();
		int resto = dni%23;
		
		char[] array = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		String DNI = dni + "" + array[resto];
		System.out.println(DNI);

	}

}
