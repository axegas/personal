import java.util.Scanner;

public class Reto140 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		String suma = "";
		int res = 0;
		
		x = scan.nextInt();
		while(x>=0) {
			for(int i=0;i<Integer.toString(x).length();i++) {
				suma += Integer.toString(x).charAt(i)+"";
				if(i<Integer.toString(x).length()-1) {
					suma += " + ";
				}
				res += Integer.parseInt(Integer.toString(x).charAt(i)+"");
			}
			System.out.println(suma + " = " + res);
			suma = "";
			res = 0;
			x = scan.nextInt();
		}
		scan.close();
	}
}