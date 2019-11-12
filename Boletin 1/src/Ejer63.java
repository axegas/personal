import java.util.Scanner;
import matematicas.Funciones;

public class Ejer63 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el tamaño del vector: ");
		int tam = scan.nextInt();
		int[] v = new int[tam];
		int con = 0;
		
		v = Funciones.rellenaArray(v, 0, 100);
		System.out.println("Tu vector es:");
		Funciones.muestraArray(v);
		
		for(int i=0;i<tam-1;i++) {
			if(v[i+1]<v[i]) {
				con = 1;
				break;
			}
		}
		
		if(con==0) {
			System.out.println("El vector está ordenado");
		}else
			System.out.println("El vector no está ordenado");		

	}

}
