package prueba;

public class Ejercicio27 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
			
		x++; //Actualizo x;
		System.out.println(x); //muestra 11
		
		System.out.println(++x); //primero actualiza y luego muestra 12
		System.out.println(x); //muestra 12
		
	
		System.out.println(x++); //primero muestra 12 y luego actualiza
		System.out.println(x); //muestra 13
		
		System.out.println(x++); //primero muestra 13 y luego actualiza a 14
		System.out.println(++x); //primero actualiza a 15 y luego muestra
		
		
	}

}
