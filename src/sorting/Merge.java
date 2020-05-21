package sorting;

public class Merge {

	public static void main(String[] args) {
		int a[] = {2,5,12,87,32,10,45};
		int l=0;
		int u=a.length-1;
		M.mergeSort(a, l, u);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

class M{
	public static int b[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	public static void mergeSort(int a[], int lower, int upper)
	{
		int left,right,i,mid;
		if(lower<upper)
		{
			mid = (upper+lower)/2;
			mergeSort(a,lower,mid);
			mergeSort(a,mid+1,upper);
			left = lower;
			i=lower;
			right = mid+1;
			while(left<=mid && right<=upper) 
			{
				if(a[left]<= a[right])
				{
					b[i] = a[left];
					left++;
				}
				else 
				{
					b[i] = a[right];
					right++;
				}
				i++;
			}
			if(left>mid) 
			{
				while(right<=upper)
				{
					b[i] = a[right];
					right++;
					i++;
				}
			}
			else if(right>upper) 
			{
				while(left<=mid) 
				{
					b[i] = a[left];
					left++;
					i++;
				}
			}
			for(i=lower;i<=upper;i++) 
			{
				a[i]=b[i];
			}
		}
	}
}
