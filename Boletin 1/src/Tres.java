import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tres {
	
	static Scanner scan = new Scanner(System.in);
	static int tam = tamanyo();
	static char[][] tablero = new char[tam][tam];
	static int[][] jugador = new int[tam][tam];
	static int[][] maquina = new int[tam][tam];
		
	public static void main(String[] args) {
		boolean victoria = false;
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
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
	public static boolean validaTuTirada(int x, int y) {
		if(x>=0 & x<(tablero.length) & y>=0 & y<(tablero.length)){
			if(tablero[x][y]!='-') {
				System.out.println("Has introducido una posición errónea!");
				return false;
			}else {
				return true;
			}
		}else {
			System.out.println("Has introducido una posición errónea!");
			return false;
		}			
	}
	public static boolean validaMiTirada(int x, int y) {
		if(tablero[x][y]=='-') {
			return true;
		}		
		return false;		
	}
	
	public static void tuTirada() {
		int x;
		int y;
		do {
			System.out.print("Introduce tu tirada: ");
			x = scan.nextInt();
			y = scan.nextInt();			
		}while(!validaTuTirada(x,y));
		tablero[x][y]='X';
		jugador[x][y]=1;
		
	}
	public static void miTirada() {
		int x;
		int y;
		System.out.println("Mi tirada: ");
		do {
			x = getIntRandom(0,tablero.length-1);
			y = getIntRandom(0,tablero.length-1);			
		}while(!validaMiTirada(x,y));
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
		
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
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
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				sumaFila += num[i][j];
				sumaCol += num[j][i];
				sumaDiag1 += num[j][j];
				sumaDiag2 += num[j][tablero[i].length-1-j];
			}
			if(sumaFila==tablero.length || sumaCol==tablero.length || sumaDiag1==tablero.length || sumaDiag2==tablero.length) {
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
	public static int tamanyo() {
		System.out.print("Introduce el tamaño del tablero: ");
		return scan.nextInt();
	}

}