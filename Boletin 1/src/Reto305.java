import java.util.Scanner;

public class Reto305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ciudades;
		int[] enemigo;
		int[] aliado;
		int casos = 0;
		int min = Integer.MAX_VALUE;
		
		ciudades = scan.nextInt();
		enemigo = new int[ciudades];
		aliado = new int[ciudades];
		
		for(int i=0;i<ciudades;i++) {
			enemigo[i]=scan.nextInt();
		}
		for(int j=0;j<ciudades;j++) {
			aliado[j]=scan.nextInt();			
		}
		for(int i=0;i<ciudades-1;i++) {
			if(Integer.min(aliado[i],aliado[i+1])<min) {
				min=Integer.min(aliado[i],aliado[i+1]);
			}
		}
		
		
		
		
		

	}

}
