import java.util.Scanner;

public class Ejer72 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opc=0;
		float val1=0;
		float val2=0;
		float resu=0;
		do {
			System.out.println("1. Sumar");			
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Potencia");
			System.out.println("6. Raiz Cuadrada");
			System.out.println("9. Salir");
			System.out.print("Introduce la opción: ");
			opc = scan.nextInt();
			if(opc==9) {
				System.out.println("Fin del programa.");
				break;
			}
			else {				
				switch(opc) {
				case 1:
					System.out.print("Introduce el primer valor: ");
					val1 = scan.nextFloat();
					System.out.print("Introduce el segundo valor: ");
					val2 = scan.nextFloat();
					resu = suma(val1,val2);
					break;
				case 2:
					System.out.print("Introduce el primer valor: ");
					val1 = scan.nextFloat();
					System.out.print("Introduce el segundo valor: ");
					val2 = scan.nextFloat();
					resu = resta(val1,val2);
					break;
				case 3:
					System.out.print("Introduce el primer valor: ");
					val1 = scan.nextFloat();
					System.out.print("Introduce el segundo valor: ");
					val2 = scan.nextFloat();
					resu = multiplica(val1,val2);
					break;
				case 4:
					System.out.print("Introduce el primer valor: ");
					val1 = scan.nextFloat();
					System.out.print("Introduce el segundo valor: ");
					val2 = scan.nextFloat();
					resu = divide(val1,val2);
					break;
				case 5:
					System.out.print("Introduce el exponente: ");
					val1 = scan.nextFloat();
					System.out.print("Introduce la base: ");
					val2 = scan.nextFloat();
					resu = potencia(val1,val2);
					break;
				case 6:
					System.out.print("Introduce el valor: ");
					val1 = scan.nextFloat();
					resu = raizCuadrada(val1);
					break;
					default:
						System.out.println("Opción incorrecta.");
						break;					
				}
				System.out.println("El resultado es: " + resu);
			}
		}while(opc!=9);		
	}
	public static float suma(float val1, float val2) {		
		return val1+val2;		
	}
	public static float resta(float val1, float val2) {
		return val1-val2;
	}
	public static float multiplica(float val1, float val2) {
		return val1*val2;
	}
	public static float divide(float val1, float val2) {
		return val1/val2;
		
	}
	public static float potencia(float exponente, float base) {
		float num = 1;		
		for(int i=0;i<exponente;i++) {
			num=num*base;
		}	
		return num;		
	}
	public static float raizCuadrada(float val1) {
		return (float) Math.sqrt(val1);
		
	}
}
