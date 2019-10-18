package personal;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int j=0;
		int x;
		int y;
		boolean encontrado=false;
		int tamanyo=3;
		String[][] tablero = new String[tamanyo][tamanyo];
		String[][] usuario = new String[tamanyo][tamanyo];
		
		for(i=0;i<tamanyo;i++) {
			for(j=0;j<tamanyo;j++) {
				usuario[i][j]="*";
				tablero[i][j]=" ";
			}
		}
		usuario[0][0]=0 + "";
		
		for(i=0; i<tamanyo-1; i++) {
			usuario[i+1][0]=i+1+"";
			usuario[0][i+1]=i+1+"";
		}		
		i=(int)(Math.random()*tamanyo);
		j=(int)(Math.random()*tamanyo);
		tablero[i][j]="+";
		
		
		do {
			System.out.println("Este es el mapa del tesoro!");
			pintaTabla(usuario,tamanyo);
			/*for(i=0;i<tamanyo;i++) {
				for(j=0;j<tamanyo;j++) {
					System.out.print(usuario[i][j] + "   ");
				}
				System.out.println(" ");
			}*/
			do {
				System.out.print("Introduce la coordenada X: ");
			x = scan.nextInt();
			System.out.print("Introduce la coordenada Y: ");
			y = scan.nextInt();
			}while(x>tamanyo-1 || x<1 || y>tamanyo-1 || y<1);
			if(tablero[x][y]=="+") {
				System.out.println("Has encontrado el tesoro!");
				/*for(i=0;i<tamanyo;i++) {
					for(j=0;j<tamanyo;j++) {
						System.out.print(tablero[i][j] + "   ");
					}
					System.out.println(" ");
				}*/
				pintaTabla(tablero,tamanyo);
				encontrado=true;
				}else {
					System.out.println("Vuelve a intentarlo!");
					usuario[x][y]=" ";
				}
		
		}while(encontrado==false);		

	}
	
	

	private static void pintaTabla(String[][] tabla, int tamanyo) {
		int i,j;
		for(i=0;i<tamanyo;i++) {
			for(j=0;j<tamanyo;j++) {
				System.out.print(tabla[i][j] + "   ");
			}
			System.out.println(" ");
		}
		
	}

}
