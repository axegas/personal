package iesserpis.ed;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer61 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Introduce el tamaño del vector: ");
		int tam = scan.nextInt();
		int min = 1;
		int max = 100;
		int[] array = new int[tam];
		int opc=0;
		
		
		do {
			System.out.println("----------Pulse una opción del menú---------");
			System.out.println("1-Rellenar vector por teclado");
			System.out.println("2-Rellenar vector de forma aleatoria (de 1 a 100)");
			System.out.println("3-Modificar una posición del vector");
			System.out.println("4-Consultar una posición del vector");
			System.out.println("5-Mostrar todo el vector");
			System.out.println("6-Ordenar ascendentemente el vector");
			System.out.println("9-Salir");
			System.out.println("-----------------------------------------");
			opc=scan.nextInt();
			
		
		
		switch(opc) {
		case 1:
			array=rellenaArrayTeclado(array,min,max);
			break;
		case 2:
			array=rellenaArrayAleatorio(array,min,max);
			break;
		case 3:
			array=modificaArray(array,min,max);
			break;
		case 4:
			consultarPosicionArray(array,min,max);
			break;
		case 5:
			muestraArray(array);
			break;
		case 6:
			ordenaArray(array);
			break;
		case 9:
			System.out.println("Fin del programa");
			break;
			}
		}while(opc!=9);
		
		

	}
	public static void consultarPosicionArray(int[] array,int min,int max) {
		int pos;
		do {
			System.out.printf("Introduce la posición a consultar: (entre %s y %s)\n",min,array.length);
			pos = PruebaError();
			if(pos>=max & pos<0) System.out.println("No introdujiste un número válido");
			else {
				System.out.printf("El valor en la posicion %s es %s\n ",pos,array[pos]);
			}			
		}while(pos>=max & pos<0);		
	}
	public static int[] rellenaArrayAleatorio(int[] array, int min, int max) {		
		for(int j=0;j<array.length;j++) {
				array[j]= getNumeroRandom(min,max);
			}
	return array;
	}
	public static int[] rellenaArrayTeclado(int[] array, int min, int max) {
		
		for(int j=0;j<array.length;j++) {
			System.out.printf("Introduce la posicion %s del array:", j);
				array[j]= scan.nextInt();;
			}
	return array;
	}
	
	public static int getNumeroRandom(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max+1);
		}
	public static int[] modificaArray(int[] array, int min, int max) {
		int pos;
		do {
			System.out.printf("Introduce la posición del valor a modificar: (entre %s y %s)\n",(min-1),(array.length-1));
			pos = PruebaError();
			if(pos>=max & pos<0) System.out.println("No introdujiste un número válido");
			else {
				System.out.print("Introduce el nuevo valor: ");
				array[pos]=PruebaError();
			}			
		}while(pos>=max & pos<0);		
		
		return array;
	}
	public static int PruebaError() {
		try {			
			int n = scan.nextInt();
			return n;
		} catch (InputMismatchException e) {
			System.out.println("No introdujiste un número válido");
			return -1;
		}

	}
	public static void muestraArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length-1) System.out.print(",");
		}
		System.out.print("\n");
	}
	public static void ordenaArray(int[] array) {		
		for(int i=0;i<(array.length-1);i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int aux=array[i];
					array[i]=array[j];
					array[j]=aux;
					}
				}
			}
		}
	}
