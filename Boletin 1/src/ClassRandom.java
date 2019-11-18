import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ClassRandom {

	public static void main(String[] args) {
		Random r = new Random();
		
		
		
		for(int i=0;i<200;i++) System.out.print(ThreadLocalRandom.current().nextInt(20,30) + "   ");
		
		;
	}

}
