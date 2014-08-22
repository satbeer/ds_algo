package com.algo.sorting;

import java.util.Arrays;

public class MaxHeap {
	private static final int CAPACITY = 10;
	private int size = 0;
	private int[] arr = new int[CAPACITY];

	public void createHeap(int a[]) {
		if (a.length > CAPACITY)
			throw new IllegalArgumentException(
					"size of elements to be added should not be greater than capacity");
		arr = Arrays.copyOf(a, a.length);
		size = arr.length;
		for (int i = arr.length/2; i>=1 ; i--) {
			maxHeapify(i);
		}
	}

	private void maxHeapify(int position) {
		int left = 2 * position;
		int right = 2 * position + 1;
		int largest = position;
		if (left <= size && arr[left] > arr[position])
			largest = left;

		if (right <= size && arr[right] > arr[position])
			largest = right;
		if (largest != position) {
			swapValuesaAtIndices(position, largest);
			maxHeapify(largest);
		}

	}

	private void swapValuesaAtIndices(int pos1, int pos2){
		int tmp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = tmp;
	}
	
	public int[] getHeapArray(){
		return arr;
	}
	
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap();
		int[] arr = SortUtils.createUnsortedArray(8);
		System.out.println(SortUtils.printArray(arr));
		heap.createHeap(arr);
		System.out.println(SortUtils.printArray(heap.getHeapArray()));
	}
}
