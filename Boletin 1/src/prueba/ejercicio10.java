package prueba;


public class ejercicio10 {

	public static void main(String[] args) {
		int ninyos = 15;
		int ninyas = 10;
		int total = ninyos + ninyas;
		int pninyos = (ninyos*100)/total;
		int pninyas = 100 - pninyos;
		
		System.out.println("Tenemos matriculados " + ninyos + " niños y " + ninyas + " niñas. En total, tenemos matriculados " + total + " alumnos, siendo un " + pninyos +"% perteneciente a los niños y " + pninyas + "% perteneciente a las niñas.");
		
		
	

	}

}