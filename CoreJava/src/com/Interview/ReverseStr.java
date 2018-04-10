package com.Interview;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		byte[] stringByteArray = str.getBytes();
		byte[] result = new byte[stringByteArray.length];
		for (int i = 0; i <= stringByteArray.length-1; i++) {
			result[i] = stringByteArray[stringByteArray.length - i - 1];
		}
		System.out.println(new String(result));
	}

}
