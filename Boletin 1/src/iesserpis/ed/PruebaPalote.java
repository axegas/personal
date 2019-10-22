package iesserpis.ed;
import java.util.Scanner;
import matematicas.Matematicas;

public class PruebaPalote {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Introduce un n�mero: ");
		int num = scan.nextInt();
		int aux;

		for(int i=Matematicas.digitos(num);i>0;i--) {
			aux=num%10;
			Matematicas.palote(Matematicas.digitoPos(num,i));
			if(i>1) System.out.print("-");
			else System.out.println("");
		}

	}

}
