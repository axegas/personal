package iesserpis.ed;

import java.util.Scanner;

public class Reto166 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int canal1;
		int canal2;
		int resta1;
		int resta2;
		int optima;
		
		canal1 = scan.nextInt();
		canal2 = scan.nextInt();
		while(canal1!=0 | canal2!=0) {
			if(canal1 != 0 & canal2!=0) {
				resta1 = canal2 - canal1;
				resta2 = canal1 + (99-canal2);
				if(resta1<0) {
				resta1 = 99+resta1;
			}
			if(resta1<resta2) {
				optima = resta1;
			}else {
				optima = resta2;
			}
			System.out.println(optima);
			}
			canal1 = scan.nextInt();
			canal2 = scan.nextInt();			
		}
	}
}
