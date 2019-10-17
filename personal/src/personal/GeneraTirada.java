package personal;

public class GeneraTirada {

	public static void main(String[] args) {
		int dado;
		for(int i=0;i<5;i++) {
			dado=(int)(Math.random()*5)+1;
			switch(dado) {
			case 1:
				System.out.print("AS ");
				break;
			case 2:
				System.out.print("10 ");
				break;
			case 3:
				System.out.print("K ");
				break;
			case 4:
				System.out.print("J ");
				break;
			case 5:
				System.out.print("Q ");
				break;
				}
			}
		}
}
