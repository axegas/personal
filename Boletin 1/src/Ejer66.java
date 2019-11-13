import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 Nombre: Axel Perez
 Fecha: 13/11/2019
 Trabajo con matrices y clases envolventes.
 */

public class Ejer66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//pedir los valores con los que trabajar
		System.out.print("Introduce las filas: ");
		int x=scan.nextInt();
		System.out.print("Introduce las columnas: ");
		int y=scan.nextInt();
		System.out.print("Introduce el mínimo de los valores: ");
		int min=scan.nextInt();
		System.out.print("Introduce el máximo de los valores: ");
		int max=scan.nextInt();
		
		String salida = "";
		int num = 0;
		int error = 0;
		int con = 0; //contador. 0 si el valor no está en la matriz, 1 en caso contrario
		scan.nextLine();
	
		int[][] m = new int[x][y];
		m = rellenaMatriz(m,min,max);
		muestraMatriz(m);
		
		do {		
			System.out.print("Introduce el número que quieres buscar: ('salir' para salir)");
			salida = scan.nextLine();
			if(salida.equals("salir")) { //condición de salida
				break;
			}
			
			num = Integer.parseInt(salida);
			
			
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[i].length;j++) {
					if(num==m[i][j]) {
						System.out.printf("El número %s está en la posición (%s,%s)\n",num,i,j);
						con = 1;
					}
				}
			}
			if(con==0) System.out.println("El valor no está en la matriz");
			
		}while(!salida.equals("salir"));		
			
		

	}
	//rellena la matriz de números aleatorios
	public static int[][] rellenaMatriz(int[][] matriz, int min, int max) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]= getNumeroRandom(min,max);
				}
			}
		return matriz;
		}
	
	//devuelve un número aleatorio
	public static int getNumeroRandom(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max+1);
		}
	
	//muestra la matriz por pantalla
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