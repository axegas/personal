
import java.util.*;

public class Principal2 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {	
		
		HashMap<String,Nave> hmNave = new HashMap<String,Nave>();
		HashMap<String,Flota> hmFlota = new HashMap<String,Flota>();
		
		int opc;
		
		do {
			opc = menu();			
			switch(opc){
			case 1:
				altaNave(hmNave);
				break;
			case 2:
				altaTripulante(hmNave);
				break;
			case 3:
				altaFlota(hmNave,hmFlota);
				break;
			case 4:
				consultaNave(hmNave);
				break;
			case 5:
				consultaFlota(hmFlota);
				break;
			case 0:
				System.out.println("Que la fuerza te acompañe...");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;			
			}
			
		}while(opc!=0);
		
	}
	public static int menu() {	
		System.out.println("-----------Menu de la galaxia-----------");
		System.out.print("1-Alta de nave\t\t");
		System.out.println("4-Consulta nave");
		System.out.print("2-Alta de tripulante\t");
		System.out.println("5-Consulta flota");
		System.out.print("3-Alta de flota\t\t");
		System.out.println("0-Salir");
		System.out.println("----------------------------------------");
		return validaEnteros();
	}
	
	//dar de alta una nave
	public static void altaNave(HashMap<String,Nave> hmNave) {
		do {
			System.out.println("Introduzca el nombre de la nave:");
			String nombreNave = scan.nextLine();
			if(hmNave.containsKey(nombreNave)) {
				System.out.println("Esa nave ya existe.");
			}else {
				hmNave.put(nombreNave, new Nave(nombreNave));
				break;
			}			
		}while(true);
	}
	
	//dar de alta un tripulante. se necesita alguna nave donde darlo de alta.
	public static void altaTripulante(HashMap<String,Nave> hmNave) {
		ArrayList<String> rangos = new ArrayList<String>();
		rangos.add("soldado");
		rangos.add("capitan");
		rangos.add("comandante");
		System.out.println("Introduzca el nombre de la nave donde estará el tripulante:");
		String nombreNave = scan.nextLine();	
		
		if(hmNave.containsKey(nombreNave)) {
			System.out.println("Introduzca el nombre del tripulante para la nave " + nombreNave);
			String nombre = scan.nextLine();				
			System.out.println("Introduzca la edad del nuevo tripulante");
			int edad = validaEnteros();	
			do {
				System.out.println("Introduzca su rango");
				String rango = scan.nextLine();	
				if(rangos.contains(rango.toLowerCase())) {
					hmNave.get(nombreNave).meteTripulante(new Tripulante(nombre,edad,rango));
					break;
				}				
			}while(true);
		}else {
			System.out.println("La nave no existe.");
		}				
	}
	
	//dar de alta una flota.
	public static void altaFlota(HashMap<String,Nave> hmNave,HashMap<String,Flota> hmFlota) {
		String nombreFlota;
		do {
			System.out.println("Introduzca el nombre de la flota:");
			nombreFlota = scan.nextLine();
			if(hmFlota.containsKey(nombreFlota)) {
				System.out.println("Esa flota ya existe.");
			}else {
				hmFlota.put(nombreFlota, new Flota(nombreFlota));	
				break;
			}			
		}while(true);
		
		
		String nombreNave;
		do {
			System.out.println("Introduzca nombre de nave para añadir a la flota Estelar (hasta teclear 'salir'):");			
			nombreNave = scan.nextLine();
			if(nombreNave.equals("salir")) {
				break;
			}
			if(hmNave.containsKey(nombreNave)){
				if(hmNave.get(nombreNave).getFlota().equals("")) {
					hmNave.get(nombreNave).meteFlota(nombreFlota);
					hmFlota.get(nombreFlota).meteNave(hmNave.get(nombreNave));						
				}else {
					System.out.println("La nave ya está en la flota " + hmNave.get(nombreNave).getFlota());
				}			
			}else {
				System.out.println("La nave no existe.");
			}			
		}while(true);		
	}
	
	//consulta una nave especifica. muestra sus tripulantes
	public static void consultaNave(HashMap<String,Nave> hmNave) {
		System.out.println("Introduzca nombre de la nave:");			
		String nombreNave = scan.nextLine();

		if(hmNave.containsKey(nombreNave)) {
			System.out.println("Encontrada la nave " + nombreNave + " con " + hmNave.get(nombreNave).getTripulantes() + " tripulantes:");
			hmNave.get(nombreNave).verNave();
		}else {
			System.out.println("La nave no existe.");
		}
	}
	
	//consulta una flota específica. muestra sus naves
	public static void consultaFlota(HashMap<String,Flota> hmFlota) {
		System.out.println("Introduzca nombre de la flota:");			
		String nombreFlota = scan.nextLine();

		if(hmFlota.containsKey(nombreFlota)) {
			System.out.println("Encontrada la flota " + nombreFlota + " con " + hmFlota.get(nombreFlota).getNaves() + " naves:");
			hmFlota.get(nombreFlota).verFlota();
		}else {
			System.out.println("La flota no existe.");
		}
	}			
	
	//valida que el numero entero introducido sea válido
	public static int validaEnteros() {		
		while(true) {
			try {
				return Integer.parseInt(scan.nextLine());
				
			}catch(NumberFormatException e) {
				System.out.println("Tiene que introducir un número válido.");				
			}
		}	
	}
}