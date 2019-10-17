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
			System.out.println("Introduce un nÃºmero entre el 1 y el 10");
			System.out.println("Tienes " + contador + " oportunidades.");
			while(contador>0){
				n= scan.nextInt();
				if(n==rand) {
					System.out.println("Has acertado!");
					contador=0;
					}else 
						if(n>10 || n<1) 
							System.out.println("el nÃºmero no es vÃ¡lido");
						else {
							contador--;
							if(contador>0) {
								if(n>rand) {
									System.out.println("Has introducido un nÃºmero mayor, busca uno menor.");
									for(int i=n;i<11;i++) {
										cad[i]=0;
									}
									}else {
										System.out.println("Has introducido un nÃºmero menor, busca uno mayor.");
										for(int i=n;i>cad[0];i--) {
											cad[i]=0;
										}
									}
								if(contador==1) {
									System.out.println("Te quedan los siguientes números y solo " + contador + " oportunidad!");
								}else {
									System.out.println("Te quedan los siguientes números y " + contador + " oportunidades:");			
								}								
								for(int i=1;i<=10;i++) {
									if(cad[i]!=0) {
										System.out.print("{ "+ cad[i]+" }");
									}else
										System.out.print("{  }");
								}
								System.out.println(" ");
								}else {
									System.out.println("Has perdido! El número mágico es el: " + rand);
									}
							}
				}
			do {
				System.out.println("Quieres jugar de nuevo? (0-NO, 1-SI)");
				salida=scan.nextInt();
				if(salida!=0 && salida!=1) {
					System.out.println("Número no valido.");
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