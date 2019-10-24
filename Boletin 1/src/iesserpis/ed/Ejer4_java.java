package iesserpis.ed;

import matematicas.Matematicas;

public class Ejer4_java {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int i;
		for(i=0;i<numero.length;i++) {
			numero[i]=(int)(Math.random()*100);
			cuadrado[i]=Matematicas.potencia(numero[i], 2);
			cubo[i]=Matematicas.potencia(numero[i],3);
		}
		for(i=0;i<numero.length;i++) {
			System.out.print(numero[i] + "\t");
			System.out.print(cuadrado[i] + "\t");
			System.out.println(cubo[i]);
		}

	}

}
