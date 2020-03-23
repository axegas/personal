import java.io.*;

public class Ejer109 {

	public static void main(String[] args) {
		File salida1 = new File("Salida1.txt");
		File salida2 = new File("Salida2.txt");
		
		try {
			if(salida1.createNewFile()) {
				System.out.println("Fichero salida 1 creado.");
			}else {
				System.out.println("Fichero salida 1 no creado.");
			}
			if(salida2.createNewFile()) {
				System.out.println("Fichero salida 2 creado.");
			}else {
				System.out.println("Fichero salida 2 no creado.");
			}	
			
			String pares = "";
			String impares = "";
			
			for(int i=0;i<=49;i++) {
				if(i%2==0) {
					pares += i + "\n";
				}else {
					impares += i + "\n";
				}
			}
			FileWriter FWsalida1 = new FileWriter(salida1);
			FileWriter FWsalida2 = new FileWriter(salida2);
			
			FWsalida1.write(pares);
			FWsalida2.write(impares);
			FWsalida1.close();
			FWsalida2.close();			
		}catch(IOException e) {
			System.out.println(e.getMessage());		
		}
		
		
		
	}

}
