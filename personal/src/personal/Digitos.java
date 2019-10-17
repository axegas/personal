package personal;

import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0;
		int x;
		int aux;
		System.out.print("Introduce un número: ");
		x = scan.nextInt();
		aux = x;
		while(aux!=0) {
			n++;
			aux=aux/10;			
		}
		System.out.printf("El número tiene %s digitos\n", n);
		int[] cad = new int[n];
		
		aux = x;
		for(int i=0;i<n;i++) {
			cad[i]=aux%10;
			aux=aux/10;			
		}		
		for(int i=0;i<n;i++) {
			System.out.println(cad[i]);
		}
		
		

	}

}
