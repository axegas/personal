import java.util.*;

import javax.swing.JOptionPane;

public class Alumno {
	
	//atributos
	private String nombre;
	private int edad;
	private String curso;
	private String DNI;
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	private ArrayList<Examen> examenes = new ArrayList<Examen>();
	private double notaMedia = 0;
	
	//constructor
	public Alumno(String DNI,String nombre,int edad,String curso) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	//geters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getCurso() {
		return curso;
	}
	public String getDNI() {
		return DNI;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public ArrayList<Asignatura> getAsignaturas(){
		return asignaturas;
	}
	
	//toString
	public String toString() {
		return "[ " + nombre + ", " + edad + " años, curso: " + curso + ", DNI: " + DNI + " ]\n";
	}
	public String verAlumno() {
		String str = "Asignaturas:\n";
		Iterator<Asignatura> iter = asignaturas.iterator();
		while(iter.hasNext()) {
			str += "\t" + iter.next().toString();
		}
		return this.toString() + str + "Nota media del curso: " + this.notaMedia;
	}
	//mostrar
	public void mostrar() {		
		JOptionPane.showMessageDialog(null, this.toString()); 
	}
	//metodos
	public void matricular(Asignatura as) {
		asignaturas.add(as);
	}
	
	public void examinar(Examen e) {
		notaMedia=0;
		examenes.add(e);
		Iterator<Examen> iter = examenes.iterator();
		while(iter.hasNext()) {
			notaMedia+=iter.next().getNota();
		}
		notaMedia=notaMedia/examenes.size();		
	}
	public boolean tieneAsig(Asignatura a) {
		boolean existe = false;
		Iterator<Asignatura> iter = asignaturas.iterator();	
		while(iter.hasNext()&&!existe) {
			if(a.equals(iter.next())) {
				existe = true;
			}
		}
		return existe;
	}



}
