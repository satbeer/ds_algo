package com.bitmagic;

public class BinaryPalindrome {

	
	public static void main(String[] args) {
		int i = 9;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(isPalinfrome(i));
	}
	

	public static boolean isPalinfrome(int a) {
		String s = Integer.toBinaryString(a);
		{//using a block to limit the scope of arr and i as for loop soent
			//support initialisation of different types of variable
			char[] arr = null;
			int begin = 0 , end = 0;
			for (arr = s.toCharArray(), begin = 0 ,end = arr.length -1; begin <= end; begin++, end--) {
				if(arr[begin] != arr[end])
					return false;
			}
		}
		return true;
	}
	public static boolean xorApproach(int a){
		//fails in case when there is leading zeros in (a & 0x0000FFFF) as leading zeros are ignored. and the actual length becomes less than 32
		int temp = (a & 0xFFFF0000) ^ ((a & 0x0000FFFF)<<16);
		System.out.println(Integer.toBinaryString(temp));
		return temp ==0;
	}
	public static int reverseBinary(int n){
		int reverse = 0;
		while(n !=0){
			reverse = reverse << 1 | n%2;
			n = n >> 1;
		}
		return reverse;
	}
}
