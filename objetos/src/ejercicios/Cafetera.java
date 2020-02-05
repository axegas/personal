package ejercicios;

public class Cafetera {

	private int capacidadMaxima;
	static int cantidadActual = 0;
	
	public Cafetera(int maxima) {
		capacidadMaxima = maxima;
	}
	
	public void llenarCafetera() {
		System.out.println("Llenamos la cafetera. Disponibles: "+capacidadMaxima+"cl");
		cantidadActual = capacidadMaxima;
	}
	
	public void servirTaza(int cantidad) {
		if(cantidadActual==0) {
			System.out.println("La cafetera está vacía");
		}else {
			if(cantidad>cantidadActual) {
				System.out.println("Solo te puedo servir "+cantidadActual+"cl");
				cantidadActual=0;
			}else {
				cantidadActual -= cantidad;
				System.out.println("Te sirvo una taza de "+cantidad+"cl. Quedan disponibles "+cantidadActual);
			}
		}	
	}
	
	public void vaciarCafetera() {
		System.out.println("Cafetera vacia.");
		cantidadActual=0;
	}
	
	public void agregarCafe(int cantidad) {
	
		if((cantidadActual+cantidad)>capacidadMaxima) {
			System.out.println("Solo te puedo agregar "+(capacidadMaxima-cantidadActual)+"cl");
			cantidadActual=capacidadMaxima;
			//System.out.println("No podemos agregar tanta cantidad, la cafetera rebosaría.");
		}else {
			System.out.println("Agregamos "+cantidad+"cl. Quedan disponibles "+cantidadActual);
			cantidadActual += cantidad;
		}
	}
	
	
	
	
}
