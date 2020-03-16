import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws Exception {
		int opc;

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		ArrayList<Examen> examenes = new ArrayList<Examen>();
		try {
			iniciaProfesores(profesores);
			iniciaAlumnos(alumnos);
			iniciaAsignaturas(asignaturas,profesores);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		do {
			opc = menu();
			switch (opc) {
			case 1:
				altaAlumno(alumnos);
				break;
			case 2:
				altaAsignatura(asignaturas,profesores);
				break;
			case 3:
				altaProfesor(profesores);
				break;
			case 4:
				matricular(alumnos, asignaturas);
				break;
			case 5:
				examinar(alumnos, asignaturas, examenes);				
				break;
			case 6:		
				muestraAlumno(alumnos);
				break;
			case 7:
				muestraAlumnos(alumnos);
				break;
			case 8:
				muestraAsignaturas(asignaturas);
				break;
			case 9:
				muestraProfesores(profesores);
				break;				
			case 0:
				JOptionPane.showMessageDialog(null, "Hasta luego.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
				break;
			}
		} while (opc != 0);
	}

	public static int menu() {
		String menu = "";
		menu += "1. Alta alumno\n";
		menu += "2. Alta asignatura\n";
		menu += "3. Alta profesor\n";
		menu += "-------------------\n";
		menu += "4. Matricular\n";
		menu += "5. Examinar\n";
		menu += "-------------------\n";
		menu += "6. Mostrar alumno\n";
		menu += "7. Muestra alumnos\n";
		menu += "8. Muestra asignaturas\n";
		menu += "9. Muestra profesores\n";
		menu += "-------------------\n";
		menu += "0. Salir\n";	
		do {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Menu", 1));
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

	public static void altaAsignatura(ArrayList<Asignatura> asignaturas,ArrayList<Profesor> profesores) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		String libro = JOptionPane.showInputDialog(null, "Dime el libro:");
		int duracion = validaEnteros("duración");
		String profesor = JOptionPane.showInputDialog(null, "Introduzca el nombre del profesor:");
		Profesor p = buscaProfesor(profesor,profesores);
		Asignatura asi = new Asignatura(nombre, duracion, libro, p);
		asignaturas.add(asi);
		escribeAsignatura(asi);
	}
	
	public static void altaProfesor(ArrayList<Profesor> profesores) {
		String DNI = JOptionPane.showInputDialog(null, "Dime el DNI:");
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");		
		int edad = validaEnteros("Edad");
		Profesor prof = new Profesor(DNI, nombre, edad);
		profesores.add(prof);
		escribeProfesor(prof);
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
	
	public static void muestraProfesores(ArrayList<Profesor> profesores) {
		Iterator<Profesor> iter = profesores.iterator();
		String prof = "";
		while (iter.hasNext()) {
			prof += iter.next().toString();
		}
		JOptionPane.showMessageDialog(null, prof);
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

	public static Profesor buscaProfesor(String nombre, ArrayList<Profesor> profesores) {
		Profesor prof;
		Iterator<Profesor> iter = profesores.iterator();
		while (iter.hasNext()) {
			prof = iter.next();
			if (prof.getNombre().equals(nombre)) {
				return prof;
			}
		}
		JOptionPane.showMessageDialog(null, "El profesor " + nombre + " no existe.");
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

	public static void iniciaAlumnos(ArrayList<Alumno> alumnos) throws Exception {
		File f = new File("alumnos.txt");
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
			throw new Exception("Fichero alumnos no encontrado");
		}
	}
	
	public static void iniciaProfesores(ArrayList<Profesor> profesores) throws Exception {
		File f = new File("profesores.txt");
		String linea;
		String[] str;
		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				linea = s.nextLine();
				str = linea.split(",");
				profesores.add(new Profesor(str[0], str[1], Integer.parseInt(str[2])));
			}
			s.close();
		} catch (Exception e) {
			throw new Exception("Fichero profesores no encontrado");
		}
	}

	public static void iniciaAsignaturas(ArrayList<Asignatura> asignaturas,ArrayList<Profesor> profesores) throws Exception {
		File f = new File("asignaturas.txt");
		String linea;
		Profesor p;
		String[] str;
		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				linea = s.nextLine();
				str = linea.split(",");
				p = buscaProfesor(str[3],profesores);
				asignaturas.add(new Asignatura(str[0], Integer.parseInt(str[1]), str[2],p));
			}
			s.close();
		} catch (Exception e) {
			throw new Exception("Fichero asignaturas no encontrado");
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
			fichero = new FileWriter("alumnos.txt",true);
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
	public static void escribeProfesor(Profesor prof) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("profesores.txt",true);
			pw = new PrintWriter(fichero);
			pw.println(prof.getDNI()+","+prof.getNombre()+","+prof.getEdad());			
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
			fichero = new FileWriter("asignatura.txt",true);
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
