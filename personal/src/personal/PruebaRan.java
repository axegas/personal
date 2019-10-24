package personal;

public class PruebaRan {

	public static void main(String[] args) {
		int num = (int)(Math.random()*300+5);

		for(int i=0;i<30;i++) {
			num = (int)(Math.random()*100+200);
			System.out.println(num);
		}


	}

}
