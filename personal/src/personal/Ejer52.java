package personal;

public class Ejer52 {

	public static void main(String[] args) {
		int[] num= new int[100];
		int suma = 0;
		int media = 0;
		
		for(int i=0;i<100;i++) {
			num[i]=i+1;
			suma+=num[i];
		}
		
		media=suma/100;
		
		System.out.println(suma);
		System.out.println(media);
		
			

		
	}

}
