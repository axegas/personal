package iesserpis.ed;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer59 {

	public static void main(String[] args) {
		int tirada1=0;
		int tirada2=0;
		int min=1;
		int max=10;
		int i=1;
		System.out.println("Vamos a tirar los dados!");
		do {			
			tirada1 = ThreadLocalRandom.current().nextInt(min, max);
			tirada2 = ThreadLocalRandom.current().nextInt(min, max);
			if(tirada1==tirada2) {
				System.out.println("Al fin han salido iguales en la tirada " + i + "!");
			}
			else System.out.printf("En la tirada %s han salido el %s y el %s\n",i,tirada1,tirada2);
			i++;
		}while(tirada1!=tirada2);
		

	}

}
