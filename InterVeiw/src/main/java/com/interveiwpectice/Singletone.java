package com.interveiwpectice;

public class Singletone {

	public static void main(String[] args) {
		Abc obj = Abc.getInstance();
		Abc obj1 = Abc.getInstance();
	}

}

class Abc {
	private Abc() {

	}

	static Abc obj = new Abc();

	public static Abc getInstance() {
		return obj;

	}
}
