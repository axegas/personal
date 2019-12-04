package iesserpis.ed;
import java.util.Scanner;
import matematicas.Matematicas;

public class PruebaPalote {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Introduce un n�mero: ");
		int num = scan.nextInt();
		
		for(int i=digitos(num);i>0;i--) {
			palote(digitoPos(num,i));
			if(i>1) System.out.print("-");
			else System.out.println("");
		}

	}
	
	public static void palote(int n) {
		for(int i=0;i<n;i++) System.out.print("|");				
	}
	public static int digitoPos(int digito, int posicion) {//dado un numero, devuelve el digito que hay en la posicion
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
