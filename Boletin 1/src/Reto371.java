import java.util.Scanner;

public class Reto371 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cerillas_lado;
		int total=0;
		
		cerillas_lado=scan.nextInt();
		while(cerillas_lado!=0) {
			for(int i=1;i<=cerillas_lado;i++) {
				total+=i*3;
			}			
			System.out.println(total);
			total=0;
			cerillas_lado=scan.nextInt();
		}
	}
}