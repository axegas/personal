package PacoPotter;

import java.util.*;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		/*
		HashMap<String, Libro> libros = new HashMap<String, Libro>();
		HashMap<String, Alumno> alumnos = new HashMap<String, Alumno>();
		HashMap<String, Prestamo> prestamos = new HashMap<String, Prestamo>();*/
		
		int opc;
		
		do {
			opc = menu();			
			switch(opc){
			case 1:
				altaLibro(libros);
				break;
			case 2:
				altaAlumno(alumnos);
				break;
			case 3:
				prestaLibro(libros,alumnos,prestamos);
				break;
			case 4:
				devuelveLibro(libros,alumnos,prestamos);
				break;
			case 5:
				resumen(libros,alumnos,prestamos);
				break;
			case 9:
				//System.out.println("Que la fuerza te acompañe...");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;			
			}			
		}while(opc!=9);
		

	}
	public static int menu() {	
		System.out.println("-----------Menu de la biblioteca-----------");
		System.out.println("1-Dar de Alta de un libro");
		System.out.println("2-Dar de Alta de un alumno");
		System.out.println("3-Prestar un libro");
		System.out.println("4-Devolver un libro");
		System.out.println("5-Resumen");		
		System.out.println("9-Salir");
		System.out.println("----------------------------------------");
		return validaEnteros();
	}
	
	public static void altaLibro(ArrayList<Libro> libros) {
		System.out.println("Introduzca el titulo del libro numero " + (libros.size()+1));
		String titulo = scan.nextLine();
		System.out.println("Introduzca su autor:");
		String autor = scan.nextLine();
		System.out.println("Introduzca numero de paginas:");
		int paginas = validaEnteros();
		libros.add(new Libro(titulo,autor,paginas));
		System.out.println("Se ha dado de alta el siguiente ejemplar:");		
		System.out.println(libros.get(libros.size()-1).verLibro());		
	}
	public static void altaAlumno(ArrayList<Alumno> alumnos) {
		System.out.println("Introduzca el DNI del alumno numero " + (alumnos.size()+1));
		String DNI = scan.nextLine();
		System.out.println("Introduzca su nombre:");
		String nombre = scan.nextLine();
		System.out.println("Introduzca su edad:");
		int edad = validaEnteros();
		alumnos.add(new Alumno(DNI,nombre,edad));	
		System.out.println("Se ha dado de alta el siguiente alumno:");		
		System.out.println(alumnos.get(alumnos.size()-1).verAlumno());	
	}
	
	public static void prestaLibro(ArrayList<Libro> libros, ArrayList<Alumno> alumnos, ArrayList<Prestamo> prestamos) {		
		String DNI;
		Boolean valido = false;	
		Libro libroAux = null;
		Alumno aluAux = null;
		do {
			System.out.println("Introduzca DNI del alumno:");
			DNI = scan.nextLine();
			Iterator<Alumno> iterAlumno = alumnos.iterator();
			while(iterAlumno.hasNext()) {
				aluAux = iterAlumno.next();
				if(aluAux.getDni().equals(DNI)) {
					valido=true;
				}
			}			
		}while(!valido);
		String titulo;
		valido = false;
		do {
			System.out.println("Introduzca titulo del libro a prestar:");
			titulo = scan.nextLine();
			Iterator<Libro> iterLibro = libros.iterator();
			while(iterLibro.hasNext()) {
				libroAux = iterLibro.next();
				if(libroAux.getTitulo().equals(titulo)) {
					if(!libroAux.getEstado()) {
						libroAux.prestar();
						Prestamo prest = new Prestamo(aluAux,libroAux);
						prestamos.add(prest);
						prest.verPrestamo();
						valido=true;	
					}else {
						System.out.println("Lo siento, el libro está prestado.");
					}
					
				}
			}			
		}while(!valido);		
	}
	public static void devuelveLibro(ArrayList<Libro> libros, ArrayList<Alumno> alumnos, ArrayList<Prestamo> prestamos) {
		String DNI;
		Boolean valido = false;	
		Libro libroAux = null;
		Alumno aluAux = null;
		Prestamo prestAux;
		do {
			System.out.println("Introduzca DNI del alumno:");
			DNI = scan.nextLine();
			Iterator<Alumno> iterAlumno = alumnos.iterator();
			while(iterAlumno.hasNext()) {
				aluAux = iterAlumno.next();
				if(aluAux.getDni().equals(DNI)) {
					valido=true;
				}
			}			
		}while(!valido);
		String titulo;
		valido = false;
		do {
			System.out.println("Introduzca titulo del libro a devolver:");
			titulo = scan.nextLine();
			Iterator<Libro> iterLibro = libros.iterator();
			while(iterLibro.hasNext()) {
				libroAux = iterLibro.next();
				if(libroAux.getTitulo().equals(titulo)) {
					if(!libroAux.getEstado()) {
						System.out.println("Este libro no esta prestado");
						
					}else {
						libroAux.devolver();
						Iterator<Prestamo> iterPrestamo = prestamos.iterator();
						while(iterPrestamo.hasNext()) {
							prestAux = iterPrestamo.next();
							if(prestAux.getLibro().getTitulo().equals(libroAux.getTitulo())){
								prestamos.remove(prestAux);
							}
						}
						valido=true;	
					}
					
				}
			}			
		}while(!valido);
	}
	public static void resumen(ArrayList<Libro> libros, ArrayList<Alumno> alumnos, ArrayList<Prestamo> prestamos) {
		Iterator<Libro> iterLibro = libros.iterator();
		Iterator<Alumno> iterAlumno = alumnos.iterator();
		Iterator<Prestamo> iterPrestamo = prestamos.iterator();
		System.out.println("+Alumnos dados de alta:");
		while(iterAlumno.hasNext()) {
			System.out.println(iterAlumno.next().verAlumno());
		}
		System.out.println("+Libros dados de alta:");
		while(iterLibro.hasNext()) {
			System.out.println(iterLibro.next().verLibro());
		}
		System.out.println("+Prestamos efectuados:");
		while(iterPrestamo.hasNext()) {
			iterPrestamo.next().verPrestamo();
		}		
	}
	
	public static int validaEnteros() {		
		while(true) {
			try {
				return Integer.parseInt(scan.nextLine());
				
			}catch(NumberFormatException e) {
				System.out.println("Tiene que introducir un número válido.");				
			}
		}	
	}
	

}
