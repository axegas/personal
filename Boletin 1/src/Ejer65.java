import java.util.Scanner;

/*
Nombre: Axel Perez
Fecha: 13/11/2019
Comprobación de password correcto..
*/


public class Ejer65 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password;
		int error;
		int suma = 0;		
		
		System.out.println("1- Ha de tener, al menos, 8 caracteres.");
		System.out.println("2- Al menos la mitad del password ha de estar en minúsculas.");
		System.out.println("3- El password ha de tener, al menos, 2 mayúsculas.");
		System.out.println("4- El password ha de tener, al menos, 3 números.");
		System.out.println("5- El password NO ha de incluir el carácter ‘@’.");
		System.out.print("Introduce tu password: ");
		
		do {
			error = 0;
			password = scan.nextLine();	
			char[] aux = new char[password.length()];
			for(int j=0;j<aux.length;j++) {
				aux[j] = password.charAt(j);
			}
			//Error 1 - tiene que tener más de 8 carácteres
			if(password.length()<8) {
				System.out.println("El password ha de tener, por lo menos, 8 carácteres, y el suyo tiene " + password.length());
				error = 1;
			}
			//Error 2 - al menos la mitad de los carácteres tienen que ser minúsculas
			
			for(int i=0;i<password.length();i++) {
				if(Character.isLowerCase(aux[i])) {
					suma++;
				}
			}
			if(suma<(password.length()/2)) {
				System.out.println("El password ha de tener, por lo menos, la mitad de letras minúsculas");
				error = 1;
			}
			
			//Error 3 - al menos tienen que haber dos mayúsculas
			suma = 0;
			for(int i=0;i<password.length();i++) {
				if(Character.isUpperCase(aux[i])) {
					suma++;
				}
			}
			if(suma<2) {
				System.out.println("El password ha de tener, por lo menos, 2 mayúsculas");
				error = 1;
			}
			//Error 4 - al menos tiene que tener tres números
			suma = 0;
			for(int i=0;i<password.length();i++) {
				if(Character.isDigit(aux[i]) ) {
					suma++;
				}
			}
			if(suma<3) {
				System.out.println("El password ha de tener, por lo menos, 3 números");
				error = 1;
			}
			//Error 5 - no puede contener una arroba
			if(buscaArroba(password)==1) {
				System.out.println("El password no puede tener una @");
				error = 1;
			}
			if(error==0) {
				System.out.println("El password es correcto");
				break;
			}else {
				System.out.println("--------------------");
				System.out.print("Inténtelo de nuevo: ");
			}
				
		}while(error!=0);

	}
	//busca la arroba en el password
	public static int buscaArroba(String str) {
		int error=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='@') {
				error = 1;
				break;
			}else
				error=0;		
		}
		return error;
	}


}
