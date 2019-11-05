
import matematicas.Funciones;

public class Ejer60 {

	public static void main(String[] args) {
		int min=1;
		int max=7;	
		int primera;
		int compases;
		
		compases = Funciones.getNumeroRandom(min, max);
		primera = Funciones.getNumeroRandom(min, max);
		int notas[] = new int[compases*4];
		notas = Funciones.rellenaArray(notas, min, max);
		
		notas[0]=primera;
		notas[notas.length-1]=primera;
				
		for(int i=0;i<notas.length;i++) {				
			switch(notas[i]) {
			case 1:
				System.out.print("do ");
				break;
			case 2:
				System.out.print("re ");
				break;
			case 3:
				System.out.print("mi ");
				break;
			case 4:
				System.out.print("fa ");
				break;
			case 5:
				System.out.print("sol ");
				break;
			case 6:
				System.out.print("la ");
				break;
			case 7:
				System.out.print("si ");
				break;		
			}
			if(((i+1)%4)==0) {
				System.out.print(" | ");
			}			
		}
		System.out.print("|");
	}
}
