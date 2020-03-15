import javax.swing.JOptionPane;

public class Examen {

	private Alumno alumno;
	private Asignatura asignatura;
	private double nota;
	private String calificacion="SUSPENDIDO";
	
	public Examen(Alumno alumno, Asignatura asignatura, double nota) {
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
	public double getNota() {
		return nota;
	}
	public String getCalificacion() {
		return calificacion;
	}
	//toString
	public String toString() {
		return "Examen [alumno=" + alumno.getNombre() + ", asignatura=" + asignatura.getNombre() + ", nota=" + nota + ", calificacion="
				+ calificacion + "]\n";
	}
	//mostrar
	public void mostrar() {
		JOptionPane.showMessageDialog(null, this.toString()); 
	}
	


}
