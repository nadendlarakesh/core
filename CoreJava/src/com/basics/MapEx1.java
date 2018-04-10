package com.basics;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<Object, String> map = new HashMap<Object, String>();
		map.put("A", "Amit");
		map.put("B", "Vijay");
		map.put("C", "Rahul");
		map.put(new StringBuilder("D"), "Rahul");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
