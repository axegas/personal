package personal;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		DecimalFormat df = new DecimalFormat("#.00");
		DecimalFormat df2 = new DecimalFormat("#");
		 
		//Del 1 al numMax
		int numMax=50;
		//Oportunidades
		float contMax=3;
		//variables de control
		float contador=contMax;
		float media=0.0f;
		float puntuacion=0;
		float partidas=0;
		float ganadas=0;
		int salida=1;		
		int cad[]=new int[numMax+1];
		//variables operativas
		int rand = (int) (Math.random()*numMax+1);		
		int n;
						
		for(int i=0;i<=numMax;i++) cad[i]=i;
		
		while(salida==1) {
			partidas++;
			System.out.println("Adivina el numero magico!");
			System.out.println("Introduce un numero entre el 1 y el "+ numMax);
			System.out.println("Tienes " + df2.format(contador) + " oportunidades.");
			while(contador>0){
				n= scan.nextInt();
				if(n==rand) {
					System.out.println("Has acertado!");

					puntuacion=puntuacion+contador;
					ganadas++;
					contador=0;
					}else 
						if(n>numMax || n<1) 
							System.out.println("el numero no es valido");
						else {
							contador--;
							if(contador>0) {
								if(n>rand) {
									System.out.println("Has introducido un numero mayor, busca uno menor.");
									for(int i=n;i<=numMax;i++) {
										cad[i]=0;
									}
									}else {
										System.out.println("Has introducido un numero menor, busca uno mayor.");
										for(int i=n;i>cad[0];i--) {
											cad[i]=0;
										}
									}
								if(contador==1) {
									System.out.println("Te quedan los siguientes numeros y solo " + df2.format(contador) + " oportunidad!");
								}else {
									System.out.println("Te quedan los siguientes numeros y " + df2.format(contador) + " oportunidades:");			
								}								
								for(int i=1;i<=numMax;i++) {
									if(cad[i]!=0) {
										System.out.print("{ "+ cad[i]+" }");
									}else
										System.out.print("{   }");
								}
								System.out.println(" ");
								}else {
									System.out.println("Has perdido! El numero magico es el: " + rand);
									}
							}
				}
			do {
				System.out.println("Quieres jugar de nuevo? (0-NO, 1-SI)");
				salida=scan.nextInt();
				if(salida!=0 && salida!=1) {
					System.out.println("Numero no valido.");
				}
				}while(salida!=0 && salida!=1);
			if(salida==1) {
				contador=contMax;
				rand = (int) (Math.random()*numMax+1);
				for(int i=0;i<=numMax;i++) cad[i]=i;
				}else {
					System.out.println("Hasta pronto!");	
					
				}
			}		
		media= (puntuacion/(contMax*partidas)*100);
		System.out.printf("Partidas jugadas: %s\nPartidas ganadas: %s\nPuntuacion total: %s\nTasa de victorias: %s%%\n",df2.format(partidas),df2.format(ganadas),df2.format(puntuacion),df.format(media));
		scan.close();
		}
	}
