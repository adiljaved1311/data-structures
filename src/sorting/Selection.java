package sorting;

public class Selection {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
		int temp = 0;

		System.out.print("Array Before Sorting : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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
