import java.util.Scanner;

public class Reto4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int casos, altura, suma, anterior;
		do {
			altura = 0;
			suma = 0;
			anterior = 0;
			casos = teclado.nextInt();
			if (casos == 0) {
				break;
			}
			for (int i = 0; i < casos; i++) {
				altura = teclado.nextInt();

				if (i != 0) {
					if (anterior > altura) {
						suma = suma - altura;
					} else {
						suma = suma + altura;
					}
				} else {
					suma = altura;
				}
				anterior = altura;
			}
			System.out.println(suma);
		} while (casos != 0);
	}

}
