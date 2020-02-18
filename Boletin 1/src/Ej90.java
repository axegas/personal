import java.util.*;

public class Ej90 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap <String, String> mapa = new HashMap <String,String>();
		mapa.put("one","uno");
		mapa.put("two","dos");
		mapa.put("three","tres");
		mapa.put("four","cuatro");
		mapa.put("five","cinco");
		mapa.put("six","seis");
		mapa.put("seven","siete");
		mapa.put("eight","ocho");
		mapa.put("nine","nueve");
		String palabra;
		
			System.out.println("Dime la traducción de: " + mapa.get("one"));
			palabra = scan.nextLine();
			System.out.println("Dime la traducción de: " + mapa.get("two"));
			System.out.println("Dime la traducción de: " + mapa.get("three"));
			System.out.println("Dime la traducción de: " + mapa.get("four"));
			System.out.println("Dime la traducción de: " + mapa.get("five"));
			
	
		

	}

}
