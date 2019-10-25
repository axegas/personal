package iesserpis.ed;
import java.util.Scanner;

import matematicas.Matematicas;

public class PruebaMat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n2;
		System.out.print("Inserta un numero: ");
		int n = scan.nextInt();
		do {
		System.out.print("Dime la posición del número: ");
		n2 = scan.nextInt();
		if(n2>Matematicas.digitos(n)) System.out.println("El nº de dígitos es incorrecto");
		}while(n2>Matematicas.digitos(n));
		
		int num=digitoN(n, n2);
		System.out.print(num);	
	}
	
	
	public static int digitoN(int digito, int n) {
		int pos=0;
		for(int i=0;i<n;i++) {
			pos = digito%10;
			digito=digito/10;			
		}		
		return pos;
	}

}
