package ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opc;		
		
		System.out.print("Bienvenido a la cafeteria. De cuanto es la cafetera? ");
		int cantidad = scan.nextInt();
		Cafetera cafet1 = new Cafetera(cantidad);
		
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1-Llenar la cafetera");
			System.out.println("2-Servir Taza");
			System.out.println("3-Agregar Cafe en la cafetera");
			System.out.println("4-Vaciar la cafetera");
			System.out.println("5-Salir");
			opc = scan.nextInt();
			switch(opc) {
			case 1:
				cafet1.llenarCafetera();
				break;
			case 2:
				System.out.print("Cuanto café quieres? ");
				cantidad = scan.nextInt();
				cafet1.servirTaza(cantidad);
				break;
			case 3:
				System.out.print("Cuanto café quieres agregar? ");
				cantidad = scan.nextInt();
				cafet1.agregarCafe(cantidad);
				break;
			case 4:
				cafet1.vaciarCafetera();
				break;
			case 5:
				System.out.println("Hasta la próxima!");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}			
		}while(opc!=5);
		
		
	}

}
