import java.util.Scanner;

public class Reto_100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int[] numeros = new int[casos];
		int[] num = new int[4];
		for(int i=0;i<casos;i++)
			numeros[i]=scan.nextInt();
		
		
		

		

	}
	
	
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "\t");
		}
	}

}
