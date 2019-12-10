
// 11-12-2019
// PROGRAMACIÓN
// 1º DAM
// PROGRAMA: MUESTRA LOS DIVISORES DE UN NÚMERO LEIDO POR TECLADO
// PROGRAMA: PARA UNA CADENA DADA, DEVUELVE LA MISMA CADENA INVERTIDA
//
//
import java.util.Scanner;
public class evaluable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//darle la vuelta a una cadena
		System.out.println("Introduce una cadena:");
		String str = scan.nextLine();
		System.out.println(daLaVuelta(str));
		
		//devolver los divisores.			
		System.out.println("Introduce un numero:");
		int n = scan.nextInt();
		
		System.out.println(devuelveDivisores(n,n)); //método 1
		muestraDivisores(n,n); //método 2
		
		
		
	}
	public static String daLaVuelta(String s) { //devuelve la cadena invertida
		String str = "";
		
		if(s.length()==0) {
			str="";
		}else {
			str=s.charAt(s.length()-1) + daLaVuelta(s.substring(0,s.length()-1));
		}	
		return str;
	}
	public static String devuelveDivisores(int n, int i) {//método 1: devuelve un String con los divisores
		String str = "";
		
		if(i==0) {
			str = "";
		}else {
			if(n%i==0) {
				str = i + " ";
			}
			str += devuelveDivisores(n,i-1);
		}		
		
		return str;
	}
	public static void muestraDivisores(int n, int i) {//método 2: muestra los divisores por pantalla
		
		if(i==1) {
			System.out.print(i);
		}else {
			if(n%i==0) {
				System.out.print(i + " ");
			}
			muestraDivisores(n,i-1);
		}		
	}
	
	
}
