import java.util.Scanner;
import matematicas.Funciones;

public class Ejer64 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el lado del cuadrado: ");
		int tam = scan.nextInt();
		int m[][]=new int[tam][tam];
		int suma = 0;
		int val = 0;
		int con = 0;
		
		//Funciones.rellenaMatriz(m, 1, 3);
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				m[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0;i<m.length;i++) {
			val += m[0][i];
		}
		
		for (int i=1;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				suma += m[i][j];
			}
			if(suma != val) {
				con = 1;
				break;
			}else {
				suma = 0;
			}
		}

		suma=0;
		if(con==0) {
			for (int i=0;i<m.length;i++) {
				for (int j=0;j<m[i].length;j++) {
					suma += m[j][i];
				}
				if(suma != val) {
					con = 1;
					break;
				}else {
					suma = 0;
					}
				}
			}

		suma=0;
		if(con==0) {
			for (int j=0;j<m.length;j++) {
				suma += m[j][j];
			}
			if(suma != val) {
				con = 1;
			}else {
				suma = 0;
				for (int i=0;i<m.length;i++) {
					suma += m[i][m.length-1];
					}
				if(suma != val) {
					con = 1;
					}
				}
			}
		
		Funciones.muestraMatriz(m);
		if(con==0)
			System.out.println("El cuadrado es magico");
		else
			System.out.println("El cuadrado no es magico");
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
