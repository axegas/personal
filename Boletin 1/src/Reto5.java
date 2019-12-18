import java.util.Scanner;

public class Reto5 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int casos;
		int tamano;
		int abono;
		int agua;
		int casa;
		String nombre;
		int tamano2;
		int abono2;
		int agua2;
		int casa2;
		String nombre2;
		String gana = "";
		
		casos=scan.nextInt();
		tamano = scan.nextInt();
		abono = scan.nextInt();
		agua = scan.nextInt();
		casa = scan.nextInt();
		nombre = scan.nextLine();
		while(casos>0) {			
			tamano2 = scan.nextInt();
			abono2 = scan.nextInt();
			agua2 = scan.nextInt();
			casa2 = scan.nextInt();
			nombre2 = scan.nextLine();
				
				if(tamano2>tamano) {
					gana=nombre2;
				}else {
					if(tamano2<tamano) {
						gana=nombre;
					}else {
						if(agua2<agua) {
							gana=nombre2;
						}else {
							if(agua2>agua) {
								gana=nombre;
							}else {
								if(casa2<casa) {
									gana=nombre2;
								}else {
									if(casa2>casa) {
										gana=nombre;
									}else {
										if(abono2<abono) {
											gana=nombre2;
										}else {
											if(abono2>abono) {
												gana=nombre;
											}else {
												gana=nombre;
											}
										}
									}
								}
							}
						}
					}
				}
				
				
				tamano = tamano2;
				abono = abono2;
				agua = agua2;
				casa = casa2;
				nombre = nombre2;
				
					
			casos--;
		}
		System.out.println(gana);
		
		
	}

}
