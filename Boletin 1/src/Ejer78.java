import java.util.Scanner;

/*
 * Axel Perez Gaspar
 * 1º DAM
 * 
 * 04/12/2019
 * 
 * JUEGO DEL AHORCADO
 * 
 */
public class Ejer78 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String palabra;
		String palabra_jugador = "";
		int fallos = 0;
		char letra;
		int letras=0;
		
	
		System.out.println("JUGADOR1: Introduzca palabra para adivinar:");
		palabra = scan.nextLine();

		
		
		for(int i=0;i<palabra.length();i++) {		
				palabra_jugador += "*";
		}
		System.out.println("JUGADOR2: La palabra para adivinar es la siguiente:");
		System.out.println(palabra_jugador);		
		
		while(fallos<8){
			System.out.println("Introduce una letra:");
			letra = scan.nextLine().charAt(0);
			if(palabra.contains(""+letra)) {
				for(int i=0;i<palabra.length();i++) {
					if(palabra.charAt(i)==letra) {
						letras++;
						palabra_jugador = cambiaLetra(palabra_jugador,i,letra);
						
					}
					
				}				
				System.out.println("La letra " + letra + " estaba en la palabra " + letras + " veces.");
				letras = 0;
				System.out.println(palabra_jugador);
				if(palabra.equals(palabra_jugador)) {
					System.out.println("Palabra adivinada! Gracias por jugar al ahorcado!");
						break;
						
				}
				
			}else {
				System.out.println("La letra " + letra + " no estaba en la palabra.");
				fallos++;
				switch(fallos) {
				case 1:
					System.out.println("ERROR 1 de 8: Te pinto la horca");
					break;
					
				case 2:
					System.out.println("ERROR 2 de 8: Te pinto la cabeza");
					break;
					
				case 3:
					System.out.println("ERROR 3 de 8: Te pinto el cuerpo");
					break;
					
				case 4:
					System.out.println("ERROR 4 de 8: Te pinto el brazo izquierdo");
					break;
					
				case 5:
					System.out.println("ERROR 5 de 8: Te pinto el brazo derecho");
					break;
					
				case 6:
					System.out.println("ERROR 6 de 8: Te pinto la pierna izquierda");
					break;
					
				case 7:
					System.out.println("ERROR 7 de 8: Te pinto la pierna derecha");
					break;
					
				case 8:
					System.out.println("ERROR 8 de 8: AHORCADO!");
					break;
					
				default:
					break;
					
				}	
				
			}	
			
		}
		scan.close();
		
	}
	
	public static String cambiaLetra(String str, int pos,char letra) {//cambia la letra "letra" por la que esta en la posicion "pos" dentro del string
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
