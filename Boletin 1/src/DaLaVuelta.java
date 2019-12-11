import java.util.Scanner;

public class DaLaVuelta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una cadena:");
		String str = scan.nextLine();
		System.out.println(daLaVuelta(str));

	}
	public static String daLaVuelta(String s) { //devuelve la cadena invertida
		String str = "";
		
		if(s.length()==0) {
			str="";
		}else {
			str=s.charAt(s.length()-1) + daLaVuelta(s.substring(0,s.length()));
		}	
		return str;
	}

}
