import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer70 {
	
	static Scanner scan = new Scanner(System.in);
	public static int x;
	public static int y;
	public static int posx;
	public static int posy;
	public static char m[][] = new char[4][4];
	public static int num[][] = new int[4][4];
	
	public static void main(String[] args) {
	
		int win = 0;
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]='-';
				}
		}
		
		
		do {
			introduceChar(m);
			System.out.println("Tu jugada:");
			muestraMatriz(m);
			introduceCharAleatorio(m);
			System.out.println("Mi jugada");
			muestraMatriz(m);
			
		}while(quedaSitio(m));
					
	
		System.out.println("Tu jugada:");
		
		
		
	}
	public static void muestraMatriz(char[][] matriz) {	
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + " ");
					}
				System.out.println("");
				}	
			}
	public static void introduceChar(char[][] m) {
		do {
			do {
				System.out.print("Introduce X: ");
				x = scan.nextInt();
				System.out.print("Introduce y: ");
				y = scan.nextInt();
				}while(x<0 | x>3 | y<0 | y>3);
			}while(m[x][y]!='-');
		m[x][y]='X';
		num[x][y]=10;
		}
	public static void introduceCharAleatorio(char[][] m) {
		do {
			posx = ThreadLocalRandom.current().nextInt(0,4);
			posy = ThreadLocalRandom.current().nextInt(0,4);
			if(m[posx][posy]=='-') {
				m[posx][posy]='0';
				num[posx][posy]=1;
				break;
				}
			}while(quedaSitio(m));
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
	
	
	}


