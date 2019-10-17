package prueba;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float nota1;
		float nota2;
		float nota3;
		int num;
		String nombre;
		float media;
		
		System.out.print("Introduzca el número de alumno: ");
		num = scan.nextInt();
		nombre = scan.nextLine();
		System.out.print("Introduzca el nombre de alumno: ");
		nombre = scan.nextLine();
		System.out.print("Introduzca la nota1: ");
		nota1 = scan.nextInt();
		System.out.print("Introduzca la nota2: ");
		nota2 = scan.nextInt();
		System.out.print("Introduzca la nota3: ");
		nota3 = scan.nextInt();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Alumno: " + num + "-" + nombre + "\tex.1\tex.2\tex.3\tmedia");
		System.out.println("Notas 1era evaluación\t" + nota1 + "\t" + nota2 + "\t" + nota3 + "\t" + media);
		
		
	}

}
