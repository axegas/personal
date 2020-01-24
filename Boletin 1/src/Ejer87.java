import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Ejer87 {

	public static void main(String[] args) {
		int tam = ThreadLocalRandom.current().nextInt(10, 20+1);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int suma = 0;
		int media;
		int max = 0;
		int min = 0;
		int aux = 0;
		

		for(int i=0;i<tam;i++) {			
			lista.add(ThreadLocalRandom.current().nextInt(0, 100+1));
		}	
		
		Iterator<Integer> iter = lista.iterator();
		max=lista.get(0);
		min=max;
		while(iter.hasNext()) {
			aux = iter.next();
			suma += aux;
			if(aux>max) {
				max=aux;
			}else {
				if(aux<min) {
					min=aux;
				}
			}
		}
		media = suma/tam;
		
		System.out.println("Suma ="+suma+"Max ="+max+"Min="+min+"Media="+media);
		
		
	}

}
