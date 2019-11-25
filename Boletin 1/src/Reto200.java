import java.util.Scanner;

public class Reto200 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); 
		int col=1;
		int aux = num;
		int i=0,j=0;
		int pos=0;
		
		if(num==0 || num==1) {
			System.out.println(num);
		}else {			
		
		for(i=0;i<num+2;i++) {
			for(j=0;j<col;j++) {				
				if(col-j!=1)
					System.out.print(" ");
				else
					if(col-j==1) {
						if(pos==0) {
							System.out.print(fibonacci(aux));
						}else {
							if(aux==0 || aux==1) {
								System.out.print(aux);
							}else {
																
								System.out.print(fibonacci(aux));
								aux--;
								pos=0;
							}
							
						}	
						
						
					
				}
									
			}
			if(i%2==0) 
				col+=3;
			System.out.println("");
			aux--;
		}
		System.out.printf("i=%s\nj=%s\ncol=%s\naux=%s\n",i,j,col,aux);
		}
	}
	
	public static int fibonacci(int n) {
		if(n>1) {
			return fibonacci(n-2) + fibonacci(n-1);
		}else {
			if(n==1)
				return 1;
			else {
				if(n==0)
					return 0;
			}
		}
		return -1;	
			
	}

}
