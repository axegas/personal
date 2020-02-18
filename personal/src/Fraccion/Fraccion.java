package Fraccion;

public class Fraccion {
	private int num;
	private int den;
	
	public Fraccion(int a,int b) {
		num=a;
		den=b;
	}
	
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	public String toString() {
		return num + " / " + den;
	}
	
	public Fraccion multiplica(Fraccion f) {
		return new Fraccion(f.getNum()*num,f.getDen()*den);
	}
	public Fraccion divide(Fraccion f) {
		return new Fraccion(num*f.getDen(),den*f.getNum());
	}
	public Fraccion suma(Fraccion f) {
		int nuevoDen = den*f.getDen();
		int nuevoNum = num*f.getDen()+den*f.getNum();

		nuevoDen/=mcd(nuevoDen,nuevoNum);
		nuevoNum/=mcd(nuevoDen,nuevoNum);
		
		return new Fraccion(nuevoNum,nuevoDen);
	}
	public Fraccion resta(Fraccion f) {
		int nuevoDen = den*f.getDen();
		int nuevoNum = num*f.getDen()-den*f.getNum();

		nuevoDen/=mcd(nuevoDen,nuevoNum);
		nuevoNum/=mcd(nuevoDen,nuevoNum);
		
		return new Fraccion(nuevoNum,nuevoDen);
	}
	public Fraccion simplifica() {
		return new Fraccion(num/mcd(num,den),den/mcd(num,den));
	}
	
	private int mcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return mcd(b,a%b);
		}		
	}

}