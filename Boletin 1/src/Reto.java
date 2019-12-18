import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	

		int casos=0;
		int peso1=0;
		int peso2=0;
		int total=0;
		
		casos=scan.nextInt();
		while(casos>0) {
			peso1 = scan.nextInt();
			peso2 = scan.nextInt();
			total = peso2 - peso1;			
			
			
			
			System.out.println(total);	
			
			
			casos--;
		}
		
	
		
	}
	
}