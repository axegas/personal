import java.util.Scanner;

public class Reto155 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		
		do {
			x = scan.nextInt();
			y = scan.nextInt();
			if(x>=0 & y>=0)
				System.out.println(x*2+y*2);
			else
				break;
		}while(true);
	}
}