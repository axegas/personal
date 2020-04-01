import java.io.*;
import java.util.*;

public class Ejer112 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String chat = "";
		String paco = "";
		String nombre;
		String frase;

		paco += "Bienvenido al chat con Paco.\n";
		paco += "----------------------------\n";
		paco += "Paco: Hola que tal, cómo te llamas?";
		chat += paco + "\n";

		System.out.println(paco);

		do {
			nombre = scan.nextLine();
		} while (compruebaEspacios(nombre));
		chat += nombre + "\n";
		paco = "Paco: Hola " + nombre + ", ¿como estas hoy?";
		System.out.println(paco);
		chat += paco + "\n";

		do {
			frase = scan.nextLine();
			chat += frase+"\n";
			if (frase.contains("vete")) {
				paco = "Paco: nos vemos " + nombre + "!";
				System.out.println(paco);
				chat += paco + "\n";
				break;
			}
			if (cuentaVocales(frase) % 2 == 0) {
				paco = "Paco: Qué interesante...cuentame más…";
			} else {
				paco = "Paco: No me interesa nada, cuentame otra cosa";				
			}
			System.out.println(paco);
			chat += paco + "\n";
		} while (true);

		creaFichero("chat3.txt", chat);
		

	}

	public static int cuentaVocales(String str) {
		int vocales = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'a' 
					|| str.toLowerCase().charAt(i) == 'e'
					|| str.toLowerCase().charAt(i) == 'i' 
					|| str.toLowerCase().charAt(i) == 'o'
					|| str.toLowerCase().charAt(i) == 'u') {
				vocales++;
			}
		}

		return vocales;
	}

	public static boolean compruebaEspacios(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}
	
	public static void creaFichero(String nombre, String datos) {		
		try {
			File salida = new File(nombre);
			salida.createNewFile();			
			FileWriter file = new FileWriter(salida);
			file.write(datos);
			file.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
