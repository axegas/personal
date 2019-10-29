package personal;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer53 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				 
		int numMax=100;
		int numMin=1;
		int contador=0;
		int rand = getNumeroRandom(numMin, numMax);		
		int n;
		int i;
		
		System.out.println("Adivina el numero magico!");
		System.out.println("Introduce un numero entre el "+ numMin + " y el "+ numMax);

		
		while(true) {
			n= PruebaError();
			contador++;
			i = Integer.valueOf(n).compareTo(rand);
			
			if(i==0) {
				System.out.println("Enorabuena! has acertado el número " + rand + " en " + contador + " intentos");
				break;				
			}else
				if(i<0) {
					System.out.println("Has introducido un numero menor, busca uno mayor.");
				}else {
					System.out.println("Has introducido un numero mayor, busca uno menor.");
				}	
		}

		}
	public static int PruebaError() {	
		Scanner scan = new Scanner(System.in);	
		try {
			int n = scan.nextInt();
			return n;
		} catch (InputMismatchException e) {
			System.out.println("No introdujiste un número válido");
			return -1;
		}

	}
	private static int getNumeroRandom(int min, int max){
	       return ThreadLocalRandom.current().nextInt(min, max);
	   }
	}
