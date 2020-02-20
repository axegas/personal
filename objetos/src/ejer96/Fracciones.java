package ejer96;

public class Fracciones {

	private int num, den;
	
	public Fracciones(int numerador, int denominador) {
		num = numerador;
		den = denominador;		
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public Fracciones invertir() {
		return (new Fracciones(den,num));
	}
	
	public String toString() {
		return num + " / " + den;
	}
	
	public Fracciones multiplicar(Fracciones f) {				
		return (new Fracciones(num*f.getNum(),den*f.getDen()));		
	}
	
	public Fracciones dividir(Fracciones f) {				
		return (new Fracciones(num*f.getDen(),den*f.getNum()));		
	}
	
	public Fracciones sumar(Fracciones f) {
		
		int nuevoDen;
		int nuevoNum1=0;
		int nuevoNum2=0;
		
		nuevoDen = den*f.getDen();
	/*
		for(int i=2;i<Math.min(den, f.getDen());i++) {
			for(int j=2;i<Math.min(den, f.getDen());j++) {
				if(f.getDen()%i==0 && den%i==0) {
					nuevoDen=nuevoDen/i;
				}else {
					break;
				}
			}				
		}
		*/
		nuevoNum1=num*(den/nuevoDen);
		nuevoNum2=f.getNum()*(f.getDen()/nuevoDen);
		
		int nuevoNum = nuevoNum1+nuevoNum2;
				
		return (new Fracciones(nuevoNum,nuevoDen));		
	}
	public Fracciones restar(Fracciones f) {
		int nuevoDen;
		int nuevoNum1=0;
		int nuevoNum2=0;
		
		nuevoDen = den*f.getDen();
	
		for(int i=2;i<=Math.min(den, f.getDen());i++) {
			for(int j=2;i<=Math.min(den, f.getDen());j++) {
				if(f.getDen()%i==0 && den%i==0) {
					nuevoDen/=i;
				}else {
					break;
				}
			}				
		}
		
		nuevoNum1=num*(den/nuevoDen);
		nuevoNum2=f.getNum()*(f.getDen()/nuevoDen);
		
		int nuevoNum = nuevoNum1-nuevoNum2;
				
		return (new Fracciones(nuevoNum,nuevoDen));	
	}
	

	
	
	
	
	
}
