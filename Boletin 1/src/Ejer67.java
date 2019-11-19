import java.util.Scanner;

import matematicas.Funciones;

public class Ejer67 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int lado;
		int valor=1;
		int i,j,k;
		do {
			System.out.print("Introduce el lado del cuadrado (tiene que ser par)");
			lado = scan.nextInt();
			if(lado%2!=0) System.out.println("El lado tiene que ser par");
			else break;			
		}while(true);
		
		int m[][] = new int[lado][lado];
		
		for(i=0;i<lado;i++) {
			for(j=0;j<lado/2;j++) {
					m[i][j]=valor;
				}
			valor++;
			for(k=lado/2;k<lado;k++) {
				m[i][k]=valor;
			}
			if(i<lado/2-1)
				valor=1;
			else
				valor=3;
		}
		Funciones.muestraMatriz(m);
	}

}
