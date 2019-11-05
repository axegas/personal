package iesserpis.ed;


import matematicas.Funciones;

public class Ejer59 {

	public static void main(String[] args) {
		int tirada1=0;
		int tirada2=0;
		int min=1;
		int max=6;
		int i=1;
		System.out.println("Vamos a tirar los dados!");
		do {			
			tirada1 = Funciones.getNumeroRandom(min, max);
			tirada2 = Funciones.getNumeroRandom(min, max);
			if(tirada1==tirada2) {
				System.out.println("Al fin han salido iguales en la tirada " + i + "!");
			}
			else System.out.printf("En la tirada %s han salido el %s y el %s\n",i,tirada1,tirada2);
			i++;
		}while(tirada1!=tirada2);
		

	}

}
