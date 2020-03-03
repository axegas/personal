import java.util.*;
import java.util.stream.Stream;

public class Ejer370 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	
		

		int[] resultado= Stream.of(scan.nextLine().split("-")).mapToInt(Integer::parseInt).toArray();
		
		
		
		
		for(int i=0;i<resultado.length;i++) {
			System.out.println(resultado[i]);
		}	

	}
	
	
}
