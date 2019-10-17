package prueba;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Introduce X");
		x = scan.nextInt();
		System.out.println("Introduce y");
		y = scan.nextInt();
		System.out.println("Los valores introducidos son: " + x + " Y " + y);
		
		System.out.println("\t\t Suma\tResta\tProducto\tCociente");
		System.out.println("------------------------------------------------------------");
		System.out.println("x=" + x + "y=" + y + "\t" + (y+x) + "\t" + (x-y) + "\t" + (x*y) + "\t\t" + (x/y));
		System.out.println("------------------------------------------------------------");
		

	}

}
