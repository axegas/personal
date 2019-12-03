import java.util.Scanner;

public class Ejer76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opc=0;
		int num;
		
		System.out.println("Introduzca un numero:");
		num = scan.nextInt();
		do {
			System.out.println("Introduzca una opcion:");
			System.out.println("1. Factorial:");
			System.out.println("2. Sumatorio:");
			System.out.println("3. Salir:");
			opc = scan.nextInt();
			switch(opc) {
				case 1:
					System.out.println(factorial(num));
					break;
					
				case 2:
					System.out.println(sumatorio(num));
					break;
					
				case 3:
					System.out.println("Gracias por utilizar este menu.");
					break;
					
				default:
					System.out.println("Número incorrecto.");
					break;
					
			}
			
		}while(opc!=3);
	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static int sumatorio(int n) {
		if(n==1)
			return 1;
		else
			return n+sumatorio(n-1);
	}

}
