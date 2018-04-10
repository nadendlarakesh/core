package com.Interview;

import java.util.HashSet;

public class DupInArrayHashSet {

	public static void main(String[] args) {
		String[] a = { "abc", "def", "xyz", "ghi", "xaz", "def", "abc" };
		HashSet<String> set = new HashSet<String>();
		for (String a1 : a) {
			if (!set.add(a1))
				System.out.println("Duplicate element is:" + a1);
		}
	}

}
