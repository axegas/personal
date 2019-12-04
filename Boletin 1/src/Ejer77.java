import java.util.Scanner;
/*
 * Axel Perez Gaspar
 * 1º DAM
 * 
 * 04/12/2019
 * 
 * JUEGO DE LOS PALOTES
 * 
 */
public class Ejer77 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		
		String str = scan.nextLine();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				System.out.print(" -");
			}
		}
		int num = scan.nextInt();
		String palote = convierteEnPalote(num);
		System.out.println(palote);
		
		
	}
	
	public static String convierteEnPalote(int n) {//dado un numero, devuelve una cadena de caracteres
		String str = "";
		for(int i=digitos(n);i>0;i--) {
			str += palote(digitoPos(n,i));
			if(i>1) {
				str += "-";
			}
		}			
		return str;
	}	
	
	public static String palote(int n) {//dado un numero, devuelve el nº de palotes correspondiente a ese número
		String str = "";
		for(int i=0;i<n;i++) {
			str += "|";
		}
		
		return str;							
	}
	public static int digitoPos(int digito, int posicion) {//dado un numero y una posicion, devuelve el digito que hay en la posicion
		int dig=0;
		for(int i=0;i<posicion;i++) {
			dig=digito%10;
			digito=digito/10;			
		}
		return dig;
	}
	public static int digitos(int x) {//dado un numero, devuelve el tamaño (los digitos) que tiene ese numero
		int aux = x;
		int n=0;
		
		while(aux!=0) {
			n++;
			aux=aux/10;
		}		
		return n;		
	}

}
