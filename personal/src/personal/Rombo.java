package personal;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		
		do {
			System.out.print("Por favor, introduce un número impar mayor o igual a 3: ");
			n=scan.nextInt();
			if(n%2==0 || n<3) System.out.println("El número no es correcto");
		}while(n%2==0 || n<3);
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
		//		if((j==2 & i==0) | (j==1 & i == 1) | (j==0 & i==2) | ( j==1 & i == 3) | (j==2 & i == 4) | (j==3 & i == 3) | (j==4 & i == 2) | (j==3 & i == 1))
		//			System.out.print("*");
		//		else
		//			System.out.print(" ");
				
			if(j==i-(n/2) || j==i+(n/2) ) System.out.print("*");
			else System.out.print("-");
		
			
			}
			System.out.println(" ");
		}
			

	}

}
