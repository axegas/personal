import java.util.Scanner;

public class Reto221 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int butacas;
		int pares=0;
		int impares=0;
		String resultado;
		int[] vec;
		while(casos>0) {
			butacas = scan.nextInt();
			vec = new int[butacas];		
			for(int i=0;i<butacas;i++) {
				vec[i]=scan.nextInt();
			}		
			for(int i=0;i<butacas;i++) {
				if(vec[i]%2==0) {
					pares++;
				}else {
					break;
				}
			}
			for(int i=butacas-1;i>=0;i--) {
				if(vec[i]%2!=0) {
					impares++;
				}else {
					break;
				}
			}
			if(pares+impares==butacas) {
				resultado="SI "+pares;
			}else {
				resultado="NO";
			}
			System.out.println(resultado);
						
			pares=0;
			impares=0;	
			casos--;
		}		
	}
}
