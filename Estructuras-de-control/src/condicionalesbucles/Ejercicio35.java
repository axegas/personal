package condicionalesbucles;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float altura = 0;
		float anchura = 0;
		float tamano = 0;
		String escudo = "";
		float precioBan = 0;
		float precioEsc = 0;
		float envio = 3.25f;
		float total = 0;
		String fondo = "";
				
		System.out.print("Introduce la altura de la bandera en cm: ");
		altura = scan.nextFloat();
		System.out.print("Introduce la anchura de la bandera en cm: ");
		anchura = scan.nextFloat();
		escudo = scan.nextLine();
		do {
			System.out.print("Quiere que tenga un escudo bordado? (s/n): ");
			escudo = scan.nextLine();
		}while(!escudo.equals("s") && !escudo.equals("n"));
		do {
			System.out.print("Quiere que tenga fondo de color? (s/n): ");
			fondo = scan.nextLine();
		}while(!fondo.equals("s") && !fondo.equals("n"));
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		tamano = altura*anchura;
		precioBan = (float) (tamano*0.01);
		
		if(escudo.equals("s")) precioEsc = 2.5f;			
		else precioEsc = 0;
			
		total = precioEsc+precioBan+envio;
		
		System.out.println("Bandera de " + tamano + " cm2:\t" + precioBan + "€");
		if(escudo.equals("s")) System.out.println("Con escudo:\t\t" + precioEsc + "€");			
		else System.out.println("Sin escudo:\t\t" + precioEsc + "€"); 
		System.out.println("Gastos de envio:\t" + envio);
		System.out.println("Total:\t\t\t" + total);
		
		String[][] bandera=new String[(int) altura][(int) anchura];

		System.out.println("Te enseño tu bandera!");
		for(int i=0;i<altura;i++) {
			System.out.print(" * ");
			for(int j=1;j<anchura;j++) {
				if(i==0 || j==anchura-1)
					System.out.print(" * ");
				else
					if(escudo.equals("s")) {
						if(/*j==anchura/2 || j==anchura/4 || j==anchura/5 || j==anchura/3 || j==anchura/6 ||*/ j==i+2 || j==i+3 || j==anchura/i) {
							System.out.print(" * ");
						}else {
							if(fondo.equals("s"))
								System.out.print(" - ");
							else
								System.out.print("   ");
						}
					}else
						if(fondo.equals("s"))
							System.out.print(" - ");
						else
							System.out.print("   ");
			}
			System.out.println(" ");
		}
		for(int j=1;j<=anchura;j++) {
			System.out.print(" * ");
		}
	}
}
