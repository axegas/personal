import java.util.concurrent.ThreadLocalRandom;

public class Ejer69 {

	public static void main(String[] args) {
		int valor = ThreadLocalRandom.current().nextInt(65, 65+26);
		char letra = (char) valor;		

	}

}
