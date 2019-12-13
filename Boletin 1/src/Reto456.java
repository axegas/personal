import java.util.Scanner;

public class Reto456 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cuadritos;
		int casos;
		int alto;
		int ancho;
		int tableta;
		int total;
		
		casos = scan.nextInt();
		
		while(casos>0) {
			ancho = scan.nextInt();
			alto = scan.nextInt();
			cuadritos = scan.nextInt();
			
			tableta = ancho*alto;
			
			total = cuadritos/tableta;
			
			if(cuadritos%tableta!=0) {
				total++;	
			}
			System.out.println(total);
			casos--;
		}
	}
}
