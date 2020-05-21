package sorting;

public class Quick {
	public static void main(String[] args) {
		int a[] = { 12, 5, 8, 2, 24, 10 };
		int l=0;
		int u=a.length-1;
		A.quickSort(a, l, u);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

class A {
	static public void quickSort(int a[], int lower, int upper) 
	{
		int pivot,left,right,b;
		
		if(lower < upper) 
		{
			pivot = lower;
			left = lower+1;
			right = upper;
			
			while(right >= left) 
			{
				while(a[left] <= a[pivot] && left <= upper)
				{
					left++;
				}
				while(a[right] > a[pivot] && right >= lower)
				{
					right--;
				}
				if(left < right)
				{
					b = a[left];
					a[left] = a[right];
					a[right] = b;
				}
			}
			b = a[pivot];
			a[pivot] = a[right];
			a[right] = b;
			pivot = right;
			quickSort(a,lower,pivot-1);
			quickSort(a,pivot+1,upper);
		}
	}
}
