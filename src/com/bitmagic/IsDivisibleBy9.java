package com.bitmagic;

/**
 * Concept  : http://www.geeksforgeeks.org/divisibility-9-using-bitwise-operators/
 * @author satbeer
 *
 */
public class IsDivisibleBy9 {

	public static void main(String[] args) {
		int n = 119234;
		System.out.println(isDivby9(n));
	}
	
	public static boolean isDivby9(int n){
		
		if(n ==0 || n==9)
			return true;
		
		if(n<9)
			return false;
		
		return isDivby9((int)(n>>3) - (int)(n&7));
	}
}
