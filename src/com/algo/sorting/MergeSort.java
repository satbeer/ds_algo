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
	
	public static void merge(int[] A, int left, int mid,  int right ){
		int l1 = mid - left + 1;
		int l2 = right - mid;
		int[] L = new int[l1];
		int[] R = new int[l2];
		int i=0,j=0;
		for(; i<l1; i++){
			L[i] = A[left + i];
		}
		for(; j<l2; j++){
			R[j] = A[mid + j];
		}
		i=0;j=0;
		for(int k=left; k<right;){
			if(L[i] <= R[j]){
				A[k] = L[i];
				i++;k++;
			}else{
				A[k] = R[j];
				j++;k++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = SortUtils.createUnsortedArray(10);
		System.out.println(SortUtils.printArray(arr));
		mergeSort(arr, 0, arr.length);
		System.out.println(SortUtils.printArray(arr));
	}

}
