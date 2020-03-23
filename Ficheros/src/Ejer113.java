import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Ejer113 {

	public static void main(String[] args) {

		

		

		try {
			File salida = creaFichero("index.html");
			Scanner scan = new Scanner(System.in);
			String titulo;
			String rotulo;
			String texto;
			String web;
			String fichero = "";
			
			System.out.println("Bienvenido al programa de generación de páginas web");
			System.out.println("---------------------------------------------------");
			System.out.println("Introduzca el título (<title>) de la página web:");
			titulo = scan.nextLine();
			System.out.println("Introduzca el texto del rotulo h1 (<h1>) de la página web:");
			rotulo = scan.nextLine();
			System.out.println("Introduzca el texto del parrafo p (<p>) de la pagina web:");
			texto = scan.nextLine();
			System.out.println("Introduzca la página web que se enlazará en la etiqueta <a href=>:");
			web = scan.nextLine();
			System.out.println("Pagina web creada!, gracias por utilizar este programa...");
			
			fichero += "<html>\n";
			fichero += "<head>\n";
			fichero += "<title>"+titulo+"</title>\n";
			fichero += "</head>\n";
			fichero += "<body>\n";
			fichero += "<h1>"+rotulo+"</h1>\n";
			fichero += "<p>"+texto+"</p>\n";
			fichero += "<a href='"+web+"'>Esto es un enlace</a>\n";		
			fichero += "</body>\n";
			fichero += "</html>\n";
			
			FileWriter fw = new FileWriter(salida);
			
			fw.write(fichero);
			
			fw.close();
			scan.close();
		}catch (IOException e) {
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
}
