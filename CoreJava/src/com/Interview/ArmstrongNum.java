package com.Interview;

public class ArmstrongNum {

	static void ArmstrongNumber(int number) {
		int cpnum = number;
		int noOfDigits = String.valueOf(cpnum).length();
		int sum = 0;
		while (cpnum != 0) {
			int lastDigit = cpnum % 10;
			int power = 1;

			for (int i = 0; i < noOfDigits; i++) {
				power = power * lastDigit;
			}
			sum = sum + power;
			cpnum = cpnum / 10;
		}
		if (sum == number) {
			System.out.println(number + " ia a ArmStrong Number");
		} else {
			System.out.println(number + " ia not a ArmStrong Number");
		}
	}

	public static void main(String[] args) {
		for (int i = 10; i <= 200; i++) {
			ArmstrongNumber(i);
		}
	}

}
