package prueba;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 2;
		float b = 3;
		float c = 1;
		float dividendo;
		float divisor;
		float raiz = (float) (Math.pow(b,2) - 4*a*c);
		float x;
		
		raiz = (float) Math.sqrt(raiz);
		dividendo = raiz-b;
		divisor = 2*a;
		
		x = dividendo/divisor;
		
		System.out.println("El valor de x siendo a = " + a + ", b = " + b + " y c = " + c + " es igual a " + x);
		

	}

}
