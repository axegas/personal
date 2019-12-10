import java.util.Scanner;

public class Ejer79 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = scan.nextInt();
		
				
		bomba2(num);
	
		
		
	}

	public static void bomba2(int n) {
		System.out.println(n);
		try {
			Thread.sleep(1000);
		if(n==0){
			System.out.println("BOOM!");			
		}else {
			bomba2(n-1);
		}
		}catch(InterruptedException e){			
			e.printStackTrace();			
		}
	}

}
