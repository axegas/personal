import java.util.Scanner;

//11-12-2019
//PROGRAMACIÓN
//1º DAM
//PROGRAMA: MUESTRA LOS DIVISORES DE UN NÚMERO LEIDO POR TECLADO
//Axel Perez y Kevin Rosales

public class Ejer82 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número para calcular sus divisores:");
		int n = scan.nextInt();
		System.out.print("Los divisores son: ");
		muestraDivisores(n,n);
		

	}
	public static void muestraDivisores(int n, int i) {
		
		if(i==1) {
			System.out.print(i);
		}else {
			if(n%i==0) {
				System.out.print(i + ", ");
			}
			muestraDivisores(n,i-1);
		}		
	}

}
