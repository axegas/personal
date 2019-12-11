import java.util.Scanner;

public class Reto158 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int casos = scan.nextInt();
		int muros=0;
		int muro;
		int muroAnt=0;
		int arriba=0;
		int abajo=0;
		
		
		while(casos>0) {
			muros=scan.nextInt();
			muro=scan.nextInt();
			while(muros>1) {
				muroAnt=muro;
				muro=scan.nextInt();
				
				if(muro>muroAnt) {
					arriba++;
					
				}
				if(muro<muroAnt) {
					abajo++;
					
				}
				
				muros--;
			}
			casos--;
			System.out.println(arriba + " " + abajo);
			arriba=0;
			abajo=0;
		}		
	}
}
