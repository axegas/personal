/*
Nombre: Axel Pérez
Fecha: 20/11/2019
-Bandera Paco-
*/
import java.util.Scanner;

public class Examen20_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int k=0;
		int sumaMin = 0;
		int sumaMay = 0;
		
		
		String nombre = "";
		System.out.print("Introduce tu nombre: ");
		nombre = scan.nextLine();
		do {
			System.out.println("Introduce las dimensiones de la bandera de "+nombre +" (min 4x4): ");
			x = scan.nextInt();
			if(x<4) {
				System.out.println("La dimensión de X no es válida");
			}
			y = scan.nextInt();
			if(y<4) {
				System.out.println("La dimensión de Y no es válida");
			}
		}while(x<4 || y<4);
		
		char bandera[][] = new char[y+2][x+2];
		char nom[] = new char[x*y];
		
		//pongo los bordes de la bandera
		for(int i=0;i<bandera.length;i++) {
			for(int j=0;j<bandera[i].length;j++) {
					bandera[i][j]='@';
			}			
		}

		
		
	
		//relleno array
		
		for(int i=1;i<bandera.length-1;i++) {
			for(int j=1;j<bandera[i].length-1;j++) {
				bandera[i][j]=nombre.charAt(k);
				if(Character.isLowerCase(bandera[i][j])){
					sumaMin++;
				}else
					sumaMay++;
				if(k==nombre.length()-1) {
					k=0;
				}else
					k++;
			}
		}
		muestraBandera(bandera);
		
		int suma = sumaMay*10 + sumaMin*5;
		/*String sumaAux = Integer.toString(suma);
		
		String resultado = "";
		int l=0;
		while(l<sumaAux.length()) {
			if(l%3==0) {
				resultado += ".";
				resultado += sumaAux.charAt(l);
			}else
				resultado += sumaAux.charAt(l);
			l++;
		}
		
		System.out.println(suma);
		System.out.println(resultado);
		*/
		System.out.printf("\nLa bandera costaría: %s€, ya que hay que imprimir %s mayúsculas y %s minúsculas\n",suma,sumaMay,sumaMin );
		
	
		
		
	}
		
	public static void muestraBandera(char[][] bandera ) {	
		for(int i=0;i<bandera.length;i++) {
			for(int j=0;j<bandera[i].length;j++) {
				System.out.print(bandera[i][j]);
				}
			System.out.println("");
			}	
		}

}
