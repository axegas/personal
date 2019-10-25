package personal;

import java.util.Scanner;public class Ejer117 {public static void main(String[] args){Scanner scan = new Scanner(System.in);int personas = scan.nextInt();String nombre = scan.nextLine();String[] parts;for(int i=0;i<personas;i++){nombre = scan.nextLine();parts = nombre.split(" ");System.out.println("Hola, " + parts[1] + ".");}}}