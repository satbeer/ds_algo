package com.bitmagic;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println("before swapping a="+ a + ",b=" + b);
		a = a^b;
		b = b^a;
		a = b^a;
		System.out.println("after swapping a="+ a + ",b=" + b);
	}
}
