import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer70 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		boolean vic=false;

		char m[][] = new char[4][4];
		boolean victoria=false;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]='-';
				}
		}
		
		
		do {
			m = introduceChar(m);
			System.out.println("Tu jugada:");
			muestraMatriz(m);
			vic=pruebaVictoria(m, 'X');
			m = introduceCharAleatorio(m);
			System.out.println("Mi jugada");
			muestraMatriz(m);
			vic=pruebaVictoria(m, '0');
			
			
		}while(quedaSitio(m));
					
	
		
		
		
		
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
				}while(x<0 | x>3 | y<0 | y>3);
			}while(m[x][y]!='-');
		m[x][y]='X';
		return m;
		}
	public static char[][] introduceCharAleatorio(char[][] m) {
		int posx;
		int posy;
		do {
			posx = ThreadLocalRandom.current().nextInt(0,4);
			posy = ThreadLocalRandom.current().nextInt(0,4);
			if(m[posx][posy]=='-') {
				m[posx][posy]='0';
				break;
				}
			}while(quedaSitio(m));
		return m;
		}
	
	public static boolean quedaSitio(char[][] m) {
		boolean queda = false;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(m[i][j]=='-') {
					queda = true;
					}
				}
			}
		return queda;
		}
	public static boolean pruebaVictoria(char[][] m, char c) {
		boolean victoria=false;
		
		for(int i=0;i<m.length && !victoria;i++) {
			if(m[i][0]==c) {
				for(int j=0;j<m.length && !victoria;j++) {
					if(m[i][j]!=c) {
						victoria=false;
					}else {
						victoria=true;
					}
				}
				if(victoria==true) {
					break;
				}
			}
		}
		if(victoria) {
			return true;
		}
		for(int i=0;i<m.length && !victoria;i++) {
			if(m[0][i]==c) {
				for(int j=0;j<m.length && !victoria;j++) {
					if(m[j][i]!=c) {
						victoria=false;
					}else {
						victoria=true;
					}
				}
				if(victoria==true) {
					break;
				}
			}
		}
		if(victoria) {
			return true;
		}
		
		
		
		return true;
		
		
		
		
		

	}
	
	
	}


