import java.util.Scanner;

public class Reto427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		String str1;
		String str2;
		
		casos = scan.nextInt();
		scan.nextLine();
		while(casos>0) {
			str1 = scan.nextLine();
			str2 = scan.nextLine();
			if(str1.equals("Luke") && str2.equals("padre"))	
				System.out.println("TOP SECRET");
			else 
				System.out.println(str1 + ", yo soy tu " + str2);			
			casos--;			
		}
		/*
		for(int i=0;i<casos;i++) {
			str1 = scan.nextLine();
			str2 = scan.nextLine();
			if(str1.equals("Luke") && str2.equals("padre") ) {
				System.out.println("TOP SECRET");
			}else {
				System.out.println(str1 + ", yo soy tu " + str2);
			}
		}
		*/
	}
}
