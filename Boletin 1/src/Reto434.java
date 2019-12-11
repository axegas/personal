import java.util.Scanner;

public class Reto434 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int palomas;
		int cajas;
		
		while(casos>0) {
			palomas=scan.nextInt();
			cajas=scan.nextInt();
			
			if(palomas>cajas) {
				System.out.println("PRINCIPIO");
			}else {
				System.out.println("ROMANCE");
			}
			casos--;
		}
	}
}
