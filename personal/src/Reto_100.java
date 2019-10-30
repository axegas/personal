import java.util.Scanner;

public class Reto_100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int[] numeros = new int[casos];
		int[] num = new int[4];
		for(int i=0;i<casos;i++)
			numeros[i]=scan.nextInt();
		
		muestraArray(numeros);
		
		kaprekar(numeros[0]);
		
		

	}
	
	
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "\t");
		}
	}
	public static void kaprekar(int num) {
		int ord;
		int[] aux = new int[4];
		for(int i=0;i<4;i++) {
			aux[i]=num%10;
			num/=10;
		}	
	
	}
	public static int[] ordenaArray(int[] array) {
		int[] aux = new int[array.length];
		for(int i=0;i<array.length;i++) {
			
		}
		
		return aux;
	}
	
	
	

}
