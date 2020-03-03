import java.util.*;

import javax.swing.JOptionPane;

public class Principal4 {

	public static void main(String[] args) {

		ArrayList<Flota> flotas = new ArrayList<Flota>();
		ArrayList<Nave> naves = new ArrayList<Nave>();

		String opc;

		do {
			opc = menu();
			switch (opc) {
			case "1":
				altaNave(naves);
				break;
			case "2":
				altaTripulante(naves);
				break;
			case "3":
				altaFlota(flotas, naves);
				break;
			case "4":
				consultaNave(naves);
				break;
			case "5":
				consultaFlota(flotas);
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "Que la fuerza te acompañe...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta.");
				break;
			}

		} while (!opc.equals("0"));

	}

	public static String menu() {
		return JOptionPane.showInputDialog(null, "1. Alta de nave\n" 
											   + "2. Alta de tripulante\n"
											   + "3. Alta de flota\n"
											   + "4. Consulta nave\n"
											   + "5. Consulta flota\n"
											   + "0. Salir", "Menu", 0);
	
	}

	// dar de alta una nave
	public static void altaNave(ArrayList<Nave> naves) {
		String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre de la nave:\n");
		naves.add(new Nave(nombre));
	}

	// dar de alta un tripulante. se necesita alguna nave donde darlo de alta.
	public static void altaTripulante(ArrayList<Nave> naves) {
		ArrayList<String> rangos = new ArrayList<String>();
		rangos.add("soldado");
		rangos.add("capitan");
		rangos.add("comandante");
		String nombreNave = JOptionPane.showInputDialog(null, "Introduzca el nombre de la nave:\n");
		Nave naveAux = compruebaNave(naves, nombreNave);
		
		if (naveAux != null) {
			String nombre = JOptionPane.showInputDialog(null,"Introduzca el nombre del tripulante para la nave " + nombreNave);
			int edad;

			while (true) {
				try {
					edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la edad del nuevo tripulante"));
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Tiene que introducir un número válido.");
				}
			}
			
			do {
				String rango = JOptionPane.showInputDialog(null, "Introduzca su rango");
				if (rangos.contains(rango.toLowerCase())) {
					naveAux.meteTripulante(new Tripulante(nombre, edad, rango));
					break;
				}
			} while (true);
		}
	}

	// dar de alta una flota.
	public static void altaFlota(ArrayList<Flota> flotas, ArrayList<Nave> naves) {
		String nombreFlota = JOptionPane.showInputDialog(null, "Introduzca el nombre de la flota:\n");
		Flota nuevaFlota = new Flota(nombreFlota);
		do {
			String nombreNave = JOptionPane.showInputDialog(null,"Introduzca el nombre de la nave ('salir' para terminar):\n");
			if (nombreNave.equals("salir")) {
				break;
			}
			Nave naveAux = compruebaNave(naves, nombreNave);
			if (naveAux != null) {
				if (naveAux.getFlota().equals("")) {
					nuevaFlota.meteNave(naveAux);
					naveAux.meteFlota(nombreFlota);
				} else {
					JOptionPane.showMessageDialog(null, "La nave ya est� en la flota " + naveAux.getFlota());
				}
			}
		} while (true);
		flotas.add(nuevaFlota);
	}

	// consulta una nave especifica. muestra sus tripulantes
	public static void consultaNave(ArrayList<Nave> naves) {
		String nombreNave = JOptionPane.showInputDialog(null,"Introduzca el nombre de la nave:\n");
		Nave naveAux = compruebaNave(naves, nombreNave);
		if (naveAux != null) {
			if(!naveAux.getFlota().equals("")) {
				JOptionPane.showMessageDialog(null,"Encontrada la nave " + nombreNave + " con " + naveAux.getTripulantes() + " tripulantes que est� en la flota " + naveAux.getFlota() + "\n" + naveAux.verNave());
			}else {
				JOptionPane.showMessageDialog(null,"Encontrada la nave " + nombreNave + " con " + naveAux.getTripulantes() + " tripulantes:\n" + naveAux.verNave());
			}			
		}
	}

	// consulta una flota específica. muestra sus naves
	public static void consultaFlota(ArrayList<Flota> flotas) {
		String nombreFlota = JOptionPane.showInputDialog(null, "Introduzca el nombre de la flota:\n");
		Flota flotaAux = compruebaFlota(flotas, nombreFlota);
		if (flotaAux != null) {
			JOptionPane.showMessageDialog(null,"Encontrada la flota " + nombreFlota + " con " + flotaAux.getNaves() + " naves:\n" + flotaAux.verFlota());
		}
	}

	// comprueba que la nave existe.
	public static Nave compruebaNave(ArrayList<Nave> naves, String nombreNave) {
		Iterator<Nave> iter = naves.iterator();
		while (iter.hasNext()) {
			Nave aux = iter.next();
			if (aux.getNombre().equals(nombreNave)) {
				return aux;
			}
		}
		JOptionPane.showMessageDialog(null, "La nave no existe.");
		return null;
	}

	// comprueba que la flota existe.
	public static Flota compruebaFlota(ArrayList<Flota> flotas, String nombreFlota) {
		Iterator<Flota> iter = flotas.iterator();
		while (iter.hasNext()) {
			Flota aux = iter.next();
			if (aux.getNombre().equals(nombreFlota)) {
				return aux;
			}
		}
		JOptionPane.showMessageDialog(null, "La flota no existe.");
		return null;
	}
}
