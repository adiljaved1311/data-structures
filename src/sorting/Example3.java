package sorting;

public class Example3 {

	public static void main(String[] args)
	{
		int a[] = {0,1,2,0,2,1,2,1,0,1,0,0,0,2};
		int temp = 0;
		int j = a.length-1;
		int i = 0;
		
		while(i<=j) 
		{
			if(a[i] == 0 || a[j] == 2) 
			{
				i++;
				j--;
			}
			else if(a[i] > 0 ) 
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}
		}
		
		/*temp = 0;
		i = 0;
		j = a.length-1;
		
		while(i<j) 
		{
			if(a[i] == 0 || a[i] ==1) 
			{
				i++;
			}
			else if(a[i] > 1) 
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}
		}*/
		
		for(int x:a) 
		{
			System.out.print(x+" ");
		}
	}
}
