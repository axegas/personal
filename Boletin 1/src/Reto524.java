import java.util.Scanner;

public class Reto524 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		int C;
		int T;
		int res=0;
		int[] vecC;
		int[] vecT;
		
		N=scan.nextInt();		
		while(N!=0) {
			C=scan.nextInt();
			T=scan.nextInt();
			vecC=new int[N];
			vecT=new int[N];
			for(int i=0;i<N;i++) {
				vecC[i]=scan.nextInt();
			}
			for(int i=0;i<N;i++) {
				vecT[i]=scan.nextInt();
			}
			for(int i=0;i<N;i++) {
				if(vecC[i]<vecT[i]) {
					res+=vecC[i];
					C--;
				}else {
					res+=vecT[i];
					T--;
				}
			}			
			System.out.println(res);
			N=scan.nextInt();
			res=0;			
		}

	}

}
