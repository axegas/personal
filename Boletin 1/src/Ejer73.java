import java.util.Scanner;

public class Ejer73 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		String transmision;
		String transmisionMurcia = "";
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
					transmisionMurcia += transmision.substring(j, transmision.length());
					break;
				}
				else {
					transmisionMurcia += transmision.substring(j, i);
					transmisionMurcia += "Murcia";
					transmision = transmision.substring(i+"el area 51".length(),transmision.length());	
					i = transmision.indexOf("el area 51");					
				}				
			}
			System.out.println(transmisionMurcia);
		}		
	}	
}
