package com.Interview;

public class DupInArray {

	public static void main(String[] args) {
		String[] a = { "abc", "def", "xyz", "ghi", "xaz", "def","abc"};
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i+1; j <= a.length-1; j++) {
				if (a[i].equals(a[j]) && (i != j))
					System.out.println("Duplicate element is:" + a[j]);
			}
		}
	}

}
