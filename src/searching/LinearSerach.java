package searching;

import java.util.Scanner;

import java.io.*;

public class LinearSerach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 2, 5, 7, 8, 1, 6, 9, 1 };
		int num;
		System.out.println("Enter a Number to Search");
		num = sc.nextInt();
		int pos = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				pos = i;
				System.out.println("Number Found at index no. " + pos);
				break;
			}
		}
		if (pos == -1) {
			System.out.println("Number not Found in given Array List");
		}
		sc.close();
	}

}
