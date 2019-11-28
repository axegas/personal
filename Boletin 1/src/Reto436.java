import java.util.Scanner;

public class Reto436 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double edificio;
		double papel;
		int dobladuras =0;
		papel = scan.nextDouble();
		edificio = scan.nextDouble();
		
		papel = papel*Math.pow(10,-6);
		
		while(papel<edificio) {
			papel = papel*2;
			dobladuras++;
		}
		System.out.println(dobladuras);
		

	}

}
