

public class PruebaMax {

	public static void main(String[] args) {
		int max = max(new int[] {4,14,24,8,7});
		System.out.println(max);
		
		
		


	}
	public static int max(int v[]) {		
		int m = v[0];
		for(int i=1;i<v.length;i++) {
			if(v[i]>m) {
				m=v[i];
			}
		}		
		return m;
	}

}
