import java.util.Scanner;

public class Ejer313 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int saldo;
		int cambio;
		
		casos = scan.nextInt();
		while(casos>0) {
			saldo = scan.nextInt();
			cambio = scan.nextInt();
			
			if(saldo+cambio>=0) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}					
			casos--;
		}
	}
}
