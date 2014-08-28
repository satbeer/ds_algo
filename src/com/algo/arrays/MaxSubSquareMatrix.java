package com.algo.arrays;

public class MaxSubSquareMatrix {
	
	public static void sizeOfMaxSubMatrixWith1(int a[][]){
		int[][] s = new int[a.length][a[0].length];
		for(int i=0; i<a[0].length; i++){
			s[0][i] = a[0][i];
		}
		for(int j=0; j<a.length; j++){
			s[j][0] = a[j][0];
		}
		
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[0].length; j++){
				if(a[i][j] == 1)
					s[i][j] = min(min(s[i-1][j], s[i][j-1]),s[i-1][j-1]) + 1;
				else
					s[i][j] = 0;
			}
		}
		
		print2DArray(s);
		
		
	}
	
	private static int min(int a, int b){
		return a<=b ? a : b;
	}
	
	public static void print2DArray(int[][] a){
		System.out.println(a.length);
		System.out.println(a[0].length);
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		//int[][] a = new int[][]{{0,1,1,0,1},{1,1,0,1,0},{0,1,1,1,0},{1,1,1,1,0},{1,1,1,1,1,1},{0,0,0,0,0}};
		int[][] a = new int[][]{{0,1,1,0,1},{1,1,0,1,0}};
		print2DArray(a);
		sizeOfMaxSubMatrixWith1(a);
		
	}
	

}
