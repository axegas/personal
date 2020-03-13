
public class Examen {

	private Alumno alumno;
	private Asignatura asignatura;
	private int nota;
	private String calificacion="SUSPENDIDO";
	
	public Examen(Alumno alumno, Asignatura asignatura, int nota) {
		this.alumno = alumno;
		this.asignatura = asignatura;
		this.nota = nota;
		if(nota>=5) {
			calificacion="APROBADO";
		}		
	}
	//getters
	public Alumno getAlumno() {
		return alumno;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public int getNota() {
		return nota;
	}
	public String getCalificacion() {
		return calificacion;
	}
	//toString
	public String toString() {
		return "Examen [alumno=" + alumno + ", asignatura=" + asignatura + ", nota=" + nota + ", calificacion="
				+ calificacion + "]";
	}
	//mostrar
	public void mostrar() {
		System.out.println("Examen [alumno=" + alumno.getNombre() + ", asignatura=" + asignatura.getNombre() + ", nota=" + nota + ", calificacion="
				+ calificacion + "]");
	}
	


}
