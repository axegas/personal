package prueba;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia;
		int mes;
		int anyo;
		String DNI;
		String nombre;
		String direccion;
		Float bruto;
		Float retencion;
		Float neto;
		
		System.out.print("Introduce tu fecha de nacimiento en formato AAAA MM DD: ");
		anyo = scan.nextInt();
		mes = scan.nextInt();
		dia = scan.nextInt();
		DNI = scan.nextLine();
		System.out.print("Introduce tu DNI: ");
		DNI = scan.nextLine();
		System.out.print("Introduce tu nombre: ");
		nombre = scan.nextLine();
		System.out.print("Introduce tu dirección: ");
		direccion = scan.nextLine();
		System.out.print("Introduce tu salario bruto: ");
		bruto = scan.nextFloat();
		System.out.print("Introduce tu retencion: ");
		retencion = scan.nextFloat();
		
		neto = bruto - bruto*(retencion/100);
		
		System.out.println("INFORME DEL TRABAJADOR");
		System.out.println("---------------------------------------");
		System.out.println("Nombre........................:\t" + nombre);
		System.out.println("Dirección.....................:\t" + direccion + "\n");
		System.out.println("DNI...........................:\t" + DNI);
		System.out.println("Fecha de nacimiento...........:\t" + dia + " " + mes + " " + anyo + "\n");
		System.out.println("Salario bruto.................:\t" + bruto);
		System.out.println("Retencion.....................:\t" + retencion);
		System.out.println("Salario neto..................:\t" + neto);
		
	}

}
