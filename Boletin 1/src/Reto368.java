import java.util.Scanner;

public class Reto368 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = 0;
		int o = 0;
		int t;
		
		do {
			h = scan.nextInt();
			o = scan.nextInt();
			if(h==0 & o==0) {
				break;
			}else {
				t = h/o;
				if(h%o==0) {
					System.out.println(t*10);
				}else {
					System.out.println((t+1)*10);					
				}
			}			
		}while(h!=0 & o!=0);
	}
}