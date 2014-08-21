package com.bitmagic;

public class TurnOffBitAtPosition {

	public static void main(String[] args) {
		int n = 154;
		System.out.println(Integer.toBinaryString(n));
		System.out.println("Turning off bit at position 4");
		int m = ~(1<<3) & n;
		System.out.println(Integer.toBinaryString(m));
	}
}
