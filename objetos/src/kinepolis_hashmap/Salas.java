package kinepolis_hashmap;

import java.util.*;

public class Salas {
	
	private Queue<Cliente> cliente = new LinkedList<Cliente>();
	
	public Salas() {
	}
	
	public void meteCliente(Cliente c) {
		cliente.add(c);
	}
	
	public void verSala() {		
		Iterator<Cliente> iter = cliente.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().verCliente());
		}
	}
		
	public void borraCliente() {
		if(cliente.isEmpty()) {
			System.out.println("No hay clientes.");
		}else {
			cliente.remove();	
		}		
	}		
}
