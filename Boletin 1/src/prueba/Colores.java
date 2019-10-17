package prueba;

public class Colores {	

		  //Colores de letra
		  static String black="\033[30m"; 
		  static String red="\033[31m"; 
		  static String green="\033[32m"; 
		  static String yellow="\033[33m"; 
		  static String blue="\033[34m"; 
		  static String purple="\033[35m"; 
		  static String cyan="\033[36m"; 
		  static String white="\033[37m";
		  static String reset="\u001B[0m";

		  //Vamos a probarlos!!
		  public static void main(String[] args) {
		    System.out.println("\n\nColor normal!!\n\n");
		    System.out.println(red + "Texto de color rojo" + reset);
		    System.out.println(blue + "Texto de color azul" + reset);
		    System.out.println("Como no lo he resetado sigue igual.");
		    System.out.println("¡Reseteo ahora!" + reset);
		    System.out.println("FIN");
		    System.out.println("\033[31mEste texto es Rojo");
		    System.out.println("\033[31mEste texto es Rojo");
		    System.out.println("\033[31mEste texto es Rojo");
		  }
		}


