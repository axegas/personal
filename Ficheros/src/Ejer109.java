import java.io.*;

public class Ejer109 {

	public static void main(String[] args) {
		File salida1 = new File("Salida1.txt");
		File salida2 = new File("Salida2.txt");
		
		try {
			if(salida1.createNewFile()) {
				System.out.println("Fichero creado.");
			}else {
				System.out.println("Fichero no creado.");
			}
			salida2.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		
		}
	}

}
