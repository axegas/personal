package personal;

import java.util.Scanner;

public class Ejer455 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int practicas;
		int matricula=0;
		int precio;
		String carnet = "G";
		
		do {
		System.out.print("Introduce el tipo de carnet: ");
		carnet = scan.nextLine();
		carnet = carnet.toUpperCase();
		}while(!carnet.equals("A") & !carnet.equals("B") & !carnet.equals("C") & !carnet.equals("D"));
		
		do {
		System.out.print("Introduce el número de prácticas: ");		
		practicas=scan.nextInt();
		}while(practicas<0);		
		
		switch(carnet) {
		case "A": 
			matricula=150;
			practicas=practicas*15;
			break;
			case "B":
				matricula=325;
				practicas=practicas*21;
			break;
			case "C":
				matricula=520;
				practicas=practicas*36;
				break;
			case "D":
				practicas=practicas*50;
				matricula=610;
				break;
			}
		precio = practicas+matricula;
		System.out.println("El precio total del carnet "+carnet+"es: "+precio);
	}
}
