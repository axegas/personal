import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejer114 {

	public static void main(String[] args) {
		try {
			File carpeta;
			Scanner scan = new Scanner(System.in);
			int num;
			String nombre;
			System.out.println("¿Cuántas carpetas quiere crear en el escritorio?");
			num = Integer.parseInt(scan.nextLine());
			System.out.println("¿Qué nombre quiere que aparezca en las carpetas?");
			nombre = scan.nextLine();
			for (int i = 1; i <= num; i++) {
				Thread.sleep(1000);
				carpeta = creaCarpeta(nombre + i);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static File creaFichero(String nombre) throws IOException {
		File fichero = new File(nombre);
		if (fichero.createNewFile()) {
			System.out.println("Fichero " + nombre + " creado.");
		} else {
			System.out.println("Fichero " + nombre + " no creado.");
		}
		return fichero;
	}

	public static File creaCarpeta(String nombre) throws IOException {
		File carpeta = new File("C:\\Users\\peixe\\Desktop\\" + nombre);
		if (carpeta.mkdir()) {
			
			System.out.println("Carpeta " + nombre + " creada.");
		} else {
			System.out.println("Carpeta " + nombre + " no creada.");
		}
		return carpeta;
	}

}
