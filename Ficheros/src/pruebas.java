import java.io.*;

public class pruebas {

	public static void main(String[] args) {
		verArchivos();
	}
	
	public static void verArchivos() {
		String sCarpAct = System.getProperty("user.dir");
		File carpeta = new File(sCarpAct);
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
		    System.out.println("No hay elementos dentro de la carpeta actual");
		}
		else {
		    for (int i=0; i< listado.length; i++) {
		        System.out.println(listado[i]);
		    }
		}
	}

}
