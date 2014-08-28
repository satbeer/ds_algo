package com.algo.arrays;

/**
 * Find the Minimum length Unsorted Subarray, sorting which makes the complete
 * array sorted
 * 
 * If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your
 * program should be able to find that the subarray lies between the indexes 3
 * and 8.
 * 
 * 1) Find the candidate unsorted subarray a) Scan from left to right and find
 * the first element which is greater than the next element. Let s be the index
 * of such an element. In the above example 1, s is 3 (index of 30). b) Scan
 * from right to left and find the first element (first in right to left order)
 * which is smaller than the next element (next in right to left order). Let e
 * be the index of such an element. In the above example 1, e is 7 (index of
 * 31).
 * 
 * 2) Check whether sorting the candidate unsorted subarray makes the complete
 * array sorted or not. If not, then include more elements in the subarray. a)
 * Find the minimum and maximum values in arr[s..e]. Let minimum and maximum
 * values be min and max. min and max for [30, 25, 40, 32, 31] are 25 and 40
 * respectively. b) Find the first element (if there is any) in arr[0..s-1]
 * which is greater than min, change s to index of this element. There is no
 * such element in above example 1. c) Find the last element (if there is any)
 * in arr[e+1..n-1] which is smaller than max, change e to index of this
 * element. In the above example 1, e is changed to 8 (index of 35)
 * 
 * 3) Print s and e.
 * 
 */

public class MinimumLengthUnsortedArray {

	public static void findMinLenthUnsortedArray(int a[]){
		//find the first element which is greater than next element
		int i=0;
		for(;i < a.length -1; i++){
			if(a[i] > a[i+1])
				break;
		}
		int s = i;
		if(s==a.length-1){
			System.out.println("Array is sorted");
			return;
		}
		
		
		//find the last element which is smaller than prev element
		int k=a.length-1;
		for(; k > 0 ; k--){
			if(a[k] < a[k-1])
				break;
		}
		
		int l = k;
		
		int min = a[s];
		int max = a[l];
		
		for(int j=s; j<=l; j++){
			if(a[j] < min)
				min = a[j];
			if(a[j] > max)
				max = a[j];
		}
		
		for(int m=0; m<s; m++){
			if(a[m] > min)
				s = m;
			
		for(m=l+1; m<a.length; m++)
			if(a[m] < max)
				l = m;
		
		System.out.println(s + ":" + l);
		}
		
	}

	public static void main(String[] args) {

		int[] a = new int[]{10,12,20,30,25,40,32,31,35,50,60};
		a = new int[]{1,2,3,4,5,7,6};
		findMinLenthUnsortedArray(a);
	}

}
