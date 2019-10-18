package personal;

import java.util.Scanner;

public class Mapa {
	public static void main(String[] args) {
		int tamanyo = 10;
		String[][] cad = new String[tamanyo][tamanyo];
		String[][] cad2 = new String[tamanyo][tamanyo];
		int x = (int) (Math.random()*tamanyo);
		int y = (int) (Math.random()*tamanyo);
		Scanner scan = new Scanner(System.in);
		int x1;
		int y1;
		int i=0;
		int j=0;
		int j2=0;
		boolean encontrado=false;
		
		for(j2=0;j2<tamanyo;j2++) {
			cad[0][j2]=j2 + " ";
			cad[j2][0]=" " + j2  +" ";
			}
		for(i=1;i<tamanyo;i++) {	
			for(j=1;j<tamanyo;j++) {
				cad[i][j]="* ";
				}
			}
		for(i=1;i<tamanyo;i++)
			for(j=1;j<tamanyo;j++)
				cad2[i][j]=" ";
		cad2[x][y]="+";
		do {
			do {
				System.out.println("Encuentra el tesoro!");	
				for(i=0;i<tamanyo;i++) {
					for(j=0;j<tamanyo;j++)
						System.out.print(cad[i][j]);
					System.out.println("");
					}
				System.out.println("Introduce la coordenada X (fila de 1 a "+(tamanyo-1)+"): ");
				x1 = scan.nextInt();
				System.out.println("Introduce la coordenada Y (columna de 1 a 4"+(tamanyo-1)+"): ");
				y1 = scan.nextInt();
				}while(x1>tamanyo-1 || x1<1 || y1>tamanyo-1 || y1<1);
			if(cad2[x1][y1]=="+") {
				System.out.println("Has encontrado el tesoro!");
				encontrado=true;
				}else {
					System.out.println("Ahí no está el tesoro!");
					cad[x1][y1]="  ";
					}
			}while(encontrado==false);
		}
	}

