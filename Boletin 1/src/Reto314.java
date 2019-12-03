import java.util.Scanner;

public class Reto314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int temperaturas;
		int picos=0;
		int valles=0;
		int ant=0;
		int pos=0;
		int subiendo=0;
		int bajando=0;
		int casos = scan.nextInt();
		while(casos>0) {
			temperaturas = scan.nextInt();
			ant=scan.nextInt();
			for(int i=1;i<temperaturas;i++) {
				pos=scan.nextInt();
				if(pos>ant) {
					if(bajando==1) {
						valles++;						
					}
					subiendo=1;
					bajando=0;
					
				}
				if(pos<ant){
					if(subiendo==1) {
						picos++;
						
					}
					bajando=1;
					subiendo=0;
					
				}
				if(pos==ant) {
					bajando=0;
					subiendo=0;
				}
				ant=pos;
				
			}	
			System.out.println(picos + " " + valles);
			bajando=0;
			subiendo=0;
			picos=0;
			valles=0;
			casos--;
			
		}
		
	}
	
}
