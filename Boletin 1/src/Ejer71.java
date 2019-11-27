import matematicas.Matematicas;

public class Ejer71 {

	public static void main(String[] args) {
		int contador=0;
		
		for(int i=2;i<=1000;i++) {
			if(Matematicas.esPrimo(i)) {
				System.out.print(i + " ");
				contador++;
				}
			if(contador==4) {
				System.out.println("");
				contador=0;
				}			
		}
	}

}
