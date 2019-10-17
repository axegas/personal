package prueba;

public class ejercicio7 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c;
		
		System.out.println("Al principio del programa, el valor de A es " + a + " y el valor de B es " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Después del intercambio, el valor de A es " + a + " y el valor de B es " + b + ".");

	}
}

