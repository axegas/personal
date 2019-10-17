package prueba;

import java.util.Scanner;
public class ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nombre;
		String dni;
		String domicilio;
		String linea;
		float cantidad1;
		float cantidad2;
		float cantidad3;
		float cantidad4;
		float cantidad5;
		String concepto1;
		String concepto2;
		String concepto3;
		String concepto4;
		String concepto5;		
		float precio1;
		float precio2;
		float precio3;
		float precio4;
		float precio5;
		float importe1=0;
		float importe2=0;
		float importe3=0;
		float importe4=0;
		float importe5=0;
		float bruto;
		float total;
		float descuento=0.1f;
		
		
		System.out.println("Introduce el nombre: ");
		nombre = scan.nextLine();
		System.out.println("Introduce el DNI: ");
		dni = scan.nextLine();
		System.out.println("Introduce el domicilio: ");
		domicilio = scan.nextLine();
		
		System.out.println("Introduce el primer producto a comprar: ");
		concepto1 = scan.nextLine();
		System.out.println("Introduce su cantidad: ");
		cantidad1 = scan.nextFloat();
		linea = scan.nextLine();
		System.out.println("Introduce su precio: ");
		precio1 = scan.nextFloat();
		linea = scan.nextLine();
		
		System.out.println("Introduce el segundo producto a comprar: ");
		concepto2 = scan.nextLine();
		System.out.println("Introduce su cantidad: ");
		cantidad2 = scan.nextFloat();
		linea = scan.nextLine();
		System.out.println("Introduce su precio: ");
		precio2 = scan.nextFloat();
		linea = scan.nextLine();
		/*
		System.out.println("Introduce el tercer producto a comprar: ");
		concepto3 = scan.nextLine();
		System.out.println("Introduce su cantidad: ");
		cantidad3 = scan.nextFloat();
		linea = scan.nextLine();
		System.out.println("Introduce su precio: ");
		precio3 = scan.nextFloat();
		linea = scan.nextLine();
		
		System.out.println("Introduce el cuarto producto a comprar: ");
		concepto4 = scan.nextLine();
		System.out.println("Introduce su cantidad: ");
		cantidad4 = scan.nextFloat();
		linea = scan.nextLine();
		System.out.println("Introduce su precio: ");
		precio4 = scan.nextFloat();
		linea = scan.nextLine();
		
		System.out.println("Introduce el quinto producto a comprar: ");
		concepto5 = scan.nextLine();
		System.out.println("Introduce su cantidad: ");
		cantidad5 = scan.nextFloat();
		linea = scan.nextLine();
		System.out.println("Introduce su precio: ");
		precio5 = scan.nextFloat();
		linea = scan.nextLine();
		*/
		importe1 = cantidad1*precio1;
		importe2 = cantidad2*precio2;/*
		importe3 = cantidad3*precio3;
		importe4 = cantidad4*precio4;
		importe5 = cantidad5*precio5;
		*/
		bruto = importe1+importe2+importe3+importe4+importe5;
		total = bruto-bruto*descuento;		
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Cliente: " + nombre + "\t\t\tDNI: " + dni);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Cantidad\tConcepto\t\t\tPrecio\t\tImporte");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(cantidad1+"\t\t"+concepto1+"\t\t\t\t\t"+precio1+"\t\t"+importe1);
		System.out.println(cantidad2+"\t\t"+concepto2+"\t\t\t\t\t"+precio2+"\t\t"+importe2);
		/*
		System.out.println(cantidad3+"\t\t\t"+concepto3+"\t\t\t\t\t"+precio3+"\t\t"+importe3);
		System.out.println(cantidad4+"\t\t\t"+concepto4+"\t\t\t\t\t"+precio4+"\t\t"+importe4);
		System.out.println(cantidad5+"\t\t\t"+concepto5+"\t\t\t\t\t"+precio5+"\t\t"+importe5);
		*/
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("\t\t\tTotal Bruto: "+bruto+"\t Descuento: "+(descuento*100)+"% \tTotal: " + total);
		
		

	}

}
