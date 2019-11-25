import java.util.Scanner;

public class Examen2 {
	
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {		
		
		System.out.print("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		int trans =0;
		int carg = 0;
		int lancha = 0;
		String xS;
		int x;
		int y;
		int aguas=5;
		int disparo = 1;
		int cont = 0;
		char jugador[][] = new char[6][6];		
		char tablero[][] = new char[6][6];
		
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				tablero[i][j] = '_';
				jugador[i][j] = '_';
			}
		}
		do {
			System.out.printf("Introduce la posición del transatlantico %s (max 3): (stop para acabar)",trans+1);
			xS = scan.nextLine();
			if(xS.equals("stop")) {
				break;
				}else {
					x = Character.getNumericValue(xS.charAt(0));
					y = Character.getNumericValue(xS.charAt(2));
					if(x<0 || x>5 || y<0 || y>2) {
						System.out.println("Te sales del tablero.");
					}else {
						if(tablero[x][y] == '_' && tablero[x][y+1] == '_' && tablero[x][y+2] == '_' && tablero[x][y+3] == '_') {
							tablero[x][y] = 'T';
							tablero[x][y+1] = 'T';
							tablero[x][y+2] = 'T';
							tablero[x][y+3] = 'T';
							trans++;
							cont+=4;
						}else {
							System.out.println("Posición ocupada.");
						}
					}
					}
			}while(trans<=3);
		muestraMatriz(tablero);
		do {
			System.out.printf("Introduce la posición del carguero %s (max 3): (stop para acabar)",carg+1);
			xS = scan.nextLine();
			if(xS.equals("stop")) {
				break;
				}else {
					x = Character.getNumericValue(xS.charAt(0));
					y = Character.getNumericValue(xS.charAt(2));
					if(x<0 || x>3 || y<0 || y>5) {
						System.out.println("Te sales del tablero.");
					}else {
						if(tablero[x][y] == '_' && tablero[x+1][y] == '_' && tablero[x+2][y] == '_') {
							tablero[x][y] = 'C';
							tablero[x+1][y] = 'C';
							tablero[x+2][y] = 'C';
							carg++;
							cont+=3;
						}else {
							System.out.println("Posición ocupada.");
							}
						}
					}
			}while(carg<=3);
		muestraMatriz(tablero);
		do {
			System.out.printf("Introduce la posición de la lancha %s (max 5): (stop para acabar)",lancha+1);
			xS = scan.nextLine();
			if(xS.equals("stop")) {
				break;
				}else {
					x = Character.getNumericValue(xS.charAt(0));
					y = Character.getNumericValue(xS.charAt(2));
					if(x<0 || x>5 || y<0 || y>5) {
						System.out.println("Te sales del tablero.");
					}else {
						if(tablero[x][y] == '_') {
							tablero[x][y] = 'L';
							lancha++;
							cont++;
						}else {
							System.out.println("Posición ocupada.");
							}
						}
					}
			}while(lancha<=5);
		muestraMatriz(tablero);
		
		System.out.printf("Hay %s transatlanticos, %s cargueros y %s lanchas\n",trans,carg,lancha);
		muestraMatriz(jugador);
		
		
		do {
			if(cont==0) {
				System.out.println("No hay barcos. Has ganado!");
				break;
			}
			System.out.printf("Introduce el disparo %s: ",disparo);
			disparo++;
			xS = scan.nextLine();
			x = Character.getNumericValue(xS.charAt(0));
			y = Character.getNumericValue(xS.charAt(2));
			if(tablero[x][y]=='_') {
				jugador[x][y]='X';
				//tablero[x][y]='X';
				if(aguas==1) {
					System.out.printf("Le has dado a agua! no te quedan más disparos. Has perdido!\n");
				}else {
					System.out.printf("Le has dado a agua! solo puedes tener %s fallos más\n",aguas-1);
				}				
				aguas--;
			}else {
				if(jugador[x][y]!='_') {
					System.out.println("Ya le has dado a esa posición!");
				}else {
					System.out.println("Le has dado a algo!");
					jugador[x][y] = tablero[x][y];
					cont--;
					if(cont==0) {
						System.out.printf("Has ganado! en solo %s tiradas\n",disparo-1);
					}
				}				
			}			
			muestraMatriz(jugador);
		}while(aguas>0 && cont>0);
	}
	
	public static void muestraMatriz(char[][] matriz) {	
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + "  ");
				}
			System.out.println("  ");
			}	
		}
	
	
	

}