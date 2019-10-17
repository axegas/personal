package iesserpis.ed;
import java.util.Scanner;

import matematicas.Matematicas;

public class PruebaMat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserta un numero: ");
		int n = scan.nextInt();
		int num=matematicas.Matematicas.digitoN(n, 4);
		System.out.print(num);	
	}

}
