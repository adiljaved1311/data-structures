package sorting;

public class Example2 {

	public static void main(String[] args) {
		int a[] = { 1, 0, 5, 4, 6, 7, 3, 2, 9, 8, 10 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] != i) {
				a[i] = i;
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}

	}

}
