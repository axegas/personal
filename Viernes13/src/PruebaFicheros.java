import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFicheros {

	public static void main(String[] args) {

		File f = new File("c:/prueba.txt");
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno alu;
		String linea;
		String[] str;
		Scanner s;
		String dni;
		String nombre;
		int edad;
		String curso;
		try {
			s = new Scanner(f);
			while (s.hasNextLine()) {
				linea = s.nextLine();
				str = linea.split(",");	
				dni = str[0];
				nombre = str[1];
				edad = Integer.parseInt(str[2]);
				curso = str[3];
				alu = new Alumno(dni,nombre,edad,curso);
				alumnos.add(alu);
				System.out.println(alu.toString());
			}
			s.close();
		} catch (Exception e) {
		
		}
		

	}

}
