package com.algo.sorting;


public class MaxHeap {
	private static final int CAPACITY = 10;
	private int size = 0;
	private int[] arr = new int[CAPACITY];

	public void createHeap(int a[]) {
		if (a.length > CAPACITY-1)
			throw new IllegalArgumentException(
					"size of elements to be added should not be greater than capacity");
		arr[0] = -1;
		int k =0;
		for(; k<a.length;k++)
			arr[k+1] = a[k];
		size = k;
		for (int i = size/2; i>=1 ; i--) {
			maxHeapify(i);
		}
	}
	
	public int pop(){
		int element = arr[1];
		arr[1] = arr[size];
		arr[size] = 0;
		size--;
		maxHeapify(1);
		return element;
	}

	private void maxHeapify(int position) {
		int left = 2 * position;
		int right = 2 * position + 1;
		int largest = position;
		if (left <= size && arr[left] > arr[position])
			largest = left;

		if (right <= size && arr[right] > arr[largest])
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
		int[] arr = SortUtils.createUnsortedArray(9);
		System.out.println(SortUtils.printArray(arr));
		heap.createHeap(arr);
		System.out.println(SortUtils.printArray(heap.getHeapArray()));
		System.out.println("Popping an element from heap : " + heap.pop());
		System.out.println(SortUtils.printArray(heap.getHeapArray()));
	}
}
