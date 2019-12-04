import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@ BIENVENIDO AL JUEGO DEL AHORCADO! @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		String frase;
		String frase_jugador = "";
		int contador = 6;
		char letra;
		int letras=0;
		String letras_marcadas = "";
		
		do {
			System.out.print("Introduce la frase: ");
			frase = scan.nextLine().toLowerCase();
			if(frase.length()==0) {
				System.out.println("Introduce alguna frase!");
			}
		}while(frase.length()==0);
		
		
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				frase_jugador += " ";
			}else {
				frase_jugador += "_";
				letras++;
			}
		}
		
		System.out.println("-------------------------------------");
		System.out.println("La frase tiene " + letras + " letras.");
		System.out.println("Puedes tener " + contador + " fallos.");
		System.out.println("----------EMPIEZA EL JUEGO!----------");
		
		while(contador>0){
			//muestraAhorcado(contador,letras_marcadas);
			System.out.print("Introduce una letra: ");
			letra = scan.nextLine().toLowerCase().charAt(0);
			if(!letras_marcadas.contains(""+letra)) {
				letras_marcadas+=letra;			
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
						System.out.println("Has fallado!");
						System.out.println("Te quedan: " + contador + " fallos.");					
					}					
				}				
			}else {
				contador--;				
				if(contador==0) {
					System.out.println("Has perdido!");
					System.out.println("La frase era: " + frase);
					break;
					
				}else {
					System.out.println("Ya has marcado esa letra! le has dado a las siguientes letras: "+letras_marcadas);
					System.out.println("Te quedan: " + contador + " fallos.");						
				}
			}
			if(frase.equals(frase_jugador)) {
				System.out.println("Has ganado!");
				break;
				
			}else {
				System.out.println("Sigue jugando");
				System.out.println("-------------------------------------");				
			}		
		}
		scan.close();
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
	
	public static void muestraAhorcado(int n,String s) {
		switch(n) {
		case 6:
			System.out.println("");
			
			System.out.println("");
			break;
			
		case 5:
			System.out.println("");
			
			System.out.println("");
			break;
			
		case 4:
			System.out.println("");
			
			System.out.println("");
			break;
			
		case 3:
			System.out.println("");
			
			System.out.println("");
			break;
			
		case 2:
			System.out.println("");
			
			System.out.println("");
			break;			
		case 1:
			System.out.println("");
			
			System.out.println("");
			break;
		case 0:
			System.out.println("");
			
			System.out.println("");
			break;
			
		default:
			break;		
		
		}
	}
}
