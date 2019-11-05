package iesserpis.ed;
import java.util.Scanner;

import matematicas.Funciones;

public class Ejer58 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1;
		int max = 6;
		int suma = 0;
		int tamx = 3;
		int tamy = 3;
		int matriz[][] = new int[tamx][tamy];
		//Funciones.rellenaMatriz(matriz, tamx, tamy);
		
		System.out.printf("El tamaño de la matriz es %s x %s\n",tamx,tamy);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				//matriz[i][j]=Funciones.getNumeroRandom(min,max);
				matriz[i][j] = scan.nextInt();
				suma += matriz[i][j];
			}
		}
		
		Funciones.muestraMatriz(matriz);
		
		System.out.print("Suma de todos los elementos: " + suma);
		}
	}


