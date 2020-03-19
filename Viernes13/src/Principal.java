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
			///// ficheros/////
			// iniciaProfesores(profesores);
			// iniciaAlumnos(alumnos);
			// iniciaAsignaturas(asignaturas, profesores);

			/// SQL///

			iniciaProfesoresSQL(profesores);
			iniciaAsignaturasSQL(asignaturas, profesores);
			iniciaAlumnosSQL(alumnos, asignaturas);
			iniciaExamenesSQL(examenes, alumnos, asignaturas);
			// notaMedia(alumnos);
			// anyadeIDS(asignaturas);
			// escribeAlumnosSQL(alumnos);
			// escribeAsignaturasSQL(asignaturas);
			// escribeProfesoresSQL(profesores);

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
				JOptionPane.showMessageDialog(null, "Tiene que introducir un n�mero v�lido.");
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
		escribeAlumno(alu);
		escribeAlumnoSQL(alu);
	}

	public static void altaAsignatura(ArrayList<Asignatura> asignaturas, ArrayList<Profesor> profesores) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		String libro = JOptionPane.showInputDialog(null, "Dime el libro:");
		int duracion = validaEnteros("duraci�n");
		String profesor = JOptionPane.showInputDialog(null, "Introduzca el nombre del profesor:");
		Profesor p = buscaProfesor(profesor, profesores);
		Asignatura asi = new Asignatura(nombre, duracion, libro, p);
		asignaturas.add(asi);
		escribeAsignatura(asi);
		escribeAsignaturaSQL(asi);
	}

	public static void altaProfesor(ArrayList<Profesor> profesores) {
		String DNI = JOptionPane.showInputDialog(null, "Dime el DNI:");
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:");
		int edad = validaEnteros("Edad");
		Profesor prof = new Profesor(DNI, nombre, edad);
		profesores.add(prof);
		escribeProfesor(prof);
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
					if (alu.tieneAsig(asi)) {
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
			JOptionPane.showMessageDialog(null, prof.verProfesor());
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
			preparedStatement.setInt(5, asignatura.getProfesorOb().idprof);
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
				JOptionPane.showMessageDialog(null, "Tiene que introducir un n�mero v�lido.");
			}
		}
	}

	public static double validaNota() throws Exception {
		double nota = 0;
		try {
			nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la nota"));
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Tiene que introducir un n�mero v�lido.");
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
			PreparedStatement preparedStatement2 = cn
					.prepareStatement("UPDATE alumno SET notamedia = ? WHERE idalumno = ?");
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
	public static void iniciaAlumnosSQL(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas) {
		conexion conec = new conexion();
		Connection cn = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		Statement stm = null;
		Alumno alu;
		Asignatura asig;
		try {
			cn = conec.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM alumno");
			while (rs.next()) {
				alumnos.add(new Alumno(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5)));
			}
			rs2 = stm.executeQuery("SELECT * FROM matricula");
			while (rs2.next()) {
				alu = buscaAlumnoPorID(rs2.getInt(1), alumnos);
				asig = buscaAsignaturaPorID(rs2.getInt(2), asignaturas);
				alu.getAsignaturas().add(asig);
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

	public static void iniciaAsignaturasSQL(ArrayList<Asignatura> asignaturas, ArrayList<Profesor> profesores) {
		conexion conec = new conexion();
		Connection cn = null;
		ResultSet rs = null;
		Statement stm = null;
		Profesor p;
		try {
			cn = conec.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM asignatura");

			while (rs.next()) {
				p = buscaProfesorPorID(rs.getInt(5), profesores);
				asignaturas.add(new Asignatura(rs.getString(2), rs.getInt(3), rs.getString(4), p));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
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

	public static void iniciaProfesoresSQL(ArrayList<Profesor> profesores) {
		conexion conec = new conexion();
		Connection cn = null;
		ResultSet rs = null;
		Statement stm = null;
		try {
			cn = conec.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM profesor");

			while (rs.next()) {
				profesores.add(new Profesor(rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
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

	public static void iniciaExamenesSQL(ArrayList<Examen> examenes, ArrayList<Alumno> alumnos,
			ArrayList<Asignatura> asignaturas) {
		conexion conec = new conexion();
		Connection cn = null;
		ResultSet rs = null;
		Statement stm = null;
		Alumno alu;
		Examen ex;
		Asignatura asig;
		try {
			cn = conec.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM examen");

			while (rs.next()) {
				alu = buscaAlumnoPorID(rs.getInt(2), alumnos);
				asig = buscaAsignaturaPorID(rs.getInt(3), asignaturas);
				ex = new Examen(alu, asig, rs.getDouble(4));
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
//////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////a partir de aqu� esto no lo vuelvo a usar//////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////escritura en base de datos (inicial)////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void escribeAlumnosSQL(ArrayList<Alumno> alumnos) {
		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO alumno VALUES (?,?,?,?,?)");
			for (int i = 0; i < alumnos.size(); i++) {
				preparedStatement.setInt(1, alumnos.get(i).idalu);
				preparedStatement.setString(2, alumnos.get(i).getDNI());
				preparedStatement.setString(3, alumnos.get(i).getNombre());
				preparedStatement.setInt(4, alumnos.get(i).getEdad());
				preparedStatement.setString(5, alumnos.get(i).getCurso());
				preparedStatement.executeUpdate();
			}
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

	public static void escribeAsignaturasSQL(ArrayList<Asignatura> asignaturas) {

		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO asignatura VALUES (?,?,?,?,?)");
			for (int i = 0; i < asignaturas.size(); i++) {
				preparedStatement.setInt(1, asignaturas.get(i).idasig);
				preparedStatement.setString(2, asignaturas.get(i).getNombre());
				preparedStatement.setInt(3, asignaturas.get(i).getDuracion());
				preparedStatement.setString(4, asignaturas.get(i).getLibro());
				preparedStatement.setString(5, asignaturas.get(i).getProfesor());
				preparedStatement.executeUpdate();
			}
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

	public static void escribeProfesoresSQL(ArrayList<Profesor> profesores) {
		conexion conec = new conexion();
		Connection cn = null;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn.prepareStatement("INSERT INTO profesor VALUES (?,?,?,?)");
			for (int i = 0; i < profesores.size(); i++) {
				preparedStatement.setInt(1, profesores.get(i).idprof);
				preparedStatement.setString(2, profesores.get(i).getDNI());
				preparedStatement.setString(3, profesores.get(i).getNombre());
				preparedStatement.setInt(4, profesores.get(i).getEdad());
				preparedStatement.executeUpdate();
			}
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

	public static void anyadeIDS(ArrayList<Asignatura> asignaturas) {
		conexion conec = new conexion();
		Connection cn = null;
		Asignatura a;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn
					.prepareStatement("UPDATE asignatura SET idprofesor = ? WHERE profesor = ?");
			Iterator<Asignatura> iter = asignaturas.iterator();
			while (iter.hasNext()) {
				a = iter.next();
				preparedStatement.setInt(1, a.getProfesorOb().idprof);
				preparedStatement.setString(2, a.getProfesorOb().getNombre());
				preparedStatement.executeUpdate();
			}

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

	public static void notaMedia(ArrayList<Alumno> alumnos) {
		conexion conec = new conexion();
		Connection cn = null;
		Alumno a;
		try {
			cn = conec.conectar();
			PreparedStatement preparedStatement = cn
					.prepareStatement("UPDATE alumno SET notamedia = ? WHERE idalumno = ?");
			Iterator<Alumno> iter = alumnos.iterator();
			while (iter.hasNext()) {
				a = iter.next();
				preparedStatement.setDouble(1, a.getNotaMedia());
				preparedStatement.setInt(2, a.idalu);
				preparedStatement.executeUpdate();
			}

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

////////////////////////////////////lectura ficheros////////////////////////////////////
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

	public static void iniciaAsignaturas(ArrayList<Asignatura> asignaturas, ArrayList<Profesor> profesores)
			throws Exception {
		File f = new File("asignaturas.txt");
		String linea;
		Profesor p;
		Asignatura a;
		String[] str;
		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				linea = s.nextLine();
				str = linea.split(",");
				p = buscaProfesor(str[3], profesores);
				a = new Asignatura(str[0], Integer.parseInt(str[1]), str[2], p);
				p.getAsignaturas().add(a);
				asignaturas.add(a);
			}
			s.close();
		} catch (Exception e) {
			throw new Exception("Fichero asignaturas no encontrado");
		}
	}

////////////////////////////////////escritura en ficheros////////////////////////////////////
	public static void escribeAlumno(Alumno alu) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("alumnos.txt", true);
			pw = new PrintWriter(fichero);
			pw.println(alu.getDNI() + "," + alu.getNombre() + "," + alu.getEdad() + "," + alu.getCurso());
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
			fichero = new FileWriter("profesores.txt", true);
			pw = new PrintWriter(fichero);
			pw.println(prof.getDNI() + "," + prof.getNombre() + "," + prof.getEdad());
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
			fichero = new FileWriter("asignaturas.txt", true);
			pw = new PrintWriter(fichero);
			pw.println(
					asi.getNombre() + "," + asi.getDuracion() + "," + asi.getLibro() + "," + asi.getProfesor() + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fichero != null)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
