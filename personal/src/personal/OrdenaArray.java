package personal;

public class OrdenaArray {

	public static void main(String[] args) {
		int[] cad = new int[20];
		int[] cad2 = new int[20];
		int i=0;
		int j=0;
		int z=19;
		
		
		
		
		for(i=0;i<20;i++) cad[i]=(int)(Math.random()*100);
		
		for(i=0;i<20;i++)
			if(cad[i]%2==0) {
				cad2[j]=cad[i];
				j=j+1;
			}
			else {
				cad2[z]=cad[i];
				z--;
			}
		
		
		for(i=0;i<20;i++)
			System.out.println(cad[i]+"\t"+cad2[i]);
	}

}
