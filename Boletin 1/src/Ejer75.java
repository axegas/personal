import java.util.Scanner;

public class Ejer75 {

	public static void main(String[] args) {

		System.out.print("Introduce el numero a convertir: ");		
		System.out.println(convierteEnPalabras((new Scanner(System.in)).nextInt()));
		
	}
	public static String convierteEnPalabras(int n) {
		String s = "";
		int num;
		
		for(int i=longitudNumero(n);i>0;i--) {
			num=digitoEnPos(n,i);

			switch(num) {
			case 1:
				s += "uno";
				break;
			case 2:
				s += "dos";
				break;
			case 3:
				s += "tres";
				break;
			case 4:
				s += "cuatro";
				break;
			case 5:
				s += "cinco";
				break;
			case 6:
				s += "seis";
				break;
			case 7:
				s += "siete";
				break;
			case 8:
				s += "ocho";
				break;
			case 9:
				s += "nueve";
				break;
			case 0:
				s += "cero";
				break;				
			}
			if(i>1) {
				s+=", ";
			}
			
		}
		
		return s;		
	}
	public static int digitoEnPos(int digito, int posicion) {
		int dig=0;
		for(int i=0;i<posicion;i++) {
			dig=digito%10;
			digito=digito/10;			
		}
		return dig;
	}
	public static int longitudNumero(int x) {
		int longitud=0;
		
		while(x!=0) {
			longitud++;
			x=x/10;
		}		
		return longitud;		
	}

}
