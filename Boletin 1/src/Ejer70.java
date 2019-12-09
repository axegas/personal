import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer70 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	

		System.out.print("Introduce tamaño: ");
		int tam=scan.nextInt();
		char m[][] = new char[tam][tam];
		boolean victoria=false;
		
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				m[i][j]='-';
				}
		}
		
		
		do {
			m = introduceChar(m);
			System.out.println("Tu jugada:");
			muestraMatriz(m);
			if(pruebaVictoria(m, 'X')) {
				System.out.println("Has ganado!");
				victoria=true;
				break;
			}
			m = introduceCharAleatorio(m);
			System.out.println("Mi jugada:");
			muestraMatriz(m);
			if(pruebaVictoria(m, '0')) {
				System.out.println("He ganado!");
				victoria=true;
				break;
			}		
			
		}while(quedaSitio(m));
					
		if(!victoria) {
			System.out.println("Empatados!");
		}
		
		
		
		
	}
	public static void muestraMatriz(char[][] matriz) {	
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + " ");
					}
				System.out.println("");
				}	
			}
	public static char[][] introduceChar(char[][] m) {
		int x;
		int y;
		do {
			do {
				System.out.print("Introduce X: ");
				x = scan.nextInt();
				System.out.print("Introduce y: ");
				y = scan.nextInt();
				}while(x<0 | x>(m.length-1) | y<0 | y>(m.length-1));
			}while(m[x][y]!='-');
		m[x][y]='X';
		return m;
		}
	public static char[][] introduceCharAleatorio(char[][] m) {
		int posx;
		int posy;
		do {
			posx = ThreadLocalRandom.current().nextInt(0,m.length);
			posy = ThreadLocalRandom.current().nextInt(0,m.length);
			if(m[posx][posy]=='-') {
				m[posx][posy]='0';
				break;
				}
			}while(quedaSitio(m));
		return m;
		}
	
	public static boolean quedaSitio(char[][] m) {
		boolean queda = false;
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(m[i][j]=='-') {
					queda = true;
					}
				}
			}
		return queda;
		}
	public static boolean pruebaVictoria(char[][] m, char c) {
		boolean victoria=true;		
		for(int i=0;i<m.length && victoria;i++) {
			if(m[i][0]==c) {
				for(int j=0;j<m.length && victoria;j++) {
					if(m[i][j]!=c) {
						victoria=false;
					}
				}
				if(victoria) {
					return true;
				}
			}
		}		
		victoria = true;
		for(int i=0;i<m.length && victoria;i++) {
			if(m[0][i]==c) {
				for(int j=0;j<m.length && victoria;j++) {
					if(m[j][i]!=c) {
						victoria=false;
					}
				}
				if(victoria) {
					return true;
				}
			}
		}
		
		victoria=true;
		for(int i=0;i<m.length && victoria;i++) {
			if(m[i][i]!=c) {
				victoria=false;
			}
		}
		if(victoria) {
			return true;
		}
		victoria=true;
		for(int i=0;i<m.length && victoria;i++) {
			if(m[i][m.length-1-i]!=c ) {
				victoria=false;
			}
		}
		return victoria;
	}
	
}


