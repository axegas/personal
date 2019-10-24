package personal;

public class Ejer_9_java {

	public static void main(String[] args) {
		int tamano = 4;
		int[][] matriz1 = new int[tamano+1][tamano-1];
		int[][] matriz2 = new int[tamano+1][tamano-1];
		
		for(int i=0;i<tamano+1;i++) {
			for(int j=0;j<tamano-1;j++) {
				matriz1[i][j]=(int)(Math.random()*100);
			}
		}
		muestraMatriz(matriz1);
		System.out.println("  ");
		System.out.println("  ");
		
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				if(j==0 && i!=tamano-1) matriz2[i][j]=matriz1[i+1][j];
				else if(j==0 && i==tamano-1) matriz2[i][j]=matriz1[i][j+1];
				//else matriz2[i][j]=matriz1[i][j-1];
			}
		}
		
		
		muestraMatriz(matriz2);
		
	}
	
	
	
	
	
	
	public static void muestraMatriz(int[][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]<10) System.out.print("0" + matriz[i][j] + "  ");
				else System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("  ");
		}		
	}
}
