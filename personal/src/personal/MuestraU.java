package personal;

import java.util.Scanner;

public class MuestraU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce la altura de la U: " );
		n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i==n) {
				for(int j=1;j<=n;j++){
					if(j==1 || j==n) System.out.print(" ");
					else System.out.print("*");
				}
				}else {
					for(int j=1;j<=n;j++){
						if(j==1 || j==n) System.out.print("*");
						else System.out.print(" ");
					}
				}
			System.out.println(" ");		
		}

	}

}
