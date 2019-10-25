package personal;

import java.util.Scanner;

public class Reto_149 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; 
		int vel=0;
		
		String string;
		String[] parts;	
		
		while(true) {
			string = scan.nextLine();
			parts = string.split(" ");
			for(int i = 1; i<parts.length;i++) {
				n = Integer.parseInt(parts[i]);
				if(n>vel) {
					vel=n;
					}
				}
			System.out.println(vel);
			if()
			
			
			
		}
		

		}	
	}