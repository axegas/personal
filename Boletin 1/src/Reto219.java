import java.util.Scanner;

public class Reto219 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int pares=0;
		int decimos;
		int num;
		
		int casos = scan.nextInt();
		do {
			if(casos==0) break;
			decimos=scan.nextInt();
			for(int i=0;i<decimos;i++) {
				num=scan.nextInt();
				if(num%2==0) {
					pares++;
				}
			}
			casos--;
			System.out.println(pares);
			pares = 0;			
		}while(casos>0);	
		
	}
}