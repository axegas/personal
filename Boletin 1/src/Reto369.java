import java.util.Scanner;

public class Reto369 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		num = scan.nextInt();
		while(num>0) {
			for(int i=0;i<num;i++)
				System.out.print("1");
			System.out.println();
			num = scan.nextInt();			
		}
	}
}
