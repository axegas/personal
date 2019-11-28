import java.util.Scanner;

public class Reto169 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int casos;
		String linea = "";
		String apellido1 = "";
		String apellido2 = "";
		int nombres = 0;
		int hermanos = 0;
		int actual=0;
		casos = scan.nextInt();
		scan.nextLine();
		while(casos>0) {
			do {
				do {
					linea = scan.nextLine();
				}while(linea.length()>40);
				if(linea.equals("===")) {
					break;
				}
				nombres++;
				apellido1 = linea.substring(0,linea.indexOf(", ")).toLowerCase();
				if(apellido1.equals(apellido2)) {
					if(actual==0) {
						hermanos+=2;
						actual=1;
					}else {
						hermanos++;	
					}					
				}else {
					actual=0;
				}
				apellido2 = apellido1;				
			}while(!linea.equals("==="));
			casos--;
		}
		System.out.println(nombres + " " + hermanos);
		scan.close();
	}
}
