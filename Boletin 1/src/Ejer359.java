import java.util.Scanner;

public class Ejer359 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int meji;
		int suma = 0;
		int cont = 0;
		
		casos = scan.nextInt();
		while(casos>0) {			
			meji = scan.nextInt();			
			while(meji!=-1) {
				suma += meji;
				cont ++;
				meji = scan.nextInt();
			}
			if(suma==cont) {
				System.out.println("Justo");
			}else {
				if(suma>cont) {
					System.out.println("Suerte");
				}else {
					System.out.println("Timo");
				}
			}
			suma=0;
			cont = 0;
			casos--;
		}
	}
}
