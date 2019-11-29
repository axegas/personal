import java.util.Scanner;

public class Reto363 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cal_entrene;
		int comilonas;
		int calorias;
		int suma=0;
		int entrenes=0;
		
		cal_entrene=scan.nextInt();//calorias de cada entrenamiento
		while(cal_entrene!=0) {
			comilonas=scan.nextInt();//numero de comilonas en navidad
			for(int i=0;i<comilonas;i++) {
				calorias=scan.nextInt();//calorias de cada comilona
				suma+=calorias;//suma de calorias totales
			}
			if(suma%cal_entrene==0) {
				entrenes=suma/cal_entrene;//si el resultado es entero
			}else
				entrenes=suma/cal_entrene+1;//si el resultado no es entero
			System.out.println(entrenes);//print de el nº de entrenes necesarios
			suma=0;
			cal_entrene=scan.nextInt();
		}	
	}
}
