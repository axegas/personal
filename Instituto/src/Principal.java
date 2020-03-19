import java.util.*;
import java.sql.*;
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
			iniciarDatos(profesores,examenes,alumnos,asignaturas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		do {
			opc = menu();
			switch (opc) {
			case 1:
				altaAlumno(alumnos);
				break;
			case 2:
				altaAsignatura(asignaturas, profesores);
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
				muestraProfesor(profesores);
				break;
			case 9:
				muestraProfesores(profesores);
				break;
			case 10:
				muestraAsignaturas(asignaturas);
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
		menu += "8. Muestra profesor\n";
		menu += "9. Muestra profesores\n";
		menu += "10. Muestra asignaturas\n";
		menu += "-------------------\n";
		menu += "0. Salir\n";
		do {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menu", 1));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Tiene que introducir un número válido.");
			}
		} while (true);
	}

////////////////////////////////////altas////////////////////////////////////
	public static void altaAlumno(ArrayList<Alumno> alumnos) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		String DNI = JOptionPane.showInputDialog(null, "Dime el DNI:");
		int edad = validaEnteros("Edad");
		String curso = JOptionPane.showInputDialog(null, "Dime el curso:");
		Alumno alu = new Alumno(DNI, nombre, edad, curso);
		alumnos.add(alu);
		escribeAlumnoSQL(alu);
	}

	public static void altaAsignatura(ArrayList<Asignatura> asignaturas, ArrayList<Profesor> profesores) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		String libro = JOptionPane.showInputDialog(null, "Dime el libro:");
		int duracion = validaEnteros("duración");
		String profesor = JOptionPane.showInputDialog(null, "Introduzca el nombre del profesor:");
		Profesor p = buscaProfesor(profesor, profesores);
		Asignatura asi = new Asignatura(nombre, duracion, libro, p);
		asignaturas.add(asi);
		escribeAsignaturaSQL(asi);
	}

	public static void altaProfesor(ArrayList<Profesor> profesores) {
		String DNI = JOptionPane.showInputDialog(null, "Dime el DNI:");
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		int edad = validaEnteros("Edad");
		Profesor prof = new Profesor(DNI, nombre, edad);
		profesores.add(prof);
		escribeProfesorSQL(prof);
	}

////////////////////////////////////funciones////////////////////////////////////
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
					examinarSQL(e, alu);

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
					if (!alu.tieneAsig(asi)) {
						alu.matricular(asi);
						matricularSQL(alu, asi);
					} else {
						JOptionPane.showMessageDialog(null, "El alumno ya tiene esa asignatura.");
					}

				}
			} while (true);
		}
	}

////////////////////////////////////mostrar datos////////////////////////////////////
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

	public static void muestraProfesor(ArrayList<Profesor> profesores) {
		String nomProf = JOptionPane.showInputDialog(null, "Introduzca el nombre del profesor:");
		Profesor prof = buscaProfesor(nomProf, profesores);
		if (prof != null) {
			JOptionPane.showMessageDialog(null, prof.toString());
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

////////////////////////////////////busqueda////////////////////////////////////
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

////////////////////////////////////escritura en base de datos////////////////////////////////////
	public static void escribeProfesorSQL(Profesor profesor) {
		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO profesor VALUES (?,?,?,?)");

			preparedStatement.setInt(1, profesor.idprof);
			preparedStatement.setString(2, profesor.getDNI());
			preparedStatement.setString(3, profesor.getNombre());
			preparedStatement.setInt(4, profesor.getEdad());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void escribeAsignaturaSQL(Asignatura asignatura) {

		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO asignatura VALUES (?,?,?,?,?)");

			preparedStatement.setInt(1, asignatura.idasig);
			preparedStatement.setString(2, asignatura.getNombre());
			preparedStatement.setInt(3, asignatura.getDuracion());
			preparedStatement.setString(4, asignatura.getLibro());
			preparedStatement.setInt(5, asignatura.getProfesor().idprof);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void escribeAlumnoSQL(Alumno alumno) {
		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO alumno VALUES (?,?,?,?,?)");

			preparedStatement.setInt(1, alumno.idalu);
			preparedStatement.setString(2, alumno.getDNI());
			preparedStatement.setString(3, alumno.getNombre());
			preparedStatement.setInt(4, alumno.getEdad());
			preparedStatement.setString(5, alumno.getCurso());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

////////////////////////////////////validaciones////////////////////////////////////
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

////////////////////////////////////funciones SQL////////////////////////////////////
	public static void matricularSQL(Alumno alumno, Asignatura asignatura) {
		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO matricula VALUES (?,?)");
			preparedStatement.setInt(1, alumno.idalu);
			preparedStatement.setInt(2, asignatura.idasig);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void examinarSQL(Examen examen, Alumno alu) {
		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO examen VALUES (?,?,?,?)");
			PreparedStatement preparedStatement2 = cn.prepareStatement("UPDATE alumno SET notamedia = ? WHERE idalumno = ?");
			preparedStatement.setInt(1, examen.idex);
			preparedStatement.setInt(2, examen.getAlumno().idalu);
			preparedStatement.setInt(3, examen.getAsignatura().idasig);
			preparedStatement.setDouble(4, examen.getNota());
			preparedStatement2.setDouble(1, alu.getNotaMedia());
			preparedStatement2.setInt(2, alu.idalu);
			preparedStatement.executeUpdate();
			preparedStatement2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

////////////////////////////////////////lectura datos SQL /////////////////////////////
	
	public static void iniciarDatos(ArrayList<Profesor> profesores,ArrayList<Examen> examenes, ArrayList<Alumno> alumnos,	ArrayList<Asignatura> asignaturas) {
		conexion conec = new conexion();
		Connection cn = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		ResultSet rs4 = null;
		ResultSet rs5 = null;
		Statement stm = null;
		Alumno alu;
		Examen ex;
		Asignatura asig;
		Profesor p;
		try {
			cn = conec.conectar();
			stm = cn.createStatement();
			
			rs = stm.executeQuery("SELECT * FROM profesor");
			while (rs.next()) {
				profesores.add(new Profesor(rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			
			rs2 = stm.executeQuery("SELECT * FROM asignatura");
			while (rs2.next()) {
				p = buscaProfesorPorID(rs2.getInt(5), profesores);
				asignaturas.add(new Asignatura(rs2.getString(2), rs2.getInt(3), rs2.getString(4), p));
			}
			rs3 = stm.executeQuery("SELECT * FROM alumno");
			while (rs3.next()) {
				alumnos.add(new Alumno(rs3.getString(2), rs3.getString(3), rs3.getInt(4), rs3.getString(5)));
			}
			rs4 = stm.executeQuery("SELECT * FROM matricula");
			while (rs4.next()) {
				alu = buscaAlumnoPorID(rs4.getInt(1), alumnos);
				asig = buscaAsignaturaPorID(rs4.getInt(2), asignaturas);
				alu.getAsignaturas().add(asig);
			}
			rs5 = stm.executeQuery("SELECT * FROM examen");
			while (rs5.next()) {
				alu = buscaAlumnoPorID(rs5.getInt(2), alumnos);
				asig = buscaAsignaturaPorID(rs5.getInt(3), asignaturas);
				ex = new Examen(alu, asig, rs5.getDouble(4));
				alu.examinar(ex);
				examenes.add(ex);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (rs2 != null) {
					rs2.close();
				}
				if (rs3 != null) {
					rs3.close();
				}
				if (rs4 != null) {
					rs4.close();
				}
				if (rs5 != null) {
					rs5.close();
				}
				if (stm != null) {
					stm.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
/////////////////////////////////buscar elementos por ID/////////////////////////////////////////////////
	public static Alumno buscaAlumnoPorID(int id, ArrayList<Alumno> alumnos) {
		Alumno alu;
		Iterator<Alumno> iter = alumnos.iterator();
		while (iter.hasNext()) {
			alu = iter.next();
			if (alu.idalu == id) {
				return alu;
			}
		}
		return null;
	}

	public static Asignatura buscaAsignaturaPorID(int id, ArrayList<Asignatura> asignaturas) {
		Asignatura asig;
		Iterator<Asignatura> iter = asignaturas.iterator();
		while (iter.hasNext()) {
			asig = iter.next();
			if (asig.idasig == id) {
				return asig;
			}
		}
		return null;
	}

	public static Profesor buscaProfesorPorID(int id, ArrayList<Profesor> profesores) {
		Profesor prof;
		Iterator<Profesor> iter = profesores.iterator();
		while (iter.hasNext()) {
			prof = iter.next();
			if (prof.idprof == id) {
				return prof;
			}
		}
		return null;
	}	
}
