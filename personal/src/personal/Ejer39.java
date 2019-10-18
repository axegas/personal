package personal;
/*
Autor: Axel Perez Gaspar
Fecha: 18/10/2019
Programación 1º DAM

Descripción:
Juego de Piedra, Papel o Tijera
 */
import java.util.Scanner;

public class Ejer39 {

	public static void main(String[] args) {
		//declaración de variables
		int numOrd = (int) (Math.random()*3+1); //crea el indice para conseguir el valor String del ordenador
		Scanner scan = new Scanner(System.in);
		String ord = null;
		String user;
		
		//calcula el valor del ordenador
		switch(numOrd) {
		case 1: 
			ord = "PIEDRA";
			break;
		case 2:
			ord = "PAPEL";
			break;
		case 3:
			ord = "TIJERA";
			break;
			}		
		//el usuario introduce la jugada
		System.out.print("Introduce tu jugada: ");
		user = scan.nextLine();
		user = user.toUpperCase(); //lo pasa a mayusculas
		//valida que el valor sea correcto
		if(!user.equals("PIEDRA") && !user.equals("PAPEL") && !user.equals("TIJERA")) {
			System.out.println("Has introducido un valor no válido.");
		}else {
			//ejecución
			switch(numOrd) {
			case 1: //piedra
				if(user.equals("PIEDRA")) {
					System.out.println("Has empatado!");
					System.out.println("El ordenador ha sacado: " + ord);
					}else {
						if(user.equals("PAPEL")) {
							System.out.println("Has ganado!");							
							System.out.println("El ordenador ha sacado: " + ord);
							}else {
									System.out.println("Has perdido!");
									System.out.println("El ordenador ha sacado: " + ord);
									}
					}
				break;
				case 2: //papel
					if(user.equals("PIEDRA")) {
						System.out.println("Has perdido!");
						System.out.println("El ordenador ha sacado: " + ord);
						}else {
							if(user.equals("PAPEL")) {
								System.out.println("Has empatado!");							
								System.out.println("El ordenador ha sacado: " + ord);
								}else {
										System.out.println("Has ganado!");
										System.out.println("El ordenador ha sacado: " + ord);
									}
						}
					break;
					case 3: //tijera
				if(user.equals("PIEDRA")) {
					System.out.println("Has ganado!");
					System.out.println("El ordenador ha sacado: " + ord);
					}else {
						if(user.equals("PAPEL")) {
							System.out.println("Has perdido!");							
							System.out.println("El ordenador ha sacado: " + ord);
							}else {
									System.out.println("Has empatado!");
									System.out.println("El ordenador ha sacado: " + ord);
								}
					}
				break;
				}
			}
		}
}

		

