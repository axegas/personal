import matematicas.Funciones;
import matematicas.Matematicas;

public class Asdsdghsd {

	public static void main(String[] args) {
		int[][] v = new int[3][3];
		Funciones.muestraMatriz(v);
		int[] c= {2,3,4};
		v[0]=c;
		Funciones.muestraMatriz(v);
		v[1][0]=3;
		vector(c);
		System.out.println(v);
		
		System.out.println(Matematicas.fibonacci(6));

		
	}
	public static void vector(int[] v) {
		v[1]=2;

	}

	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);

	}
}
