package prueba;

public class ejercicio9 {

	public static void main(String[] args) {
		int edad = 27;
		int aux;
		float secreto;
		
		aux = 1492/edad;
		aux = aux - 19;
		secreto = (float) aux;
		secreto = (float) Math.sqrt(aux);
		
		System.out.println("El número secreto es... " + secreto);
		
		


	}

}
