package personal;

public class Ejer_11_java {

	public static void main(String[] args) {
		int[][] num = new int[10][10];
		int[] diagonal = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int media=0;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				num[i][j]=(int)(Math.random()*100+200);
				System.out.print(num[i][j] + "  ");
			}
			System.out.println("  ");
		}
		System.out.println("  \n");
		for(int i=0;i<10;i++) {
			diagonal[i]=num[i][i];
			System.out.print(diagonal[i] + "  ");
			if(diagonal[i]>max) max=diagonal[i];
			if(diagonal[i]<min) min=diagonal[i];
			media=media+diagonal[i];
		}
		
		System.out.println("\nMáximo: " + max);
		System.out.println("Mínimo: " + min);
		System.out.println("Media: " + media/10);		
	}
}


