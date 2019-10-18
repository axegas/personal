package personal;

import java.util.Scanner;

public class ComePez {

	public static void main(String[] args) {
		int tamanyo=10;
		Scanner scan=new Scanner(System.in);
		String[][] cad = new String[tamanyo][tamanyo];
		String comer;
		int i,j;
		
		int x;
		int y;
		
		for(i=0;i<tamanyo;i++)
			for(j=0;j<tamanyo;j++)
				cad[i][j]="   ";
		
		for(j=0;j<tamanyo;j++) {
			cad[j][0]="*";
			cad[j][tamanyo-1]=" * ";
			cad[tamanyo-1][j]=" * ";
		}
		
		
		do {
			x=(int) (Math.random()*(tamanyo-2)+1);
			y=(int) (Math.random()*(tamanyo-2)+1);		
			cad[x][y]=" & ";
			for(i=0;i<tamanyo;i++) {
				for(j=0;j<tamanyo;j++)
					System.out.print(cad[i][j]);
				System.out.println("");
				}
			System.out.print("Añadimos un pez? (s/n): ");
			comer=scan.nextLine();
			}while(comer.equals("s"));
		
	}

}
