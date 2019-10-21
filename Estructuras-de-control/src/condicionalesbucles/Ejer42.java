package condicionalesbucles;

import java.util.Scanner;

public class Ejer42 {

	public static void main(String[] args) {
		int horas=0;
		int extra=0;
		float pago=0;
		float salario=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce las horas semanales: ");
		horas = scan.nextInt();
		System.out.print("Introduce el precio por hora: ");
		pago = scan.nextInt();
		
		if(horas>40) {
			extra=horas-40;
		}
		salario = (float) (horas*pago + extra*(pago*1.5));
		
		System.out.println("Tu sueldo es: " + salario);
	}

}
