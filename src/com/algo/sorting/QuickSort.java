package com.algo.sorting;

import java.util.Arrays;

public class QuickSort {
	
	
	
	public static int[] quickSort(int[] a){
		if(a.length <= 1)
			return a;
		int middle = a[a.length/2];
		int[] left = new int[a.length-1];
		int[] right = new int[a.length -1];
		
		int l=0,r=0;
		for(int i=0; i<a.length; i++){
			if(i != a.length/2){
				if(a[i] <= middle){
					left[l] = a[i];
					l++;
				}else{
					right[r] = a[i];
					r++;
				}	
			}
		}
		left = Arrays.copyOf(left, l);
		right = Arrays.copyOf(right, r);
		return concatenate(quickSort(left), middle, quickSort(right));
		
	}
	
	private static int[] concatenate(int[] left, int middle, int[] right){
		int [] result = new int[left.length + right.length +1];
		int k=0;
		for(int i=0; i<left.length; i++,k++)
			result[k] = left[i];
		
		result[k++] = middle;
		
		for(int i=0; i<right.length; i++,k++)
			result[k] = right[i];
		
		return result;
	}

	
	public static void main(String[] args) {
		int[] arr = SortUtils.createUnsortedArray(10);
		System.out.println(SortUtils.printArray(arr));
		arr = quickSort(arr);
		System.out.println(SortUtils.printArray(arr));
	}
}
