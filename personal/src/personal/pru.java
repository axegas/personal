package personal;

import java.util.Scanner;

public class pru {

	public static void main(String[] args) {
		//sdfsadf
		Scanner scan = new Scanner(System.in);
		int cad[]=new int[11];
		
		int salida=1;
		int n;
		int contador=3;
		int rand = (int) (Math.random()*10+1);
		
		for(int i=0;i<11;i++) cad[i]=i;

		
		while(salida==1) {
			System.out.println("Introduce un número entre el 1 y el 10");
			System.out.println("Tienes " + contador + " oportunidades.");
			while(contador>0){
				n= scan.nextInt();
				if(n==rand) {
					System.out.println("Has acertado!");
					contador=0;
					}else 
						if(n>10 || n<1) 
							System.out.println("el número no es válido");
						else {
							contador--;
							if(contador>0) {
								if(n>rand) {
									System.out.println("Has introducido un número mayor, busca uno menor.");
									for(int i=n;i<11;i++) {
										cad[i]=0;
									}
									}else {
										System.out.println("Has introducido un número menor, busca uno mayor.");
										for(int i=n;i>cad[0];i--) {
											cad[i]=0;
										}
									}
								if(contador==1) {
									System.out.println("Te quedan los siguientes n�meros y solo " + contador + " oportunidad!");
								}else {
									System.out.println("Te quedan los siguientes n�meros y " + contador + " oportunidades:");			
								}								
								for(int i=1;i<=10;i++) {
									if(cad[i]!=0) {
										System.out.print("{ "+ cad[i]+" }");
									}else
										System.out.print("{  }");
								}
								System.out.println(" ");
								}else {
									System.out.println("Has perdido! El n�mero m�gico es el: " + rand);
									}
							}
				}
			do {
				System.out.println("Quieres jugar de nuevo? (0-NO, 1-SI)");
				salida=scan.nextInt();
				if(salida!=0 && salida!=1) {
					System.out.println("N�mero no valido.");
				}
				}while(salida!=0 && salida!=1);
			if(salida==1) {
				contador=3;
				rand = (int) (Math.random()*10+1);
				for(int i=0;i<=10;i++) cad[i]=i;
				}else {
					System.out.println("Hasta pronto!");
					
				}
			}
		
		
		
		
		
		scan.close();
		}
	
	}