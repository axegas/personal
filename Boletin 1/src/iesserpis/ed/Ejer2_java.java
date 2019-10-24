package iesserpis.ed;

import matematicas.Funciones;

public class Ejer2_java {

	public static void main(String[] args) {
		int fil = 4;
		int col = 5;
		int sumaFil=0;
		int sumaCol=0;
		int total = 0;
		
		int[][] num = new int[fil][col];
		int[] resuFil = new int[fil];
		int[] resuCol = new int[col];
		
		int i,j;
		num = Funciones.rellenaMatriz(num,100,999);
		for(i=0;i<fil;i++) {
			for(j=0;j<col;j++) {
				sumaFil += num[i][j];				
			}
			resuFil[i]=sumaFil;
			total += sumaFil;
			sumaFil=0;
		}
		for(i=0;i<col;i++) {
			for(j=0;j<fil;j++) {
				sumaCol += num[j][i];
			}
			resuCol[i]=sumaCol;
			sumaCol=0;
		}
		
		for( i=0;i<num.length;i++) {
			for( j=0;j<num[i].length;j++) {
				System.out.print(num[i][j] + "\t");
				}
			System.out.println("->" + resuFil[i]);
			}
		System.out.println("----------------------------------------------");
		Funciones.muestraArray(resuCol);
		System.out.println("->" + total);
		
		//Funciones.muestraMatriz(num);
	}

}
