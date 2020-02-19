package PruebaEvaluable;

public class Escenario {
	
	private String nombre;
	private Luchador l1;
	private Luchador l2;

	
	public Escenario(String nombre,Luchador l1, Luchador l2) {
		this.nombre=nombre;
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public Luchador combate() throws InterruptedException {
		boolean turno=false;
		boolean victoria=false;
		int round = 1;	
		
		l1.setVida(100);
		l2.setVida(100);
		l1.setVictorias();
		l2.setVictorias();

		System.out.println("Comienza la pelea entre " + l2.getNombre() + " y " + l1.getNombre() + " en " + nombre);			
		while(round<=3 && !victoria) {
			System.out.println("Round " + round + "....Fight!" );
			while(l2.getVida()>0 && l1.getVida()>0) {
				Thread.sleep(1000);
				if(turno) {
					System.out.println(l2.getNombre() + " golpea a " + l1.getNombre() + " con una intensidad de " + l2.golpe(l1) + "\t"+l2.getNombre()+": "+l2.getVida()+" "+l1.getNombre()+": "+l1.getVida());
					turno = false;
				}else {
					System.out.println(l1.getNombre() + " golpea a " + l2.getNombre() + " con una intensidad de " + l1.golpe(l2) + "\t"+l2.getNombre()+": "+l2.getVida()+" "+l1.getNombre()+": "+l1.getVida());
					turno = true;
				}								
			}
			
			if(l2.getVida()==0) {
				victoria = victoria(l1);
			}else {
				victoria = victoria(l2);
			}
			
			
			l1.setVida(100);
			l2.setVida(100);			
			round++;
		}
		if(l1.getGanador()) {
			l1.setGanador(false);
			l2.setGanador(false);
			return l1;
		}else {
			l1.setGanador(false);
			l2.setGanador(false);
			return l2;
		}		
	}
	private boolean victoria(Luchador l) {		
		System.out.println("El ganador de este Round es: " + l.getNombre());
		l.ganaRound();
		if(l.getVictorias()==2) {
			System.out.print("El ganador de esta pelea es: " + l.getNombre());
			System.out.println(". " + l.getMensaje());
			l.setGanador(true);
			return true;
		}else {
			return false;
		}
	}
}
