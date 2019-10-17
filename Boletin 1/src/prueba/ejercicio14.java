package prueba;

public class ejercicio14 {

	public static void main(String[] args) {
		float a=2;
		float b=3;
		
		System.out.println("Vamos a utilizar las variables " + a + " y " + b);
		System.out.println("Si " + a + " fuera la altura y " + b + " la base de un triángulo, el area de ese triángulo sería " + (a*b)/2);
		System.out.println("Si " + a + " fuera un lado de un cuadrado, su area sería " + (a*a));
		System.out.println("Si " + a + " fuera un radio de un círculo, su area sería " + (Math.PI*(Math.pow(a, 2))));
		

	}

}