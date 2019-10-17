package iesserpis.ed;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cad[] = new int[11];
		int cad2[] = new int[11];
		int salida=1;
		int n;
		int contador = 3;
		int rand;
		boolean esVerdadero=false;


		for(int i=0;i<=10;i++) {
			cad[i]=i;		
		}

		
		
		System.out.println("Tienes:" + contador + " intentos");
		while(salida!=0) { 
			rand = (int) (Math.random()*10)+1;				
			cad2=cad;
			while(contador>0){
				System.out.println("Introduce un número entre el 1 y el 10");
				n= scan.nextInt();
				if(n==rand) {
					System.out.println("Has acertado!");
					cad2=cad;
					do {
						System.out.println("Quieres jugar otra partida? 1=Si, 0=no");
						salida = scan.nextInt();
						if(salida==1) {
							rand = (int) (Math.random()*10)+1;
							contador=3;
							cad2=cad;
							}else
								if(salida!=0 && salida!=1) {
									System.out.println("Has introducido un número incorrecto! por favor, introduce un 1 o un 0");
									}
						}while(salida!=0 && salida!=1);
					}else 
						if(n>10 || n<0) 
							System.out.println("el número no es válido");
						else {  
							contador--;
							if(contador==0) {
								System.out.println("Has perdido!");
								cad2=cad;
								do {
									System.out.println("Quieres jugar otra partida? 1=Si, 0=no");
									salida = scan.nextInt();
									if(salida==1) {
										rand = (int) (Math.random()*10)+1;
										contador=3;
										cad2=cad;
										}else
											if(salida!=0 && salida!=1) {
												System.out.println("Has introducido un número incorrecto! por favor, introduce un 1 o un 0");
												}
									}while(salida!=0 && salida!=1);
								}
							if(salida == 0) {
								System.out.println("Fin del juego!");
								break;
								}else {
									System.out.println("Vuelve a intentarlo");
									}
							if(n>rand) {
								System.out.println("Has introducido un número mayor, busca uno menor.");
								for(int i=n;i<11;i++)
									cad2[i]=0;
								}
							else {	
								System.out.println("Has introducido un número menor, busca uno mayor.");
								for(int i=n;i>0;i--)
									cad2[i]=0;
								}
							System.out.println("Te quedan:" + contador + " intentos");
							System.out.println("Te quedan los siguientes números: ");
							for(int i=1;i<=10;i++) {
								if(cad2[i]==0) {
									System.out.print("{  }");
									}else
										System.out.print("{ "+cad2[i]+" }");
								}
							System.out.println(" ");
							}
				}
			}
		}
	}
