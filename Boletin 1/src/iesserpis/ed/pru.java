package iesserpis.ed;

import java.util.Scanner;

public class pru {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int rand = (int) (Math.random()*10+1);
		boolean esVerdadero=false;
		
		while(esVerdadero==false){
			System.out.println("Introduce un número entre el 0 y el 10");
			n= scan.nextInt();
			if(n==rand) {
				System.out.println("Has acertado!");
				esVerdadero=true;
			}else 
				if(n>10 || n<0) 
					System.out.println("el número no es válido");
				else { 
					if(n>rand) {
						System.out.println("Has introducido un número mayor, busca uno menor.");
					}else
						System.out.println("Has introducido un número menor, busca uno mayor.");
					System.out.println("Vuelve a intentarlo");
				}
		}		
		
	scan.close();
	}
}