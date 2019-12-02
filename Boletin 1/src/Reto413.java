import java.util.Scanner;

public class Reto413 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int claras;
		int oscuras;
		int losetas;
		int casos;
		int ancho;
		int alto;
				
		casos = scan.nextInt();
		while(casos>0) {
			ancho = scan.nextInt();
			alto = scan.nextInt();
		
			losetas = ancho*alto;
			oscuras = losetas/2;
			if(losetas%2==0) {
				claras=oscuras;				
			}else {
				claras=oscuras+1;				
			}
			System.out.println(claras + " " + oscuras);
			casos--;			
		}	
		
		scan.close();
	}
}
