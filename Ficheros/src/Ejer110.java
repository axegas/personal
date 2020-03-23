import java.io.*;
import java.util.*;

public class Ejer110 {

	public static void main(String[] args) {
		File salida = new File("Salida3.txt");
		
		
		try {
			if(salida.createNewFile()) {
				System.out.println("Fichero salida 1 creado.");
			}else {
				System.out.println("Fichero salida 1 no creado.");
			}
			
			String resultado = "";
			FileWriter FWsalida = new FileWriter(salida);
			File salida1 = new File("Salida1.txt");
			File salida2 = new File("Salida2.txt");
			
			Scanner sc1 = new Scanner(salida1);
			Scanner sc2 = new Scanner(salida2);
			while(sc1.hasNext()) {
				String l1 = sc1.nextLine();
				resultado += l1+"\n";
				String l2 = sc2.nextLine();
				resultado += l2+"\n";
			}

			FWsalida.write(resultado);
			FWsalida.close();	
			sc1.close();
			sc2.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());		
		}

	}

}
