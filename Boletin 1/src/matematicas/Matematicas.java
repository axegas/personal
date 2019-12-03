package matematicas;

public class Matematicas {
	
	public static int potencia(int base, int exponente) {
		int num = 1;		
		for(int i=0;i<exponente;i++) {
			num=num*base;
		}	
		return num;
	}
	
	public static int digitos(int x) {//dado un numero, devuelve el tamaño (los digitos) que tiene ese numero
		int aux = x;
		int n=0;
		
		while(aux!=0) {
			n++;
			aux=aux/10;
		}		
		return n;		
	}
	
	public static int voltea(int x) {
		int y=0;
		int aux;
		int n=0;
		
		n = digitos(x);
		int i = n;
		
		while(i>0) {
			aux = x%10;
			y =y + (int) (aux*potencia(10,i-1));
			x=x/10;
			i--;			
		}		
		return y;		
	}
	
	public static boolean esCapicua(int x) {		
		if(voltea(x)==x) return true;
		else return false;
	}
	
	public static boolean esPrimo(int x) {
		for(int i=2;i<x;i++)
			if(x%i==0)
				return false;
		return true;
	}
	
	public static int digitoN(int digito, int n) {
		int pos=0;
		for(int i=0;i<n;i++) {
			pos = digito%10;
			digito=digito/10;			
		}		
		return pos;
	}
	
	public static void palote(int n) {
		for(int i=0;i<n;i++) System.out.print("|");				
	}	
	
	public static int digitoPos(int digito, int posicion) {//dado un numero, devuelve el digito que hay en la posicion
		int dig=0;
		for(int i=0;i<posicion;i++) {
			dig=digito%10;
			digito=digito/10;			
		}
		return dig;
	}
	
	public static int fibonacci(int n) {
		if(n>1) {
			return fibonacci(n-2) + fibonacci(n-1);
		}else {
			return n;
		}			
	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static int max(int v[]) {		
		int m = v[0];
		for(int i=1;i<v.length;i++) {
			if(v[i]>m) {
				m=v[i];
			}
		}		
		return m;
	}
	
	public static int min(int v[]) {		
		int m = v[0];
		for(int i=1;i<v.length;i++) {
			if(v[i]<m) {
				m=v[i];
			}
		}		
		return m;
	}
	public static int sumatorio(int n) {
		if(n==1)
			return 1;
		else
			return n+sumatorio(n-1);
	}
}

