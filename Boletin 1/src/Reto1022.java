import java.util.Scanner;

public class Reto1022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String codificada = "";
		String cad;
		char letra;
		int aux;
		int vocales = 0;
		cad = scan.nextLine();		
		while(!codificada.equals("FIN")) {
			int pos = cad.charAt(0)-'p';
			for(int i=1;i<cad.length();i++) {
				if(Character.isUpperCase(cad.charAt(i))) {
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
					if(Character.isLowerCase(cad.charAt(i))) {
						if((cad.charAt(i)-pos)>'z') {
							aux = (cad.charAt(i)-pos)-'z';
							letra = (char) ('a'+aux-1);						
						}else {
							if((cad.charAt(i)-pos)<'a') {
								aux = (cad.charAt(i)-pos)-'a';
								letra = (char) ('z'+aux+1);							
							}else {
								letra = (char) (cad.charAt(i)-pos);							
							}						
						}						
					}else {
						letra = cad.charAt(i);						
					}					
				}				
				codificada += letra+"";
				if(letra=='A' | letra=='E' | letra=='I' | letra=='O' | letra=='U' | letra=='a' | letra=='e' | letra=='i' | letra=='o' | letra=='u') {
					vocales++;					
				}				
			}
			if(codificada.equals("FIN")) {
				break;				
			}
			System.out.println(vocales);
			cad = scan.nextLine();
			vocales = 0;
			codificada = "";		
		}
	}
}
