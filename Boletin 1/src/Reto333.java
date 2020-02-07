import java.util.Scanner;

public class Reto333 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String frase = "";
		String frase2 = "";

		int k=0;
		Boolean noes = false;
		
		frase = scan.nextLine();
		frase = frase.toUpperCase();
		frase=frase.replace(" ","");
		
		do {
			
			if(frase.equals("XXX")) break;
			for(int i=frase.length()-1;i>=0&&!noes;i--) {				
				if(frase.charAt(i)!=frase.charAt(k)) {
					noes=true;
				}
				k++;
			}
			k=0;
			if(noes) {
				System.out.println("NO");
			}else {
				System.out.println("SI");
			}				
			
			frase = scan.nextLine();
			frase = frase.toUpperCase();
			noes=false;
			frase=frase.replace(" ","");
			
		}while(!frase.equals("XXX"));		
	}
}
