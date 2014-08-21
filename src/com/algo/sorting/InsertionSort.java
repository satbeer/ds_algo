package com.algo.sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] a){
		for(int j=1; j<a.length; j++){
			int key = a[j];
			int i = j-1;
			while(i>=0 && a[i]>key){
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = SortUtils.createUnsortedArray(10);
		System.out.println(SortUtils.printArray(arr));
		insertionSort(arr);
		System.out.println(SortUtils.printArray(arr));
	}

}
