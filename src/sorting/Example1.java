package sorting;

public class Example1 {

	public static void main(String[] args) 
	{
		int a[] = { 1, 0, 1, 0, 0 };
		int temp = 0;
		int j = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] == 0) 
			{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j++;
			}
		}
		for (int k = 0; k < a.length; k++) 
		{
			System.out.print(a[k] + " ");
		}
	}
}
