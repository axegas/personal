package ejercicio95b;

import java.util.*;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		char opc;
		ArrayList<PacoAirways> pa = new ArrayList<PacoAirways>();
				
		do {
			System.out.println("------------------------------------------");
			System.out.println("Bienvenido a las aerolinias 'Paco Airways'");
			System.out.println("------------------------------------------");
			System.out.println("1- Comprar billete de avión.");
			System.out.println("2- Cancelar billete de avión.");
			System.out.println("3- Estado de mi reserva.");
			System.out.println("4- Duración del viaje");
			System.out.println("S- Salir.");
			System.out.print("OPCION: ");
			opc = scan.nextLine().toUpperCase().charAt(0);
			switch(opc) {
			case '1':
				introducir(pa);			
				break;
			case '2':
				cancelar(pa);
				break;
			case '3':		
				mostrarVuelos(pa);
				break;
			case '4':		
				duracion(pa);
				break;
			case 'S':
				System.out.println("Paco Airways no le agradece su confianza. Gracias por nada.");
				break;
			default:
				System.out.println("Opción incorrecta.");
				break;			
			}			
		}while(opc!='S');
	}
	public static void introducir(ArrayList<PacoAirways> pa) throws Exception {
		String teclado;
		String[] vec;
		System.out.println("Introduzca el origen, destino, ida y vuelta, separados por @:");
		teclado = scan.nextLine();
		vec = teclado.split("@");
		PacoAirways p = new PacoAirways(vec[0],vec[1],vec[2],vec[3],vec[4],vec[5]);
		pa.add(p);		
		System.out.println("Tu vuelo durará: " + p.duración() + " días.");
	}
	public static void mostrarVuelos(ArrayList<PacoAirways> pa) {
		Iterator<PacoAirways> iter = pa.iterator();
		System.out.println("Que vuelos desea ver? (V-vigentes, C-cancelados, T-todos)");
		char most = scan.nextLine().toUpperCase().charAt(0);		
		while(iter.hasNext()) {
			PacoAirways p = iter.next();
			
			switch(most) {
			case 'V':
				if(p.getEstado().equals("")) {
					System.out.println(p.toString(most));
				}
				break;
			case 'C':
				if(p.getEstado().equals("CANCELADO")) {
					System.out.println(p.toString(most));
				}
				break;
			case 'T':
				System.out.println(p.toString(most));
				break;				
			default:
				System.out.println("Opcion incorrecta.");
				break;			
			}
		}
	}
	public static void cancelar(ArrayList<PacoAirways> pa) {
		int canc;
		char conf;
		System.out.print("Introduzca id del billete a cancelar: ");
		canc = Integer.parseInt(scan.nextLine());
		if(canc>pa.size()) {
			System.out.println("Billete no encontrado.");
		}else {
			System.out.println("Billete encontrado. Confirma su cancelación? s/n");
			conf = scan.nextLine().toUpperCase().charAt(0);
			if(conf=='S') {
				pa.get(canc-1).cancelar();
				System.out.println("Billete cancelado.");
			}else {
				System.out.println("Operación cancelada");
			}
		}				
	}
	public static void duracion(ArrayList<PacoAirways> pa) {
		System.out.println("De qué vuelo quieres saber la duración?");
		int vuelo = Integer.parseInt(scan.nextLine());
		int dur = pa.get(vuelo-1).duración();
		System.out.println("El vuelo durará: " + dur);
		
	}

}
