

import java.util.concurrent.ThreadLocalRandom;

import matematicas.Funciones;

public class Ejer60 {

	public static void main(String[] args) {
		int min=1;
		int max=7;	
		int i=0;
		int j=0;
		int prim;
		int compases;
		
		compases = ThreadLocalRandom.current().nextInt(min, max);
		prim = ThreadLocalRandom.current().nextInt(min, max);
		int nota_str[] = new int[compases*4];
		nota_str = Funciones.rellenaArray(nota_str, min, max);
		nota_str[0]=prim;
		nota_str[nota_str.length-1]=prim;
		
		
		
		for(i=0;i<nota_str.length;i++) {				
			switch(nota_str[i]) {
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
