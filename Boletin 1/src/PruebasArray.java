import java.util.Arrays;
import java.util.Scanner;

import matematicas.Funciones;

public class PruebasArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el tamaño del vector: ");
		int tam = scan.nextInt();
		int[] v = new int[tam];
		v = Funciones.rellenaArray(v, 0, 100);
		int v2[] = Arrays.copyOf(v, tam);
		Arrays.sort(v2);
		
		System.out.println("Tu vector es:");
		Funciones.muestraArray(v);
		
		if(v==v2) {
			System.out.println("El vector está ordenado");
		}else
			System.out.println("El vector no está ordenado");
		

	}

}
