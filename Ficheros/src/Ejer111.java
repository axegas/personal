import java.io.*;
import java.util.*;

public class Ejer111 {

	public static void main(String[] args) {
		File salida = new File("Salida3.txt");
		ArrayList<String> AL = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(salida);
			String l;
			while(sc.hasNext()) {
				l = sc.nextLine();
				if(Integer.parseInt(l)%5==0) {
					AL.add(l);
				}
			}
			Iterator<String> iter = AL.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
			
			sc.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());		
		}

	}

}
