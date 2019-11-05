package personal;

public class Vector {
	public static void main(String[] args) {
	int v[] = {2,3,4}; 
	
	for(int i=0;i<3;i++) {
		System.out.printf("%s\n",v[i]);
		}
	
	
	int x = indexOf(v,2);
	
	}
	public static int indexOf(int v[], int x) {
		for(int i=0; i<v.length;i++)
			if(v[i]==x)
				return i;
		return -1;
	}
}
