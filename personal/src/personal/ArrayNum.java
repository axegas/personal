package personal;

public class ArrayNum {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for(int i=0;i<20;i++) {
			numero[i]=(int)(Math.random()*100+1);
			cuadrado[i]=(int) Math.pow(numero[i], 2);
			cubo[i]=(int) Math.pow(numero[i], 3);
		}
		for(int i=0;i<20;i++) {
			System.out.printf("%s\t%s\t%s\n", numero[i],cuadrado[i],cubo[i]);
		}
	}

}
