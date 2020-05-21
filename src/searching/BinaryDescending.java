package searching;

public class BinaryDescending {

	public static void main(String[] args) {
		int a[] = { 10, 8, 7, 4, 3, 1 };
		int pos = -1;
		int lower = 0;
		int upper = a.length - 1;
		int mid = 0;
		int num = 3;

		if (num <= a[0] && num >= a[a.length - 1]) {
			while (lower <= upper) {
				mid = (lower + upper) / 2;
				if (num == a[mid]) {
					pos = mid;
					System.out.println("No Foud at index : " + pos);
					break;
				} else if (num >= a[mid]) {
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
