package condicionalesbucles;

import java.util.Scanner;

public class Ejer43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int a;
		
		System.out.print("Inserte un número");
		n = scan.nextInt();

		if(n==0)
			n=1;
		else {
			for(a=n-1;a>1;a--) {
				n=n*a;
			}
		}
		System.out.println(n);	
	}

}



