import java.util.Scanner;

public class Ejer73 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String transmision;
	
		System.out.print("Introduce la transmisión a cifrar: ");
		transmision = scan.nextLine();
		if(!transmision.contains("el area 51")) {
			System.out.println(" 'el area 51' no aparece en la transmisión");
		}else {
			transmision = transmision.replaceAll("el area 51", "Murcia");
			System.out.println(transmision);				
		}	
	}

}
