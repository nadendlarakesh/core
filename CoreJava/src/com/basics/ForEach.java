package com.basics;

public class ForEach {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		for(int i:a){
			System.out.println(i);
			if(i==30)
				break;
		}
	}

}
