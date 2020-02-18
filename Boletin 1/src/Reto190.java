import java.util.Scanner;

public class Reto190 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int den = scan.nextInt();
		int res = num;
		
		while(num>den) {
	
			for(int i = num-1; i>den;i--) {
				res *= i;
			}			
			System.out.println(res);
						
			num = scan.nextInt();
			den = scan.nextInt();
			res = num;
		}
		scan.close();
	}
}
