import java.util.Scanner;

public class Reto380 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int gasto = 0;
		int suma = 0;
		int i=0;
		
		do {
			n = scan.nextInt();
			i=n;
			while(i>0) {
				gasto = scan.nextInt();
				suma += gasto;
				i--;
				
			}
			if(suma==0) {
				break;
				
			}
			System.out.println(suma);
			suma=0;
			
		}while(n>0);
	}

}
