import java.util.*;

public class Principal3 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Flota> flotas = new ArrayList<Flota>();
		ArrayList<Nave> naves = new ArrayList<Nave>();		
		
		
		
		int opc;
		
		do {
			opc = menu();			
			switch(opc){
			case 1:
				altaNave(naves);
				break;
			case 2:
				altaTripulante(naves);
				break;
			case 3:
				altaFlota(flotas,naves);
				break;
			case 4:
				consultaNave(naves);
				break;
			case 5:
				consultaFlota(flotas);
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
	public static void altaNave(ArrayList<Nave> naves) {
		System.out.println("Introduzca el nombre de la nave:");
		String nombre = scan.nextLine();
		naves.add(new Nave(nombre));		
	}
	
	//dar de alta un tripulante. se necesita alguna nave donde darlo de alta.
	public static void altaTripulante(ArrayList<Nave> naves) {
		ArrayList<String> rangos = new ArrayList<String>();
		rangos.add("soldado");
		rangos.add("capitan");
		rangos.add("comandante");
		System.out.println("Introduzca el nombre de la nave donde estará el tripulante:");
		String nombreNave = scan.nextLine();	
		
		Nave naveAux = compruebaNave(naves,nombreNave);
		if(naveAux!=null) {
			System.out.println("Introduzca el nombre del tripulante para la nave " + nombreNave);
			String nombre = scan.nextLine();				
			System.out.println("Introduzca la edad del nuevo tripulante");
			int edad = validaEnteros();	
			do {
				System.out.println("Introduzca su rango");
				String rango = scan.nextLine();	
				if(rangos.contains(rango.toLowerCase())) {
					naveAux.meteTripulante(new Tripulante(nombre,edad,rango));
					break;
				}				
			}while(true);
		}			
	}
	
	//dar de alta una flota.
	public static void altaFlota(ArrayList<Flota> flotas, ArrayList<Nave> naves) {
		System.out.println("Introduzca el nombre de la flota:");
		String nombreFlota = scan.nextLine();
		Flota nuevaFlota = new Flota(nombreFlota);
		String nombreNave;
		do {
			System.out.println("Introduzca nombre de nave para añadir a la flota Estelar (hasta teclear 'salir'):");			
			nombreNave = scan.nextLine();
			if(nombreNave.equals("salir")) {
				break;
			}			
			Nave naveAux = compruebaNave(naves,nombreNave);
			if(naveAux!=null) {
				nuevaFlota.meteNave(naveAux);
			}
		}while(true);	
		flotas.add(nuevaFlota);
	}
	
	//consulta una nave especifica. muestra sus tripulantes
	public static void consultaNave(ArrayList<Nave> naves) {
		System.out.println("Introduzca nombre de la nave:");			
		String nombreNave = scan.nextLine();
		
		Nave naveAux = compruebaNave(naves,nombreNave);

		
		if(naveAux!=null) {
			System.out.println("Encontrada la nave " + nombreNave + " con " + naveAux.getTripulantes() + " tripulantes:");
			naveAux.verNave();
		}		
	}
	
	//consulta una flota específica. muestra sus naves
	public static void consultaFlota(ArrayList<Flota> flotas) {
		System.out.println("Introduzca nombre de la flota:");			
		String nombreFlota = scan.nextLine();
		Flota flotaAux = compruebaFlota(flotas,nombreFlota);
		if(flotaAux!=null) {
			System.out.println("Encontrada la flota " + nombreFlota + " con " + flotaAux.getNaves() + " naves:");
			flotaAux.verFlota();
		}		
	}		
	

	//comprueba que la nave existe. 
	public static Nave compruebaNave(ArrayList<Nave> naves, String nombreNave) {
		Iterator<Nave> iter = naves.iterator();
		while(iter.hasNext()) {
			Nave aux = iter.next();
			if(aux.getNombre().equals(nombreNave)) {
				return aux;
			}
		}
		System.out.println("La nave no existe.");
		return null;			
	}
	
	//comprueba que la flota existe.
	public static Flota compruebaFlota(ArrayList<Flota> flotas, String nombreFlota) {
		Iterator<Flota> iter = flotas.iterator();
		while(iter.hasNext()) {
			Flota aux = iter.next();
			if(aux.getNombre().equals(nombreFlota)) {
				return aux;
			}
		}
		System.out.println("La flota no existe.");
		return null;	
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