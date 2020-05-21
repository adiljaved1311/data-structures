package sorting;

public class Bubble {

	public static void main(String[] args) {
		int a[] = {1,2,4,8,0,1,12,15,24,16 };
		int temp = 0;

		System.out.print("Array Before Sorting : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Array After Sorting  : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
