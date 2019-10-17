package personal;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int j;
		int x;
		int y;
		boolean encontrado=false;
		
		String[][] tablero = new String[4][4];
		String[][] usuario = new String[4][4];
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				usuario[i][j]="*";
				tablero[i][j]=" ";
			}
		}
		
		i=(int)(Math.random()*4);
		j=(int)(Math.random()*4);
		tablero[i][j]="+";
		
		do {
			System.out.println("Este es el mapa del tesoro!");
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					System.out.print(usuario[i][j]);
				}
				System.out.println(" ");
			}
			System.out.print("Introduce la coordenada X: ");
			x = scan.nextInt();
			System.out.print("Introduce la coordenada Y: ");
			y = scan.nextInt();
			if(tablero[x][y]=="+") {
				System.out.println("Has encontrado el tesoro!");
				encontrado=true;
				}else {
					System.out.println("Vuelve a intentarlo!");
					usuario[x][y]=" ";
				}
		
		}while(encontrado==false);
		

	}

}
