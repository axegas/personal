import java.util.Scanner;

public class Asd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int k=0;
		int sumaA=0;
		int precioA = 0;
		int sumaP=0;
		int precioP = 0;
		int sumaC=0;
		int precioC = 0;
		int sumaO=0;
		int precioO = 0;
		
		
		do {
			System.out.println("Introduce las dimensiones de la bandera de Paco (min 4x4): ");
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
		char paco[] = new char[x*y];
		
		//pongo los bordes de la bandera
		for(int i=0;i<bandera.length;i++) {
			for(int j=0;j<bandera[i].length;j++) {
				if(i==0 || i==bandera.length-1 || j==0 || j==1 || j==x+1) {
					bandera[i][j]='@';
				}
			}
			
		}
		//relleno array
		for(int j=0;j<paco.length;j+=4) {
			paco[j]='P';
			if(j+1==paco.length) {
				break;
			}
			paco[j+1]='a';
			if(j+2==paco.length) {
				break;
			}
			paco[j+2]='c';
			if(j+3==paco.length) {
				break;
			}
			paco[j+3]='o';
		}
		//relleno bandera
		for(int i=1;i<bandera.length-1;i++) {
			for(int j=1;j<bandera[i].length-1;j++) {
				bandera[i][j]=paco[k];

				if(paco[k]=='P') {
					sumaP++;
				}
				if(paco[k]=='a') {
					sumaA++;
				}
				if(paco[k]=='c') {
					sumaC++;
				}
				if(paco[k]=='o') {
					sumaO++;
				}
				k++;
			}
		}
		
		//calculo precios
		precioP = sumaP*10;
		precioA = sumaA*5;
		precioC = sumaC*5;
		precioO = sumaO*5;
			
		int suma = precioP + precioA + precioC + precioO;
		
		//muestro resultado
		muestraBandera(bandera);		
		
		System.out.printf("\nLa bandera costaría: %s€, ya que hay que imprimir:\n",suma );
		System.out.printf("-%s letras P por valor de: %s€\n",sumaP,precioP);
		System.out.printf("-%s letras A por valor de: %s€\n",sumaA,precioA);
		System.out.printf("-%s letras C por valor de: %s€\n",sumaC,precioC);
		System.out.printf("-%s letras O por valor de: %s€\n",sumaO,precioO);		
		
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
