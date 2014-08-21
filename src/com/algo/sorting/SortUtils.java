package com.algo.sorting;

import java.util.Random;

public class SortUtils {

	private static Random rand = new Random();
	public static String printArray(int[] a){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a.length; i++){
			sb.append(a[i]).append(",");
		}
		return sb.toString();
	}
	
	public static int[] createUnsortedArray(int size){
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}
}
