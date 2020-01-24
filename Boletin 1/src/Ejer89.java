import java.util.HashMap;
import java.util.Scanner;

public class Ejer89 {

	public static void main(String[] args) {
		HashMap<String,String> mapa = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		String palabra;
		
		mapa.put("casa", "house");
		mapa.put("coche", "house");
		mapa.put("leon", "lion");
		mapa.put("concha", "shell");
		mapa.put("de", "of");
		mapa.put("tu", "you");
		mapa.put("madre", "mother");
		mapa.put("padre", "father");
		
		System.out.print("Inserte una palabra: ");
		palabra = scan.nextLine();
		while(!palabra.equals("salir")) {
			
			System.out.println(mapa.get(palabra));
			
			
			System.out.print("Inserte una palabra: ");
			palabra = scan.nextLine();
		}
		
		
		
		

	}

}
