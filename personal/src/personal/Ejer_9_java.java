package personal;

public class Ejer_9_java {

	public static void main(String[] args) {
		int tamano = 3;
		int[][] matriz1 = new int[tamano][tamano];
		int[][] matriz2 = new int[tamano][tamano];
		
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				matriz1[i][j]=(int)(Math.random()*100);
			}
		}
		muestraMatriz(matriz1,tamano);
		System.out.println("  ");
		System.out.println("  ");
		
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				if(j==0 && i!=tamano-1) matriz2[i][j]=matriz1[i+1][j];
				else if(j==0 && i==tamano-1) matriz2[i][j]=matriz1[i][j+1];
				else matriz2[i][j]=matriz1[i][j-1];
			}
		}
		muestraMatriz(matriz2,tamano);
		
	}
	
	
	
	
	
	
	public static void muestraMatriz(int[][] matriz, int tamano) {
		for(int i=0;i<tamano;i++) {
			for(int j=0;j<tamano;j++) {
				if(matriz[i][j]<10) System.out.print("0" + matriz[i][j] + "  ");
				else System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("  ");
		}		
	}
}
