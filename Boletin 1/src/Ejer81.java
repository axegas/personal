import java.util.Scanner;

public class Ejer81 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce los numeros para calcular el maximo: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println(mayor(a,b));
		System.out.println(mayor(a,b,c));
		System.out.println(mayor(a,b,c,d));
	}
	public static int mayor(int a, int b) {

		if(a>b) {
			return a;
		}else {
			return b;
		}

	}
	public static int mayor(int a, int b, int c) {
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		return max;
	}public static int mayor(int a, int b, int c, int d) {
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		if(d>max) {
			max=d;
		}
		return max;
	}

}
