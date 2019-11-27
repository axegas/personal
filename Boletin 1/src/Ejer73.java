import java.util.Scanner;

public class Ejer73 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		String transmision;
		String transIni = "";
		int j=0;
		int i=0;
		
		System.out.print("Introduce la transmisión a cifrar: ");
		transmision = scan.nextLine();
		
		/*
		if(!transmision.contains("el area 51")) {
			System.out.println("'el area 51' no aparece en la transmisión");
		}else {
			transmision = transmision.replaceAll("el area 51", "Murcia");
			System.out.println(transmision);				
		}
		*/
		if(!transmision.contains("el area 51")) {
			System.out.println("'el area 51' no aparece en la transmisión");
		}else {
			i = transmision.indexOf("el area 51");
			while(true){
				if(!transmision.contains("el area 51")) {
					transIni += transmision.substring(j, transmision.length());
					break;
				}
				else {
					transIni += transmision.substring(j, i);
					transIni += "Murcia";
					transmision = transmision.substring(i+"el area 51".length(),transmision.length());	
					i = transmision.indexOf("el area 51");
					
				}
				
			}
			System.out.println(transIni);
		}
		
		
		
	}
	
}
