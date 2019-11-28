import java.util.Scanner;

public class Reto430 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int d;
		int n;
		int p;
		int dia=0;
		
		do {
			p = scan.nextInt();	
			if(p==0) {
				break;
			}
			while(p>0) {
				do {
					d = scan.nextInt();
					n = scan.nextInt();					
				}while(d<1 || n>Math.pow(10, 6));
				if(dia<d) {
					dia=d;
				}else {
					while(dia>=d) {
						d+=n;						
					}		
					dia=d;	
				}
				p--;				
			}
			System.out.println(dia);
			dia=0;
		}while(true);		
	}
}
