package personal;
import java.util.Scanner;
/*
Autor: Axel Perez Gaspar
Fecha: 22/10/2019
Programación 1º DAM

Descripción: Muestra una X hecha con asteriscos

 */
public class Reloj {

	public static void main(String[] args) {
		//declaracion de variables
		Scanner scan = new Scanner(System.in);
		int n;		
		
		System.out.print("Por favor, introduzca la altura de la X (número impar mayor o igual que 3: ");
		n = scan.nextInt(); //leer por teclado
		if(n<3 || n%2==0) {//validación: el número tiene que ser impar y mayor o igual que 3 
			System.out.print("Ha introducido un número incorrecto");
		}else {
			for(int i=0;i<n;i++) {//ejecución.
				for(int j=0;j<n;j++) {
					if(j>0 || j<n) System.out.print("*");
					
					else System.out.print(" ");
					}System.out.println(" ");
			}
			
		}

	}

}

