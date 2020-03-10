package Zoo;

import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {

		ArrayList<Animal> animales = new ArrayList<Animal>();

		int opc;
		do {
			opc = menu();
			switch (opc) {
			case 1:
				altaAnimal(animales);
				break;
			case 2:
				bajaAnimal(animales);
				break;
			case 3:
				modificaPeso(animales);
				break;
			case 4:
				listado(animales);
				break;
			case 5:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
		} while (opc != 5);
	}

	// menu
	public static int menu() {
		System.out.println("--------Bienvenido al Zoo---------------");
		System.out.println("----------------------------------------");
		System.out.println("1-Dar de alta animal");
		System.out.println("2-Dar de baja animal");
		System.out.println("3-Modificar peso");
		System.out.println("4-Listado animales");
		System.out.println("5-Salir");
		return validaEnteros();

	}

	public static void altaAnimal(ArrayList<Animal> animales) throws Exception {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Dime el tipo:");
			String tipo = validaTipo(scan.nextLine());
			System.out.println("Dime el nombre:");
			String nombre = validaNombre(scan.nextLine());			
			System.out.println("Dime el peso:");
			int peso = validaPeso();
			animales.add(new Animal(tipo,nombre,peso));
		}catch(Exception e) {
			System.out.println( e.getMessage() );
		}		
	}

	public static void bajaAnimal(ArrayList<Animal> animales) throws Exception {
		Scanner scan = new Scanner(System.in);
		boolean existe = false;
		try {
			System.out.println("Dime el nombre:");
			String nombre = validaNombre(scan.nextLine());
			Iterator<Animal> iter = animales.iterator();
			while(iter.hasNext()) {
				Animal ani = iter.next();
				if(ani.getNombre().equals(nombre)) {
					animales.remove(ani);
					existe = true;
					break;
				}
			}
			if(existe) {
				System.out.println(nombre + " dado de 'baja'.");
			}else {
				System.out.println(nombre + " no existe en el zoo.");
			}
		}catch(Exception e) {
			System.out.println( e.getMessage() );
		}
	}

	public static void listado(ArrayList<Animal> animales) {
		Iterator<Animal> iter = animales.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}

	public static void modificaPeso(ArrayList<Animal> animales) {
		Scanner scan = new Scanner(System.in);
		boolean existe = false;
		try {
			System.out.println("Dime el nombre:");
			String nombre = validaNombre(scan.nextLine());
			System.out.println("Dime el peso:");
			int peso = validaPeso();
			Iterator<Animal> iter = animales.iterator();
			while(iter.hasNext()) {
				Animal ani = iter.next();
				if(ani.getNombre().equals(nombre)) {
					ani.setPeso(peso);
					existe = true;
					break;
				}
			}
			if(existe) {
				System.out.println(nombre + " ahora pesa " + peso);
			}else {
				System.out.println(nombre + " no existe en el zoo.");
			}
		}catch(Exception e) {
			System.out.println( e.getMessage() );
		}
	}

	public static String validaTipo(String tipo) throws Exception {		
		if (!tipo.equals("l") && !tipo.equals("t")) {
			throw new Exception("Tiene que introducir un tipo correcto");
		} else {
			return tipo;
		}
	}

	public static String validaNombre(String nombre) throws Exception {
		for (int i = 0; i < nombre.length(); i++) {
			if (Character.isDigit(nombre.charAt(i))) {
				throw new Exception("El nombre no puede tener números.");
			}
		}
		return nombre;

	}
	public static int validaPeso() throws Exception {
		Scanner scan = new Scanner(System.in);
		try {
			return Integer.parseInt(scan.nextLine());
		}catch(NumberFormatException e) {
			throw new Exception("El peso tiene que ser un valor numérico.");
		}
	}
	

	// leer enteros
	public static int validaEnteros() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				return Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Tiene que introducir un número válido.");
			}
		}
	}

}