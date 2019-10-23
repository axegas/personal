package personal;

import java.util.Scanner;

public class Alfil {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String[][] tablero = new String[8][8];
		String pos;
		int k=8;
		int x=0;
		int y=0;
		char letra = (char) 97;
		

		for(int i=0;i<8;i++) {
			for(int j=0; j<8; j++) {
				tablero[i][j]=Character.toString(letra)+k;
				letra=(char) (letra+1);
				}
			letra = (char) 97;
			k--;
		}
		
		System.out.print("Introduzca la posición del alfil: ");
		pos = scan.nextLine();
		
		for(int i=0;i<8;i++) {
			for(int j=0; j<8; j++) {
				if(tablero[i][j].equals(pos)) {
					x=i;
					y=j;
					}
				}
			}
		for(int i=x+1;i<8;i++) {
			if((x+y)-i>=0) {
				System.out.print(tablero[i][(x+y)-i]+" ");
				System.out.print(tablero[(x+y)-i][i]+" ");
			}			
		}
		/*
		for(int i=y+1;i<8;i++) {
			if() {
				System.out.print(tablero[(x+y)-i][i]);				
			}
		}*/
		
		
		
		
		
		
		}
	}
