package personal;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer58 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1;
		int max = 6;
		int suma = 0;
		int tamx = 3;
		int tamy = 3;
		int matriz[][] = new int[tamx][tamy];
		
		System.out.printf("El tamaño de la matriz es %s x %s\n",tamx,tamy);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				//matriz[i][j]=getNumeroRandom(min,max);
				matriz[i][j] = scan.nextInt();
				suma += matriz[i][j];
			}
		}
		
		muestraMatriz(matriz);
		
		System.out.print("Suma de todos los elementos: " + suma);

	}
	private static int getNumeroRandom(int min, int max){
	       return ThreadLocalRandom.current().nextInt(min, max);
	   }
	
	public static int[][] rellenaMatriz(int[][] matriz, int min, int max) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
					matriz[i][j]= getNumeroRandom(min,max);
				}
			}
		return matriz;
		}
	
	public static void muestraMatriz(int[][] matriz) {	
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]<10) System.out.print("0" + matriz[i][j] + "  ");
				else System.out.print(matriz[i][j] + "  ");
				}
			System.out.println("  ");
			}	
		}

}
