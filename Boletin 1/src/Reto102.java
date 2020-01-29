import java.util.Scanner;

public class Reto102 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		String sincodificar = "";
		String codificada = "";
		String cad;
		char letra;
		int aux;
		int vocales = 0;
		sincodificar = scan.nextLine();		
		cad = sincodificar.toUpperCase();
		while(!codificada.equals("FIN")) {
			int pos = sincodificar.charAt(0)-'p';
			for(int i=1;i<sincodificar.length();i++) {	
				if(Character.isAlphabetic(cad.charAt(i))) {
					if((cad.charAt(i)-pos)>'Z') {
						aux = (cad.charAt(i)-pos)-'Z';
						letra = (char) ('A'+aux-1);						
					}else {
						if((cad.charAt(i)-pos)<'A') {
							aux = (cad.charAt(i)-pos)-'A';
							letra = (char) ('Z'+aux+1);							
						}else {
							letra = (char) (cad.charAt(i)-pos);							
						}						
					}					
				}else {
					letra = cad.charAt(i);					
				}
				codificada += letra+"";
				if(letra=='A' | letra=='E' | letra=='I' | letra=='O' | letra=='U') {
					vocales++;					
				}					
			}
			if(codificada.equals("FIN")) {
				break;				
			}
			System.out.println(vocales);
			sincodificar = scan.nextLine();	
			cad = sincodificar.toUpperCase();
			vocales = 0;	
			codificada = "";
			
		}
	}
}
