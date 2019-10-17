package prueba;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float mb;
		float b;
		float kb;
		float gb;
		float tb;
		
		System.out.println("Introduce MB");
		mb = scan.nextFloat();
		
		kb = mb*1024;
		b=kb*1024;
		gb=mb/1024;
		tb=gb/1024;
		
		System.out.println("B\t\tKB\t\tMB\tGB\t\tTB");
		System.out.println("-------------------------------------------------------------");
		System.out.println(b+"\t"+kb+"\t\t"+mb+"\t"+gb+"\t"+tb);

	}

}
