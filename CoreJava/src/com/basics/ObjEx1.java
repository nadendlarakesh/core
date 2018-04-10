package com.basics;

public class ObjEx1 {
	int id;
	String name;

	public ObjEx1() {
		super();
	}

	public ObjEx1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setValues(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + "------" + name);
	}

	public static void main(String[] args) {
		ObjEx1 o1 = new ObjEx1();
		o1.id = 1;
		o1.name = "A";
		o1.display();
		System.out.println(o1.id + "------" + o1.name);
		o1.setValues(2, "B");
		o1.display();
		System.out.println(o1.id + "------" + o1.name);
		ObjEx1 o2 = new ObjEx1(3, "C");
		o2.display();
	}

}
