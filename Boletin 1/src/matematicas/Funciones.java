package matematicas;

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
	public static int getNumeroRandom(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max+1);
		}
	public static int[][] rellenaMatriz(int[][] matriz, int min, int max) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
					matriz[i][j]= getNumeroRandom(min,max);
				}
			}
		return matriz;
		}
	public static int[] rellenaArray(int[] array, int min, int max) {
	
			for(int j=0;j<array.length;j++) {
					array[j]= getNumeroRandom(min,max);
				}
	
		return array;
		}
	


}
