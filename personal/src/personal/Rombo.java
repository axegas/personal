package personal;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		
		do {
			System.out.print("Por favor, introduce un número impar mayor o igual a 3");
			n=scan.nextInt();
			if(n%2==0 || n<3) System.out.println("El número no es correcto");
		}while(n%2==0 || n<3);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
			}
		}
			

	}

}
