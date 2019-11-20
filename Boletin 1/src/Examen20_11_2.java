/*
Nombre: Axel Pérez
Fecha: 20/11/2019
-Laberinto Paco-
*/
import java.util.Scanner;

public class Examen20_11_2 {

		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		char letra;
		int posx=0;
		int posy=0;
		char[][] laberinto = new char[4][4];
		int x = 0;
		int y = 0;
		String user;
		
		//pongo las paredes
		laberinto[0][2]='X';
		laberinto[1][0]='X';
		laberinto[2][2]='X';
		laberinto[2][3]='X';
		laberinto[3][0]='X';
		
		System.out.println("Bienvenido al laberinto de Paco!");
		System.out.println("Pulse 'w' para arriba, 's' para abajo, 'a' para izquierda y 'd' para derecha");
		
		do {
			System.out.printf("Estas en la casilla %s,%s. Cual es tu próximo movimiento?\n",x,y);		
			user = scan.nextLine();
			letra = user.charAt(0);
			switch(letra) {
			case 'w'://hacia arriba
				System.out.println("Has pulsado hacia arriba");
				if(x-1<0) {
					System.out.println("ERROR! Nos salimos del tablero.");
				}else {
					if(laberinto[x+1][y]=='X') {
						System.out.println("ERROR! En esa dirección hay una pared.");
					}else {
						x=x-1;
					}
				}				
				break;	
				
			case 's'://hacia abajo
				System.out.println("Has pulsado hacia abajo");
				if(x+1>3) {
					System.out.println("ERROR! Nos salimos del tablero.");
				}else {
					if(laberinto[x+1][y]=='X') {
						System.out.println("ERROR! En esa dirección hay una pared.");
					}else {
						x=x+1;
					}
				}				
				break;
				
			case 'a'://hacia la derecha
				System.out.println("Has pulsado hacia la izquierda");
				if(y-1<0) {
					System.out.println("ERROR! Nos salimos del tablero.");
				}else {
					if(laberinto[x][y-1]=='X') {
						System.out.println("ERROR! En esa dirección hay una pared.");
					}else {
						y=y+1;
					}
				}
				break;
				
			case 'd': //hacia la izquierda
				System.out.println("Has pulsado hacia la derecha");
				if(y+1>3) {
					System.out.println("ERROR! Nos salimos del tablero.");
				}else {
					if(laberinto[x][y+1]=='X') {
						System.out.println("ERROR! En esa dirección hay una pared.");
					}else {
						y=y+1;
					}
				}
				break;
				
			default:
				break;
		}	
			
		}while(x!=3 || y!=3);
		
		if(x==3 && y==3) {
			System.out.println("ENHORABUENA! Has llegado a la casilla 3,3 y por lo tanto has salido del laberinto!");
		}
	}
	
}
