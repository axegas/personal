package prueba;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a;
		float b;
		float c;
		float dentro_raiz;
		float raiz;
		float resultado1;
		float resultado2;
		
		System.out.print("Introduce el valor de a: ");
		a = scan.nextFloat();
		System.out.print("Introduce el valor de b: ");
		b = scan.nextFloat();
		System.out.print("Introduce el valor de c: ");
		c = scan.nextFloat();
		
		dentro_raiz=b*b - 4*a*c;
		raiz = (float) Math.sqrt(dentro_raiz);
		resultado1 = (-b-raiz)/2*a;
		resultado2 = (-b+raiz)/2*a;
		
		System.out.println("El resultado de la ecuacion con la raiz positiva es: " + resultado2);
		System.out.println("El resultado de la ecuacion con la raiz negativa es: " + resultado1);
		
		
		
		

	}

}
