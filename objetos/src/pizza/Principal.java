package pizza;

import pizza.Pizza.*;

public class Principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(tipopizza.Margarita, tamanyo.Familiar);
		System.out.println(p1.estadoPizza());
		Pizza p2 = new Pizza(tipopizza.Hawaiana, tamanyo.Mediana);
		System.out.println(p2.estadoPizza());
		
		System.out.println(Pizza.totalPedidas);
		
		p1.servir();
		System.out.println(p1.estadoPizza());
		p1.servir();
		
		System.out.println(Pizza.totalPedidas);
		System.out.println(Pizza.totalServidas);

	}
	

}
