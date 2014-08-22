import javax.swing.text.Position;

import com.algo.sorting.MaxHeap;
import com.algo.sorting.SortUtils;


public class MinHeap {

	private int size;
	private int[] arr;
	
	private final int CAPACITY = 10;
	
	MinHeap(){
		arr = new int[CAPACITY];
		arr[0] = -1;
		size = 0;
	}
	
	public void createHeap(int a[]) {
		if (a.length > CAPACITY-1)
			throw new IllegalArgumentException(
					"size of elements to be added should not be greater than capacity");
		int k =0;
		for(; k<a.length;k++)
			arr[k+1] = a[k];
		size = k;
		for (int i = size/2; i >= 1 ; i--) {
			minHeapify(i);
		}
	}
	
	public int pop(){
		int element = arr[1];
		arr[1] = arr[size];
		arr[size] = 0;
		size--;
		minHeapify(1);
		return element;
	}
	
	private void minHeapify(int pos){
		int left = pos*2;
		int right = pos*2 + 1;
		int minimum = pos;
		if(left <= size && arr[left] < arr[pos])
			minimum = left;
		if(right <= size && arr[right] < arr[minimum])
			minimum = right;
		
		if(minimum != pos){
			swapValuesaAtIndices(pos, minimum);
			minHeapify(minimum);
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
		MinHeap heap = new MinHeap();
		int[] arr = SortUtils.createUnsortedArray(9);
		System.out.println(SortUtils.printArray(arr));
		heap.createHeap(arr);
		System.out.println(SortUtils.printArray(heap.getHeapArray()));
		System.out.println("Popping an element from heap : " + heap.pop());
		System.out.println(SortUtils.printArray(heap.getHeapArray()));
	}
	
}
