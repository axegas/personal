import java.util.Scanner;

public class Ejer62 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int error=-1;
		String aux = "";
		int pos1=0;
		int pos2=0;
		int suma=0;
		String fin = "";
		
		do {
			//Error1
			System.out.print("Introduce tu e-mail: ");
			String email = scan.nextLine();
			error=buscaArroba(email);
			if(error!=0) {
				error=1;
				break;
			}else
				error=0;
			//Error2
			if(email.charAt(0)=='@') {
				error=2;				
				break;
			}else
				error=0;
			//Error3
			for(int i=0;i<4;i++) {
				aux = aux + email.charAt(i);				
			}
			error=buscaArroba(aux);
			if(error==0) {
				error=3;
				break;
			}else
				error=0;
			//Error4
			error=buscaPunto(email);
			if(error!=0) {
				error=4;
				break;
			}else
				error=0;
			//Error5
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					pos1=i;
				}
			}
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='.') {
					pos2=i;
				}
			}
			for(int j=pos1+1;j<pos2;j++) {
				suma++;
				}
			if(suma>=3) {
				error=0;
			}else {
				error=5;
				break;
			}
			//Error6
			for(int i=pos2+1;i<email.length();i++) {
				fin = fin + email.charAt(i);
			}
			if(!fin.equals("com")&&!fin.equals("es")&&!fin.equals("org")&&!fin.equals("gov")) {
				error=6;
				break;
			}else {
				error=0;
				break;
				}	
		}while(error!=0);
		
		switch(error) {
		case 0:
			System.out.println("El e-mail es correcto");
		break;		
		case 1:
			System.out.println("ERROR1: El e-mail no contiene una @");
			break;
		case 2:
			System.out.println("ERROR2: El e-mail no tiene nada a la izquierda de la @");
			break;
		case 3:
			System.out.println("ERROR3: El identificador1 tiene una longitud menor de 4 caracteres.");
			break;
		case 4:
			System.out.println("ERROR4: Detrás de la @, en algún momento, tiene que haber un punto");
			break;
		case 5:
			System.out.println("ERROR5: Antes del punto tiene que haber un identificador2 con una longitud mínima de 3 caracteres.");
			break;
		case 6:
			System.out.println("ERROR6: Al final de la dirección tengamos un dominio .com o .es o .org o .gov");
			break;
		default:
			break;		
		}
		
		
	}
	public static int buscaArroba(String str) {
		int error=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='@') {
				error = 0;
				break;
			}else
				error=1;		
		}
		return error;
	}
	public static int buscaPunto(String str) {
		int error=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='@') {
				for(int j=i;j<str.length();j++) {
					if(str.charAt(j)=='.') {
						error=0;
						break;
					}
				}
				break;
			}else
				error=1;		
		}
		return error;
	}

}
