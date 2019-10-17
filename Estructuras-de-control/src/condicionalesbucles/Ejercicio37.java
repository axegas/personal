package condicionalesbucles;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int radio;
		
		System.out.print("Introduce el valor de las abscisa: ");
		x=scan.nextInt();
		System.out.print("Introduce el valor de las ordenadas: ");
		y=scan.nextInt();
		System.out.print("Introduce el radio de la circunferencia: ");
		radio=scan.nextInt();
		
		if(x>radio || y>radio || x<-radio || y<-radio) {
			System.out.println("El valor está fuera de la circunferencia.");
		}else
			if(x>0 && y>0) {
				System.out.println("El valor está en el primer cuadrante.");
				}else
					if(x<0 && y>0) {
						System.out.println("El valor está en el segundo cuadrante.");
						}else
							if(x<0 && y<0) {
								System.out.println("El valor está en el tercer cuadrante.");
								}else
									if(x>0 && y<0) {
										System.out.println("El valor está en el cuarto cuadrante.");
										}else
											if(x!=0 && y==0) {
												System.out.println("El valor está en el eje de las abscisas.");
												}else
													if(x==0 && y!=0) {
														System.out.println("El valor está en el eje de las ordenadas.");
														if(x==0 && y==0) {
															System.out.println("El valor está en el origen de las ordenadas.");
															}
														}
		}
	}