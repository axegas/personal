package personal;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numMax = 0;
		int numMin = 0;
		int suma = 0;
		Random r=new Random();
			
		System.out.print("Introduzca el tamaño del array: ");
		int tam = scan.nextInt();
		int[] cad = new int[tam];
		System.out.print("Introduzca limites inferior y superior: ");
		numMin = scan.nextInt();
		numMax = scan.nextInt();
		
		for(int i=0;i<tam;i++) {
			cad[i]=getNumeroRandom(numMin,numMax);
			suma += cad[i];
		}
		
		System.out.printf("Se ha generado el siguiente array de %s elementos\n", tam);
		muestraArray(cad);		
		
		System.out.println("Suma: " + suma);

	}
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.printf("[%s]\t\n", array[i]);
		}
	}
	private static int getNumeroRandom(int min, int max){
	       return ThreadLocalRandom.current().nextInt(min, max);
	   }
	}
