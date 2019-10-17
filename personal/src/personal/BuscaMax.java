package personal;

import java.util.Scanner;

public class BuscaMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numero = new int[10];
		int maximo;
		int minimo;
		
		for(int i=0;i<10;i++) {
			System.out.print("Introduce un número: ");
			numero[i]=scan.nextInt();
		}
		maximo=numero[0];
		minimo=numero[0];
		
		for(int i=0;i<10;i++) {
			if(numero[i]>maximo) maximo=numero[i];
			if(numero[i]<minimo) minimo=numero[i];
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(numero[i] + "  ");
			if(numero[i]==maximo) System.out.println("maximo");
			else if(numero[i]==minimo) System.out.println("minimo");
			else System.out.println(" ");
		}
		
		
		
		
	}

}
