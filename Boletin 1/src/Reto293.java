import java.util.Scanner;

public class Reto293 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int casos;
		int insectos;
		int aracnidos;
		int crustaceos;
		int escalopendras;
		int anillos;
		int patas;
		
		casos = scan.nextInt();
		while(casos>0) {
			insectos = scan.nextInt();
			aracnidos = scan.nextInt();
			crustaceos = scan.nextInt();
			escalopendras = scan.nextInt();
			anillos = scan.nextInt();
			
			patas = insectos*6+aracnidos*8+crustaceos*10+escalopendras*anillos*2;
			
			System.out.println(patas);
			casos--;			
		}
	}
}
