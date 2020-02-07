import java.util.Scanner;

public class Reto337 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int[] dentarriba = new int[6];
		int[] dentabajo = new int[6];
		int min;
		int suma;
		boolean noes=false;
		
		casos=scan.nextInt();
		while(casos>0) {
			for(int i=0;i<6;i++) {
				dentarriba[i]=scan.nextInt();
			}
			for(int i=0;i<6;i++) {
				dentabajo[i]=scan.nextInt();
			}
			min= dentarriba[0]+dentabajo[0];
			for(int i=1;i<6&!noes;i++) {
				suma=dentarriba[i]+dentabajo[i];
				if(suma!=min) {
					noes=true;
				}
			}
			if(noes) {
				System.out.println("NO");
			}else {
				System.out.println("SI");
			}
			casos--;
			noes=false;
		}
	}
}
