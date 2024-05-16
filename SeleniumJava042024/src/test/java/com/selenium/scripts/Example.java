package com.selenium.scripts;

public class Example {

	private static int test() {
		return (true ? null:0);
	}
	public static void main(String[] args) {
		System.out.println(test());
	}

}
