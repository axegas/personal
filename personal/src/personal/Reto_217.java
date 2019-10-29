package personal;

import java.util.Scanner;

public class Reto_217 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			n=scan.nextInt();
			if(n!=0)
				if(n%2==0)
					System.out.println("DERECHA");
					else
						System.out.println("IZQUIERDA");
			}while(n!=0);
		
		
	}
}