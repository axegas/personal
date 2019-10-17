package condicionalesbucles;

import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = scan.nextInt();
		
		if((num1>0 && num2>0) || (num1<0 && num2<0))
			System.out.println("El resultado del producto será positivo.");
		else
			if((num1>0 && num2<0) || (num1<0 && num2>0))
				System.out.println("El resultado del producto será negativo.");
			else
				if(num1==0 || num2==0)
					System.out.println("El resultado del producto será cero.");	
			
	}

}
