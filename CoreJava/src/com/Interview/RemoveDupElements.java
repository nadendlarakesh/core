package com.Interview;

import java.util.Arrays;

public class RemoveDupElements {

	static void removeDup(int[] arrayWithDuplicates) {
		System.out.println("\n Array with duplicates: ");
		for (int i = 0; i <= arrayWithDuplicates.length - 1; i++) {
			System.out.print(arrayWithDuplicates[i] + "\t");
		}

		int noOfUniqueElemnts = arrayWithDuplicates.length;
		for (int i = 0; i <= noOfUniqueElemnts-1; i++) {
			for (int j = i + 1; j <= noOfUniqueElemnts-1; j++) {
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElemnts - 1];
					noOfUniqueElemnts--;
					j--;
				}
			}
		}

		int[] arrayWithOutDup = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElemnts);
		System.out.println("\n Array without duplicates:");
		for (int i = 0; i <= arrayWithOutDup.length-1; i++) {
			System.out.print(arrayWithOutDup[i] + "\t");
		}
	}

	public static void main(String[] args) {
		removeDup(new int[] { 2, 3, 4, 2, 5, 6, 7 });
		removeDup(new int[] { 5, 3, 6, 7, 4, 5, 2, 8, 6, 7, 9, 12, 34, 1 });

	}

}
