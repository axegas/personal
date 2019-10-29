import java.util.Scanner;

public class Reto_221 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vecinos = scan.nextInt();
		int butacas[] = new int[vecinos];
		int contador=0;
		
		int i=0;
		
		
		for(i=0;i<butacas.length;i++) {
			butacas[i]=scan.nextInt();
		}			
		for(i=0;i<butacas.length;i++) {
			if(butacas[i]%2!=0) {
				for(int j=i;j<butacas.length;j++) {
					if(butacas[j]%2!=0) contador++;
					else {
						contador=0;
						break;
					}
				}
				break;
			}
			
		if(contador>0) System.out.println("SI " + contador);
		else System.out.println("NO");
		}		
	}

}
