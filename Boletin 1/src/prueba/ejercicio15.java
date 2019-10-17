package prueba;

public class ejercicio15 {

	public static void main(String[] args) {
		float general = 0.21f;
		float reducido = 0.10f;
		float superreducido = 0.04f;
		float x = 78;		
		
		System.out.println("El importe de tu producto es de " + x + " euros");
		System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería: " + (x-x*general));
		System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: " + (x-x*reducido));
		System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: " + (x-x*superreducido));
		
		
		
		
	}

}
