package com.Interview;

import java.util.Scanner;

public class UitlityEx {
	
		
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			Integer.parseInt(input);
			System.out.println("This is a number");
		} catch (NumberFormatException e) {
			System.out.println("This is not a number");
		}
	}
}
