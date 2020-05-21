package sorting;

public class Bucket {

	public static void main(String[] args) {
		int a[] = { 2, 5, 84, 256, 14, 28 };
		B.bucketSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

class B {
	public static void bucketSort(int a[]) {
		int buckets[][] = null;
		int bucketCount[] = null;
		int i, j, k, l;
		int div = 1, loopCount = 0, largestNum;

		largestNum = a[0];
		for (i = 1; i < a.length; i++) {
			if (a[i] > largestNum) {
				largestNum = a[i];
			}
		}
		// finding loop count for radix sort
		while (largestNum != 0) {
			loopCount++;
			largestNum = largestNum / 10;
		}
		// code to sort array using radix or bucket sort
		for (i = 1; i <= loopCount; i++) {
			// initialize counts of all buckets
			for (j = 0; j <= 9; j++) {
				k = (a[j] / div) % 10;
				buckets[k][bucketCount[k]] = a[j];
				bucketCount[k] = bucketCount[k] + 1;
			}
			// copying elements back from buckets into the array
			l = 0;
			for (j = 0; j <= 9; j++) {
				for (k = 0; k < bucketCount[j]; k++) {
					a[l] = buckets[j][k];
					l++;
				}
			}
			div = div * 10;
		}
	}
}
