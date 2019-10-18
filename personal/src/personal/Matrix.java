package personal;

public class Matrix {

	public static void main(String[] args) {
		char caracter;
		int num;
		while(true) {
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				num = (int) (Math.random()*250+32);
				caracter = (char) num;
				System.out.print(caracter + " ");
			}
			System.out.println(" ");
		}
		}

	}

}
