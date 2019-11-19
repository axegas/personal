import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer70 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int win = 0;
		int posx;
		int posy;
		
		char m[][] = new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m[i][j]=' ';
				}
		}
		
		
		//do {
			do {
				do {
					x = scan.nextInt();
					y = scan.nextInt();
					}while(x<0 | x>2 | y<0 | y>2);
				}while(m[x][y]!=' ' & m[x][y]!='0');
			m[x][y]='X';
			
			do {
					posx = ThreadLocalRandom.current().nextInt(0, 2);
					posy = ThreadLocalRandom.current().nextInt(0, 2);
				}while(m[posx][posy]!=' ' & m[posx][posy]!='X');
			m[posx][posy]='0';
			
			muestraMatriz(m);

			
			//}while(win!=-1);
		
	}
	

		public static void muestraMatriz(char[][] matriz) {	
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					System.out.print(matriz[i][j] + "");
					}
				System.out.println("");
				}	
			}
}


