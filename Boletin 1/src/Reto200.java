import java.util.Scanner;

public class Reto200 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num; 
		int col;
		int aux;
		int i=0,j=0;
		int pos=0;
		
		do{
			col=1;
			num = scan.nextInt();
			aux = num;
			if(num==0 || num==1) {
				System.out.println(num);
				}else {
					for(i=0;i<num+2;i++) {
						for(j=0;j<col;j++) {
							if(col-j!=1) {
								System.out.print(" ");
								}else {
									if(aux>=0)
										System.out.print(fibonacci(aux));
									}
							}
						if(i%2==0) {
							col+=3;
							}
					
							aux--;
							
						if(aux>=0)
							System.out.print("\n");
						}
					System.out.print("\n====\n");
					}
			}while(num>=0);
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
