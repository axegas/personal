package Fraccion;

public class Principal {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(10,8);
		Fraccion f2 = new Fraccion(3,5);
		Fraccion f3 = f1.suma(f2);
		System.out.println(f3.toString());
	}

}
