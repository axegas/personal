package matematicas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Funciones {
	public static void muestraMatriz(int[][] matriz) {	
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]<10) System.out.print("0" + matriz[i][j] + "  ");
				else System.out.print(matriz[i][j] + "  ");
				}
			System.out.println("  ");
			}	
		}
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "\t");
		}
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
	


}
