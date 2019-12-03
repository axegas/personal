import java.util.Scanner;

public class Ejer74 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		imprimeCajaTexto(s);
	}
	public static void imprimeCajaTexto(String s) {

		for(int i=0;i<s.length()+4;i++) {	
			System.out.print("*");			
		}
		System.out.println("");
		for(int j=0;j<s.length()+4;j++) {
			if(j==0 || j==s.length()+3)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");		
		System.out.println("* " + s + " *");
		for(int j=0;j<s.length()+4;j++) {
			if(j==0 || j==s.length()+3)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");	
		for(int i=0;i<s.length()+4;i++) {	
			System.out.print("*");
			
		}
	}

}
