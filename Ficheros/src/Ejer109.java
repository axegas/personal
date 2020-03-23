import java.io.*;

public class Ejer109 {

	public static void main(String[] args) {
		File salida1 = new File("Salida1.txt");
		File salida2 = new File("Salida2.txt");
		
		try {
			salida1 = creaFichero("Salida1.txt");
			salida2 = creaFichero("Salida2.txt");
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
	public static File creaFichero(String nombre) {
		File fichero = new File(nombre);
		try {
			if(fichero.createNewFile()) {
				System.out.println("Fichero "+nombre+" creado.");
			}else {
				System.out.println("Fichero "+nombre+" no creado.");
			}			
		}catch(IOException e) {
			System.out.println(e.getMessage());		
		}		
		return fichero;
	}
}
