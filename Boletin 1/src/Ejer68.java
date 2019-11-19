import java.util.Scanner;

public class Ejer68 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la cadena: ");
		String cadena = scan.nextLine();
		
		char a[] = new char[cadena.length()];
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==' ') {
				a[i]='@';
			}else
				a[i]=cadena.charAt(i);
		}
		
		System.out.println("Introducimos la cadena en el vector:");
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			if(i!=a.length-1) {
				System.out.print(a[i] + ", ");
			}else {
				System.out.print(a[i]);

			}
		
		}
		System.out.println("]");

	}

}
