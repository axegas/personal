import java.util.Scanner;

public class Reto426 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int caramelos=0;
		int ninos=0;
		int suma=0;
		
		caramelos = scan.nextInt();
		while(caramelos!=0) {
			suma+=caramelos;
			ninos++;
			caramelos = scan.nextInt();
			
		}
		if(ninos!=0) {
			if(suma%ninos==0) {
				System.out.println("REPARTO JUSTO");
			}
			else {
				System.out.println("IMPOSIBLE");
			}
		}
	}
}
