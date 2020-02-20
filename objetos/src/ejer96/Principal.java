package ejer96;

public class Principal {

	public static void main(String[] args) {
		
		Fracciones f1 = new Fracciones(10,20);
		Fracciones f2 = new Fracciones(2,3);
		Fracciones fmul = f1.multiplicar(f2);
		Fracciones fsuma = f1.sumar(f2);
		
		System.out.println("frac1: " + fsuma.toString());
		
		//System.out.println(fmul.toString());
		
		//System.out.println("frac1: " + fsuma.sumar(f2));
		
		
		
		
		
		
		/*fmul = fmul.invertir();
		System.out.println("frac1: " + fmul.toString());
		Fracciones fdiv = f1.dividir(f2);
		System.out.println("frac2: " + fdiv.toString());
		System.out.println("frac2: " + fdiv.toString());
		
		System.out.println("fracsuma: " + fdiv.toString());
		*/
		

	}

}
