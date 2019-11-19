import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tres {

	static Scanner scan = new Scanner(System.in);
	static char[][] tablero = new char[3][3];
	static int[][] jugador = new int[3][3];
	static int[][] maquina = new int[3][3];
	public static void main(String[] args) {
		boolean victoria = false;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]='-';
			}
		}
		do {
			tuTirada(tablero);
			muestraMatriz(tablero);
			if(ganador(jugador)) {
				System.out.println("Has ganado!");
				victoria = true;
				break;
			}
			if(!cabeValor(tablero)) {
				break;
			}
			miTirada(tablero);
			System.out.println("Mi tirada: ");
			muestraMatriz(tablero);
			if(ganador(maquina)) {
				System.out.println("He ganado!");
				victoria = true;
				break;
			}
			}while(cabeValor(tablero));
		
		if(!victoria) {
			System.out.println("Empatados!");
			}
		}	
		
	
	public static void tuTirada(char[][] m) {
		int x;
		int y;
		do {
			do {
				System.out.print("Introduce tu tirada: ");
				x = scan.nextInt();
				y = scan.nextInt();
				}while(x<0 | x>2 | y<0 | y>2);
		}while(m[x][y]!='-');
		m[x][y]='X';
		jugador[x][y]=1;
		
	}
	public static void miTirada(char[][] m) {
		int x;
		int y;
		do {
			x = getNumeroRandom(0,2);
			y = getNumeroRandom(0,2);			
		}while(m[x][y]!='-');
		m[x][y]='0';
		maquina[x][y]=1;
	}
	public static void muestraMatriz(char[][] matriz) {	
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + "  ");
				}
			System.out.println("");
			}	
		}
	
	public static boolean cabeValor(char[][] m) {
		boolean cabe = false;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(m[i][j]=='-')
					cabe = true;
			}
		}
		return cabe;
		}
	public static int getNumeroRandom(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max+1);
	}
	
	public static boolean ganador(int num[][]) {
		
		int sumaFila = 0;
		int sumaCol = 0;
		int sumaDig1 = 0;
		int sumaDig2 = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sumaFila += num[i][j];
				sumaCol += num[j][i];
			}
			if(sumaFila==3 || sumaCol==3) {
				return true;
			}else {
				sumaFila=0;
				sumaCol = 0;
			}
		}
		for(int i=0;i<3;i++) {
			sumaDig1 += num[i][i];
			sumaDig2 += num[i][2-i];
		}
		if(sumaDig1==3 || sumaDig2==3) {
			return true;
		}else {
			return false;
		}
	}

}
