package com.Interview;

import java.util.Scanner;

public class StringRev2 {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		System.out.println(sb.toString());
	}

}
