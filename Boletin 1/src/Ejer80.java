import java.util.Scanner;

public class Ejer80 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un numero para pasar a binario: ");
		int num = scan.nextInt();
		System.out.println("El número en binario es: " + decimal2binario(num));
		
		

	}
	/*
	public static int binario(int num) {
		
		String s = "";
			
		if(num>0) {	
			s += num%2;
			return Integer.parseInt(s);
		}else {
			return binario(num/10);
		}		
		


				
	}*/
	public static String binario(int num) {
		
		String s = "";
			
		if(num<2) {
			System.out.print(num);
			return s;		
		}else {
			binario(num/2);
			System.out.print(num%2);
			return s;
		}		
		


				
	}
	public static String decimal2binario(int n) {
		String binario;
		if(n==0) {
			binario = "";
		}else {
			binario = decimal2binario(n/2) + (n%2);
		}
		return binario;
	}
}
		
		

		
		
		
		

