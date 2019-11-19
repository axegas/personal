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
			tuTirada();
			muestraTablero();
			if(ganador(jugador)) {
				System.out.println("Has ganado!");
				victoria = true;
				break;
			}
			if(!cabeValor()) {
				break;
			}
			miTirada();
			System.out.println("Mi tirada: ");
			muestraTablero();
			if(ganador(maquina)) {
				System.out.println("He ganado!");
				victoria = true;
				break;
			}
			}while(cabeValor());
		
		if(!victoria) {
			System.out.println("Empatados!");
			}
		}	
		
	
	public static void tuTirada() {
		int x;
		int y;
		do {
			do {
				System.out.print("Introduce tu tirada: ");
				x = scan.nextInt();
				y = scan.nextInt();
				}while(x<0 | x>2 | y<0 | y>2);
		}while(tablero[x][y]!='-');
		tablero[x][y]='X';
		jugador[x][y]=1;
		
	}
	public static void miTirada() {
		int x;
		int y;
		do {
			x = getIntRandom(0,2);
			y = getIntRandom(0,2);			
		}while(tablero[x][y]!='-');
		tablero[x][y]='0';
		maquina[x][y]=1;
	}
	public static void muestraTablero() {	
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				System.out.print(tablero[i][j] + "  ");
				}
			System.out.println("");
			}	
		}
	
	public static boolean cabeValor() {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(tablero[i][j]=='-')
					return true;
			}
		}
		return false;
		}
	
	public static int getIntRandom(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max+1);
	}
	
	public static boolean ganador(int num[][]) {
		
		int sumaFila = 0;
		int sumaCol = 0;
		int sumaDiag1 = 0;
		int sumaDiag2 = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sumaFila += num[i][j];
				sumaCol += num[j][i];
				sumaDiag1 += num[j][j];
				sumaDiag2 += num[j][2-j];
			}
			if(sumaFila==3 || sumaCol==3 || sumaDiag1==3 || sumaDiag2==3) {
				return true;
			}else {
				sumaFila=0;
				sumaCol = 0;
				sumaDiag1 = 0;
				sumaDiag2 = 0;
			}
		}
		return false;		
	}

}
