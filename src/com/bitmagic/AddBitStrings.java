package com.bitmagic;
/**
 * Full Adder curcuit
 * x:1st bit, y:2nd bit, c: carry
 * Result = x^y^c
 * next carry =  x&y | y&c | c&x
 * @author satbeer
 *
 */

public class AddBitStrings {
	
	public static String add(String a, String b){
		StringBuilder result = new StringBuilder();
		if(a.length() > b.length()){
			b = addPaddding(b, a.length());
		}
		if(a.length() < b.length()){
			a = addPaddding(a, b.length());
		}
		System.out.println("adding a=" + a + "to b=" + b);
		
		int c = 0,sum,x,y; //carry
		for(int i =a.length() - 1; i>= 0; i--){
			x = a.charAt(i) - '0';
			y = b.charAt(i) - '0';
			sum = x^y^c + '0';
			result.insert(0, (char)sum);
			c = x&y | y&c | c&x;
		}
		if(c != 0){
			result.insert(0, (char)(c + '0'));
		}
		return result.toString();
	}
	
	public static String addPaddding(String s, int length){
		if(length <= s.length()) throw new AssertionError("Invalid paramenters");
		StringBuilder sb = new StringBuilder(s);
		while(sb.length() != length){
			sb.insert(0, '0');
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println("sum :" + add("10", "1100011"));
	}
	

}
