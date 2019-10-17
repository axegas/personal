package prueba;

public class ejercicio11 {

	public static void main(String[] args) {
		float altura = 181;
		float peso = 80000;
		float imc;
		
		altura=altura/100;
		peso=peso/1000;
		
		imc=peso/(altura*altura);
		
		System.out.println("El IMC calculado es: " + imc);


	}

}
