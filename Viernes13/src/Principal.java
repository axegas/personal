import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opc;

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		ArrayList<Examen> examenes = new ArrayList<Examen>();

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
				
			case 7:
				System.out.println("Hasta luego.");
				break;
			default:
				System.out.println("Número incorrecto.");
				break;
			}

		} while (opc != 7);

	}

	public static int menu() {
		System.out.println("1-Alta alumno");
		System.out.println("2-Alta asignatura");
		System.out.println("3-Matricular");
		System.out.println("4-Muestra asignaturas");
		System.out.println("5-Muestra alumnos");
		System.out.println("6-Salir");
		return validaEnteros();
	}

	public static void altaAlumno(ArrayList<Alumno> alumnos) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el nombre:");
		String nombre = scan.nextLine();
		System.out.println("Dime el apellido:");
		String primape = scan.nextLine();
		System.out.println("Dime el DNI:");
		String DNI = scan.nextLine();
		System.out.println("Dime la edad:");
		int edad = validaEnteros();
		System.out.println("Dime el curso:");
		String curso = scan.nextLine();

		alumnos.add(new Alumno(DNI, nombre, primape, edad, curso));
	}

	public static void altaAsignatura(ArrayList<Asignatura> asignaturas) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el nombre:");
		String nombre = scan.nextLine();
		System.out.println("Dime el libro:");
		String libro = scan.nextLine();
		System.out.println("Dime el profesor:");
		String profesor = scan.nextLine();
		System.out.println("Dime la duración:");
		int duracion = validaEnteros();

		asignaturas.add(new Asignatura(nombre, duracion, libro, profesor));
	}
	public static void examinar(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas,ArrayList<Examen> examenes ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime el nombre del alumno:");
		String nomAlu = scan.nextLine();
		Alumno alu = buscaAlumno(nomAlu,alumnos);
		
		System.out.println("Dime el nombre de la asignatura:");
		String nomAsi = scan.nextLine();
		Asignatura asi = buscaAsignatura(nomAsi,asignaturas);
		
		System.out.println("Dime el nombre de la asignatura:");
		int nota = validaEnteros();
		
		examenes.add(new Examen(alu,asi,nota));
		
		
	}
	public static void matricular(ArrayList<Alumno> alumnos, ArrayList<Asignatura> asignaturas) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el nombre del alumno:");
		String nomAlu = scan.nextLine();
		Alumno alu = buscaAlumno(nomAlu,alumnos);
		Asignatura asi;
		String nomAsi;
		if(alu!=null) {
			System.out.println("Damos de alta las asignaturas ('salir' para parar).");
			do {
				System.out.println("Dime el nombre de la asignatura:");
				nomAsi = scan.nextLine();
				if(nomAsi.equals("salir")) {
					break;
				}
				asi = buscaAsignatura(nomAsi,asignaturas);
				if(asi!=null) {
					alu.matricular(asi);
				}				
			}while(true);			
		}
		
	}
	public static void muestraAsignaturas(ArrayList<Asignatura> asignaturas) {
		Iterator<Asignatura> iter = asignaturas.iterator();
		while(iter.hasNext()) {
			iter.next().mostrar();
		}
	}
	public static void muestraAlumnos(ArrayList<Alumno> alumnos) {
		Iterator<Alumno> iter = alumnos.iterator();
		while(iter.hasNext()) {
			iter.next().mostrar();
		}
	}
	
	public static Alumno buscaAlumno(String nombre, ArrayList<Alumno> alumnos) {		
		Alumno alu;
		Iterator<Alumno> iter = alumnos.iterator();
		while(iter.hasNext()) {
			alu = iter.next();
			if(alu.getNombre().equals(nombre)) {
				return alu;
			}
		}
		System.out.println("El alumno no existe.");	
		return null;
	}
	public static Asignatura buscaAsignatura(String nombre,ArrayList<Asignatura> asignaturas) {		
		Asignatura asi;
		Iterator<Asignatura> iter = asignaturas.iterator();
		while(iter.hasNext()) {
			asi = iter.next();
			if(asi.getNombre().equals(nombre)) {
				return asi;
			}
		}
		System.out.println("La asignatura no existe.");	
		return null;
	}

	public static int validaEnteros() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				return Integer.parseInt(scan.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Tiene que introducir un número válido.");

			}
		}
	}

}
