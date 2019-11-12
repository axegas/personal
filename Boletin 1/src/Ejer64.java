import java.util.Scanner;
import matematicas.Funciones;

public class Ejer64 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el tamaño del vector: ");
		int tam = scan.nextInt();
		int m[][]=new int[tam][tam];
		int suma = 0;
		int val = 0;
		int con = 0;
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				m[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0;i<m.length;i++) {
			val += m[0][i];
		}

		System.out.println("val = " + val);
		
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
		System.out.print("suma = " + suma);
		if(con==0)
			System.out.println("El cuadrado es magico");
		else
			System.out.println("El cuadrado no es magico");
	}

}
