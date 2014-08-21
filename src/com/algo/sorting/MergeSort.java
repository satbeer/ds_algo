package com.algo.sorting;

public class MergeSort {
	
	public static void mergeSort(int[] A, int left, int right){
		
		if(right > left){
			int mid = (left + right)/2;
			mergeSort(A, left, mid);
			mergeSort(A, mid +1 , right);
			merge(A, left, mid, right);
		}
	}
	/**
	 * Merging two arrays A[left..mid] and A[mid+1..right] (left,right inclusive)
	 * First we create two sorted arrays L and R and then merge them and store in A between left and right(both inclusive)
	 */
	public static void merge(int[] A, int left, int mid,  int right ){
		int l1 = mid - left + 1;
		int l2 = right - mid;
		int[] L = new int[l1]; //the left array
		int[] R = new int[l2]; //the right array
		int i=0,j=0;
		for(; i<l1; i++){
			L[i] = A[left + i];
		}
		for(; j<l2; j++){
			R[j] = A[mid + 1 + j];
		}
		i=0;j=0;
		for(int k=left; k<=right;k++){
			if (i == l1) {
				A[k] = R[j];
				j++;
				continue;
			}
			if(j == l2){
				A[k] = L[i];
				i++;
				continue;
			}
			if(L[i] <= R[j]){
				A[k] = L[i];
				i++;;
			}else{
				A[k] = R[j];
				j++;;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = SortUtils.createUnsortedArray(19);
		System.out.println(SortUtils.printArray(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println(SortUtils.printArray(arr));
	}

}
