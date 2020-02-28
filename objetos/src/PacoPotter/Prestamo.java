package PacoPotter;

public class Prestamo {

	private Alumno alumno;
	private Libro libro;
	
	public Prestamo(Alumno alumno, Libro libro) {
		this.alumno=alumno;
		this.libro=libro;
	}
	

	public void verPrestamo() {
		System.out.println("\t-" + libro.getTitulo() + " | " + libro.getAutor() + " | " + libro.getPaginas() + "pags. prestado a: " + alumno.getDni() + " | " + alumno.getNombre() + " | " + alumno.getEdad() + " años. ");
	}
	public Libro getLibro() {
		return libro;
	}
	
}
