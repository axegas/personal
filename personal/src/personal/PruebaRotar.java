package personal;

public class PruebaRotar {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[10];

		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*100+200);
			System.out.print(arr[i] + "  ");
		}
		System.out.println("  ");
		
		for(int i=0;i<10;i++) {
			if(i==0) arr2[i] = arr[9];
			else arr2[i]=arr[i-1];
			System.out.print(arr2[i] + "  ");
		}
		
		
	

	}

}
