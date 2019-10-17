package condicionalesbucles;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String respuesta;
		int contador=0;
		
		do {
			System.out.print("¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s"))	contador = contador + 3;
		
		do {
			System.out.print("¿Ha aumentado sus gastos de vestuario? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿Ha perdido el interés que mostraba anteriormente por ti? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿Ahora se asea con más frecuencia? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿No te deja que mires la agenda de su teléfono móvil? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿Has notado que últimamente se perfuma más? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		do {
			System.out.print("¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo? (s/n)");
			respuesta = scan.nextLine();
			}while(!respuesta.equals("s") && !respuesta.equals("n"));
		if(respuesta.equals("s")) contador+=3;
		
		System.out.println("puntuación: " + contador);
		if(contador >=0 && contador <= 10) System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
		if(contador >=11 && contador <= 22) System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		if(contador >=23 && contador <= 30) System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
	}
}
