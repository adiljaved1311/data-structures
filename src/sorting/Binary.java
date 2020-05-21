package sorting;

public class Binary {

	public static void main(String[] args) {
		int a[] = {1,0,0,0,1,0};
		int temp = 0;
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			if(a[i] == 0) {
				i++;
			}
			else if(a[i] == 1) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}
		} 
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
