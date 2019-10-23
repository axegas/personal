package personal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaTry {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		try {
			int edad = scan .nextInt();
			return 1;
		} catch (InputMismatchException e) {
			System.out.println("No introdujiste un número válido");
			return 0;
		}

	}

}

