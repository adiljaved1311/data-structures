package searching;
import java.util.Scanner;
import java.io.*;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos = -1;
		int a[] = { 2, 4, 6, 8, 10, 12, 15, 16, 17, 18 };
		int num;
		System.out.println("Enter a Number to Search");
		num = sc.nextInt();
		int lower = 0;
		int upper = a.length - 1;
		int mid = 0;

		if (num <= a[a.length - 1] && num >= a[0]) {
			while (lower <= upper) {
				mid = (lower + upper) / 2;
				if (a[mid] == num) {
					pos = mid;
					System.out.println("No. Found at index: " + pos);
					break;
				} else if (num < a[mid]) {
					upper = mid - 1;
				} else {
					lower = mid + 1;
				}
			}
		}
		if (pos == -1) {
			System.out.println("No. not Found");
		}

	}

}
