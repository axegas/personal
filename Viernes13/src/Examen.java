
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
}
