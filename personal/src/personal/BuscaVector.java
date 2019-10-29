package personal;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BuscaVector {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int v[] = new int[10];
		int i;
		System.out.print("Introduce el número a buscar: ");
		int x = scan.nextInt();
		int posicion;

		for(i=0; i<v.length;i++) {
			v[i] = ThreadLocalRandom.current().nextInt(1, 10);			
		}
		posicion = indexOf(v,x);
		
		if(posicion!=-1) System.out.println("El número está en la posición " + posicion);
		else System.out.println("El número no está en el vector.");
		
		for(i=0; i<v.length;i++) {
			System.out.print(v[i] + " ");			
		}
	}
	
	
	public static int indexOf(int[] v, int x) {
		for(int i=0;i<v.length;i++) {
			if(v[i]==x) {
				return i;
			}
		}
		return -1;			
	}
}
