import java.util.Arrays;
import java.util.Scanner;

public class Reto3 {


	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int casos, peso, max;
		int[] vector;
		do {
			max = 0;
			casos = teclado.nextInt();
			if (casos == 0) {
				System.exit(0);
			}
			vector = new int[casos];
			for (int i = 0; i < casos; i++) {
				peso = teclado.nextInt();
				vector[i] = peso;
			}
			Arrays.sort(vector);
			for (int i = 0; i < vector.length; i = i + 2) {
				if (vector[i + 1] - vector[i] > max) {
					max = vector[i + 1] - vector[i];
				}

			}
			System.out.println(max);
		} while (casos != 0);
	}

}