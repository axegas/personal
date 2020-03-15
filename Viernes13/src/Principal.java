import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws Exception {
		int opc;

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		ArrayList<Examen> examenes = new ArrayList<Examen>();

		iniciaAlumnos(alumnos);
		iniciaAsignaturas(asignaturas);
		do {
			opc = menu();
			switch (opc) {
			case 1:
				altaAlumno(alumnos);
				break;
			case 2:
				altaAsignatura(asignaturas);
				break;
			case 3:
				matricular(alumnos, asignaturas);
				break;
			case 4:
				muestraAsignaturas(asignaturas);
				break;
			case 5:
				muestraAlumnos(alumnos);
				break;
			case 6:
				examinar(alumnos, asignaturas, examenes);
				break;
			case 7:
				muestraAlumno(alumnos);
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Hasta luego.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
				break;
			}
		} while (opc != 8);
	}

	public static int menu() {
		do {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Alta alumno\n" + "2. Alta asignatura\n" + "3. Matricular\n" + "4. Muestra asignaturas\n"
								+ "5. Muestra alumnos\n" + "6. Examinar\n" + "7. Mostrar alumno\n" + "8. Salir",
						"Menu", 1));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Tiene que introducir un número válido.");
			}
		} while (true);
	}

	public static void altaAlumno(ArrayList<Alumno> alumnos) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		String DNI = JOptionPane.showInputDialog(null, "Dime el DNI:");
		int edad = validaEnteros("Edad");
		String curso = JOptionPane.showInputDialog(null, "Dime el curso:");
		Alumno alu = new Alumno(DNI, nombre, edad, curso);
		alumnos.add(alu);
		escribeAlumno(alu);
	}

	public static void altaAsignatura(ArrayList<Asignatura> asignaturas) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		String libro = JOptionPane.showInputDialog(null, "Dime el libro:");
		String profesor = JOptionPane.showInputDialog(null, "Introduzca el nombre del profesor:");
		int duracion = validaEnteros("duración");
		Asignatura asi = new Asignatura(nombre, duracion, libro, profesor);
		asignaturas.add(asi);
		escribeAsignatura(asi);
	}

	public static void examinar(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas,
			ArrayList<Examen> examenes) throws Exception {
		String nomAlu = JOptionPane.showInputDialog(null, "Introduzca el nombre del alumno:");
		Alumno alu = buscaAlumno(nomAlu, alumnos);
		double nota;
		if (alu != null) {
			String nomAsi = JOptionPane.showInputDialog(null, "Introduzca el nombre de la asignatura:");
			Asignatura asi = buscaAsignatura(nomAsi, asignaturas);
			if (asi != null) {
				if (alu.tieneAsig(asi)) {
					do {
						try {
							nota = validaNota();
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, e.getMessage());
						}
					} while (true);
					Examen e = new Examen(alu, asi, nota);
					examenes.add(e);
					alu.examinar(e);
				} else {
					JOptionPane.showMessageDialog(null, "El alumno " + nomAlu + " no tiene esa asignatura.");
				}
			}
		}
	}

	public static void matricular(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas) {
		String nomAlu = JOptionPane.showInputDialog(null, "Introduzca el nombre del alumno:");
		Alumno alu = buscaAlumno(nomAlu, alumnos);
		Asignatura asi;
		String nomAsi;
		if (alu != null) {
			JOptionPane.showMessageDialog(null, "Damos de alta las asignaturas ('salir' para parar).");
			do {
				nomAsi = JOptionPane.showInputDialog(null, "Introduzca el nombre de la asignatura:");
				if (nomAsi.equals("salir")) {
					break;
				}
				asi = buscaAsignatura(nomAsi, asignaturas);
				if (asi != null) {
					alu.matricular(asi);
				}
			} while (true);
		}
	}

	public static void muestraAsignaturas(ArrayList<Asignatura> asignaturas) {
		Iterator<Asignatura> iter = asignaturas.iterator();
		String asig = "";
		while (iter.hasNext()) {
			asig += iter.next().toString();
		}
		JOptionPane.showMessageDialog(null, asig);
	}

	public static void muestraAlumnos(ArrayList<Alumno> alumnos) {
		Iterator<Alumno> iter = alumnos.iterator();
		String alum = "";
		while (iter.hasNext()) {
			alum += iter.next().toString();
		}
		JOptionPane.showMessageDialog(null, alum);
	}

	public static void muestraAlumno(ArrayList<Alumno> alumnos) {
		String nomAlu = JOptionPane.showInputDialog(null, "Introduzca el nombre del alumno:");
		Alumno alu = buscaAlumno(nomAlu, alumnos);		
		if (alu != null) {
			JOptionPane.showMessageDialog(null, alu.verAlumno());
		}
	}

	public static Alumno buscaAlumno(String nombre, ArrayList<Alumno> alumnos) {
		Alumno alu;
		Iterator<Alumno> iter = alumnos.iterator();
		while (iter.hasNext()) {
			alu = iter.next();
			if (alu.getNombre().equals(nombre)) {
				return alu;
			}
		}
		JOptionPane.showMessageDialog(null, "El alumno " + nombre + " no existe.");
		return null;
	}

	public static Asignatura buscaAsignatura(String nombre, ArrayList<Asignatura> asignaturas) {
		Asignatura asi;
		Iterator<Asignatura> iter = asignaturas.iterator();
		while (iter.hasNext()) {
			asi = iter.next();
			if (asi.getNombre().equals(nombre)) {
				return asi;
			}
		}
		JOptionPane.showMessageDialog(null, "La asignatura " + nombre + " no existe");
		return null;
	}

	public static void iniciaAlumnos(ArrayList<Alumno> alumnos) {
		File f = new File("c:/Users/peixe/git/personals/Viernes13/alumnos.txt");
		String linea;
		String[] str;
		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				linea = s.nextLine();
				str = linea.split(",");
				alumnos.add(new Alumno(str[0], str[1], Integer.parseInt(str[2]), str[3]));
			}
			s.close();
		} catch (Exception e) {

		}
	}

	public static void iniciaAsignaturas(ArrayList<Asignatura> asignaturas) {
		File f = new File("c:/Users/peixe/git/personals/Viernes13/asignaturas.txt");
		String linea;
		String[] str;
		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				linea = s.nextLine();
				str = linea.split("-");
				asignaturas.add(new Asignatura(str[0], Integer.parseInt(str[1]), str[2], str[3]));
			}
			s.close();
		} catch (Exception e) {

		}
	}

	public static int validaEnteros(String concepto) {
		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la " + concepto));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Tiene que introducir un número válido.");
			}
		}
	}

	public static double validaNota() throws Exception {
		double nota = 0;
		try {
			nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la nota"));
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Tiene que introducir un número válido.");
		}
		
		if (nota >= 0 && nota <= 10) {
			return nota;
		} else {
			throw new Exception("La nota debe ser un valor entre 0 y 10");
		}
	}

	public static void escribeAlumno(Alumno alu) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("c:/Users/peixe/git/personals/Viernes13/alumnos.txt",true);
			pw = new PrintWriter(fichero);
			pw.println(alu.getDNI()+","+alu.getNombre()+","+alu.getEdad()+","+alu.getCurso());			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public static void escribeAsignatura(Asignatura asi) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("c:/Users/peixe/git/personals/Viernes13/alumnos.txt",true);
			pw = new PrintWriter(fichero);
			pw.println(asi.getNombre()+","+asi.getDuracion()+","+asi.getLibro()+","+asi.getProfesor());			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
