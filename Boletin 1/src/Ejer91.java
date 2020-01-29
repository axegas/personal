import java.util.ArrayList;
import java.util.Scanner;

public class Ejer91 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int opc;	
		ArrayList<String> lista = new ArrayList<String>();	
		do {
			System.out.println("");
			System.out.println("-GRUPOS MUSICALES-");		
			System.out.println("1: Agregar grupos al final de la lista");
			System.out.println("2: Agregar grupos en una posición concreta");
			System.out.println("3: Recuperar grupo en una posición determinada");
			System.out.println("4: Modificar grupo en una posición determinada");
			System.out.println("5: Posición del grupo en la lista");
			System.out.println("6: Imprimir lista");
			System.out.println("7: Salir del programa");
			System.out.println("Introduzca opción:");
			opc = scan.nextInt();
			scan.nextLine();
			
			switch(opc) {
			case 1:
				lista = agregar(lista);				
				break;
			case 2:
				lista = agregar_posicion(lista);				
				break;
			case 3:
				lista = recuperar_posicion(lista);				
				break;
			case 4:
				lista = modificar_posicion(lista);				
				break;
			case 5:
				lista = mostrar_posicion(lista);				
				break;
			case 6:	
				imprimir(lista);				
				break;				
			case 7:
				System.out.println("Gracias por utilizar este menú");
				break;
			default:
				System.out.println("Opción Incorrecta");
				break;			
			}
		}while(opc!=7);		
	}
	public static ArrayList<String> agregar(ArrayList<String> lista){
		System.out.println("Introduzca el nombre del grupo que irá en la posicion " + (lista.size()) + ":");
		String elemento = scan.nextLine();
		lista.add(elemento);
		return lista;
	}
	public static ArrayList<String> agregar_posicion(ArrayList<String> lista){
		System.out.println("Introduzca el nombre del grupo:");
		String elemento = scan.nextLine();
		System.out.println("Introduzca la posición:");
		int pos = scan.nextInt();
		scan.nextLine();
		if(pos>lista.size() || pos<0) {
			System.out.println("posicion incorrecta");
		}else {
			lista.add(pos,elemento);
		}		
		return lista;
	}
	public static ArrayList<String> recuperar_posicion(ArrayList<String> lista){
		System.out.println("Introduzca la posición:");	
		int pos = scan.nextInt();	
		scan.nextLine();
		if(pos>=lista.size() || pos<0) {
			System.out.println("posicion incorrecta");
		}else {
			System.out.println(lista.get(pos));
		}		
		return lista;
	}
	public static ArrayList<String> modificar_posicion(ArrayList<String> lista){
		System.out.println("Introduzca el nombre del grupo:");
		String elemento = scan.nextLine();
		System.out.println("Introduzca la posición:");
		int pos = scan.nextInt();
		scan.nextLine();
		if(pos>=lista.size() || pos<0) {
			System.out.println("posicion incorrecta");
		}else {
			System.out.println("Valor antiguo: " + lista.get(pos));
			System.out.println("Valor nuevo: " + elemento);
			lista.set(pos,elemento);
		}		
		return lista;
	}
	public static ArrayList<String> mostrar_posicion(ArrayList<String> lista){
		System.out.println("Introduzca el grupo:");
		String elemento = scan.nextLine();
		System.out.println(lista.indexOf(elemento));
		return lista;
	}
	public static void imprimir(ArrayList<String> lista){
		for(int i=0;i<lista.size();i++) {
			System.out.println(i + ": " + lista.get(i));
		}		
	}
}
