import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Conecta {
	static Scanner scan = new Scanner(System.in);
	public static int x;
	public static int y;
	public static void main(String[] args) {
		
		boolean victoria=false;
		char[][] m = new char[7][7];
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]='-';
				}
		}
		
		do {
			m = introduceChar(m);
			System.out.println("Tu jugada:");
			muestraMatriz(m);
			if(pruebaVictoria(m,'X')) {
				System.out.println("Has ganado!");
				victoria=true;
				break;
			}
			m = introduceCharAleatorio(m);
			System.out.println("Mi jugada:");
			muestraMatriz(m);
			/*if(pruebaVictoria(m, '0')) {
				System.out.println("He ganado!");
				victoria=true;
				break;
			}		
			*/
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
		boolean colocado = false;

		if(quedaSitio(m)) {
		do {
			do {
				System.out.print("Introduce columna: ");
				x = scan.nextInt();				
			}while(x<0 | x>(m[0].length-1));
			for(int i=m.length-1;i>=0;i--) {
				if(m[i][x]=='-') {
					m[i][x]='X';
					y=i;
					colocado=true;
					break;
				}				
			}			
		}while(!colocado);
		
		}
		
				
		
		return m;
		
	}
	
	
	public static char[][] introduceCharAleatorio(char[][] m) {
		boolean colocado = false;

		if(quedaSitio(m)) {
		do {
			x = ThreadLocalRandom.current().nextInt(0,m[0].length);
			for(int i=m.length-1;i>=0;i--) {
				if(m[i][x]=='-') {
					m[i][x]='0';
					y=i;
					colocado = true;
					break;
				}				
			}
		}while(!colocado);
			
		}
			
		return m;
		}
	
	
	
	public static boolean quedaSitio(char[][] m) {
		boolean queda = false;
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]=='-') {
					queda = true;
					}
				}
			}
		return queda;
		}
	public static boolean pruebaVictoria(char[][] m, char c) {
		
		boolean victoria = true;
		for(int i=0;i<m.length;i++) {
			if(m[x][i]=='X') {
				if((m.length-i)>=4) {
					for(int j=i;j<i+4;j++) {
						if(m[x][j]!='X') {
							victoria = false;
							break;
						}
					}
				}
			}
		}
		/*victoria = true;
		for(int i=0;i<m.length;i++) {
			if(m[i][y]=='X') {
				if((m.length-i)>=4) {
					for(int j=i;j<i+4;j++) {
						if(m[j][y]!='X') {
							victoria = false;
							break;
						}
					}
				}
			}
		}*/
		//victoria = true;
		
		
		
		
		
		return victoria;
	}
	
	/*
	public static boolean pruebaVictoria(char[][] m, char c) {
		boolean victoria=false;		
		int k=0;
		int z=0;
		for(int i=0;i<4 && !victoria;i++) {
			if(m[i][k]==c) {
				for(int j=i;j<i+4;j++) {
					if(m[j][k]!=c) {
						break;
					}else {
						z++;
					}
				}
			}

			if(z==4) {
				victoria = true;
			}
			z=0;
			k++;
		}
		
		/*
		
		
		for(int i=0;i<m.length && victoria;i++) {
			if(m[i][0]==c) {
				for(int j=0;j<m[0].length && victoria;j++) {
					if(m[i][j]!=c) {
						victoria=false;
					}
				}
				if(victoria) {
					return true;
				}
			}
		}
		
		
		
		
		return false;
		}
	*/
	
	/*
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
	*/

}
