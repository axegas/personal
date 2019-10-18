package personal;
/*
Autor: Axel Perez Gaspar
Fecha: 18/10/2019
Programación 1º DAM

Descripción: muestra los pares de un determinado número
 */
import java.util.Scanner;

public class Ejer40 {

	public static void main(String[] args) {
		//declaración de variables
		int n;
		Scanner scan = new Scanner(System.in);
		
		//pide el número al usuario
		System.out.print("Introduce un entero: ");
		n = scan.nextInt();
			
		//ejecución
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				if(i<=j)//condición para que no muestre los pares inferiores al número que se está evaluando en ese momento
					System.out.printf("Par %s,%s: %s+%s+2*%s*%s = %s\n",i,j,i,j,i,j,(i + j + 2*i*j));		
	}
}