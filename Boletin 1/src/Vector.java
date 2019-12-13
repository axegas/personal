
public class Vector {

	public static void main(String[] args) {
		//int[] v = {1,5,7,9,10};
	

	}

	 public static int[] selectionSort(int[] v) {
	        int aux;
	        for (int i=0; i < v.length-1; i++) {
	            for (int j = 0; j < v.length-i-1; j++) {
	                if (v[j+1] < v[j]) {
	                    aux = v[j+1];
	                    v[j+1] = v[j];
	                    v[j] = aux;
	                }
	            }
	        }
	        return v;       
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
