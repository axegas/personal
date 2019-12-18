import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int co2, botella, suma, contador;
		int casos = teclado.nextInt();
		for (int i = 0; i < casos; i++) {
			co2 = teclado.nextInt();
			co2 = co2 * 8;
			suma = 0;
			contador = 0;
			do {
				contador++;
				botella = teclado.nextInt();
				if (botella == 0) {
					break;
				}
				suma = botella + suma;
				if (co2 <= suma) {
					break;
				}
			} while (botella != 0);
			if (co2 <= suma) {
				System.out.println(contador);
			} else {
				System.out.println("SIGAMOS RECICLANDO");
			}
			teclado.nextLine();
		}

	}
}