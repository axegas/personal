import java.util.Scanner;

public class Reto398 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int f=scan.nextInt();
		int c=scan.nextInt();
		int x;
		int y;
		int posx1 = 1;
		int posx2 = 1;
		int posy1 = 1;
		int posy2 = 1;
		int seg1 = 0;
		int seg2 = 0;
		int mov1=0;
		int mov2=0;
		
		int n=scan.nextInt();
		
		while(n>0) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(x>=posx1 && y>=posy1) {
				seg1+=x-posx1;
				seg1+=y-posy1;
				posx1=x;
				posy1=y;
				if(seg1>seg2) {
					seg2=seg1;
				}
			}else {
				seg2+=x-posx2;
				seg2+=y-posy2;
				posx2=x;
				posy2=y;
				if(seg2>seg1) {
					seg1=seg2;
				}
			}			
			n--;
		}
		
		

		
	
		
		System.out.println(seg1+seg2);
	}

}