import java.util.Scanner;

public class Ejer57 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int menu;
		do {
			System.out.println("1.- Longitud de una cadena");
			System.out.println("2.- Comparación de dos cadenas");
			System.out.println("3.- Concatenación de dos cadenas");
			System.out.println("4.- Obtener subcadenas");
			System.out.println("5.- Invertir cadenas");
			System.out.println("6.- Es palindromo");
			System.out.println("9.- SALIR");
			menu = scan.nextInt();
			scan.nextLine();		
		
		switch(menu) {
		case 1:
			System.out.print("Introduce un string: ");
			String cadena = scan.nextLine();
			System.out.println("Tamaño del String: " + cadena.length());	
			break;
		case 2:
			System.out.print("Introduce una cadena: ");
			String cad1 = scan.nextLine();
			System.out.print("Introduce otra cadena: ");
			String cad2 = scan.nextLine();
			comparacionCadena(cad1,cad2);
			break;
		case 3:
			System.out.print("Introduce una cadena: ");
			cad1 = scan.nextLine();
			System.out.print("Introduce otra cadena: ");
			cad2 = scan.nextLine();
			String cad3 = cad1 + cad2;
			System.out.println("Las cadenas concatenadas son: " + cad3);			
			break;
		case 4:
			System.out.print("Introduce una cadena: ");
			cad1 = scan.nextLine();
			System.out.print("Introduce dos numeros: ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			subCadena(cad1,num1, num2);
			break;
		case 5:
			System.out.print("Introduce una cadena: ");
			cad1 = scan.nextLine();
			String cadenaInver = invertirCadena(cad1);
		    System.out.println("La cadena invertida es: " + cadenaInver);
			break;
		case 6:
			System.out.print("Introduce una cadena: ");
			cad1 = scan.nextLine();
			esPalindromo(cad1);
			break;
		case 9:
			break;
		}
		}while(menu != 9);
				

	}
	public static void comparacionCadena(String cad1, String cad2) {	
		int compara=cad1.compareTo(cad2);
		if(compara<0) System.out.println("La cadena uno es menor alfabeticamente que la 2");
		else if(compara > 0) System.out.println("La cadena uno es mayor alfabeticamente que la 2");
		else if (compara==0) System.out.println("Las cadenas son iguales.");		 
	}
	public static void subCadena(String cad1, int num1, int num2) {		
		 String cad2 = "";
		 for(int i=num1;i<=num2;i++) {
			 cad2 = cad2 + cad1.charAt(i-1);
		 }
		 System.out.println(cad2);
	}
	public static String invertirCadena(String cad1) {
		
		String cadenaInver = "";
	    for (int x=cad1.length()-1;x>=0;x--)
    		cadenaInver = cadenaInver + cad1.charAt(x);
	    return cadenaInver;
	    

	}
	public static void esPalindromo(String cad1) {
		String cad2=invertirCadena(cad1);
		if(cad2.equals(cad1)) System.out.println("Es palindromo");
		else System.out.println("No es palindromo");
		 
	}	

}
