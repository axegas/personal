import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO!");
		System.out.println("---------------------------------");
		System.out.print("Introduce la frase: ");
		String frase = scan.nextLine();
		String frase_jugador = "";
		int contador = 6;
		char letra;
		
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				frase_jugador += " ";
			}else
				frase_jugador += "_";
		}
		
		System.out.println("EMPIEZA EL JUEGO!");
		System.out.println("Puedes tener: " + contador + " fallos.");
		
		do {
			System.out.print("Introduce una letra: ");
			letra = scan.nextLine().charAt(0);
			if(frase.contains(""+letra)) {
				for(int i=0;i<frase.length();i++) {
					if(frase.charAt(i)==letra) {
						frase_jugador = cambiaLetra(frase_jugador,i,letra);						
					}					
				}
				System.out.println(frase_jugador);
			}else {
				contador--;
				if(contador==0) {
					System.out.println("Has perdido!");
					System.out.println("La frase era: " + frase);
					break;
				}else {
					System.out.println("Te quedan: " + contador + " fallos.");					
				}				
			}
			if(frase.equals(frase_jugador)) {
				System.out.println("Has ganado!");
				break;				
			}else {
				System.out.println("Sigue jugando");				
			}
			
		}while(contador>0);
		
		
		
	}
	public static String cambiaLetra(String str, int pos,char letra) {
		String str2 = "";
		for(int i=0;i<str.length();i++) {
			if(i==pos) {
				str2 += letra; 
			}else {
				str2 += str.charAt(i);
			}
		}		
		return str2;
	}

}
