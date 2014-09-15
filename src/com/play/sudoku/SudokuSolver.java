package com.play.sudoku;

public class SudokuSolver {
	
	private final static int N = 4;
	protected int[][] grid = {{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1}};

	public static void main(String[] args) {
		SudokuSolver ss = new SudokuSolver();
		ss.printSudokuBox(ss.grid);
	}
	
	public boolean solveSudoku(){
		
		if(!hasUnassignedCell()){
			return true;
		}
		
		for(int row=0; row<N; row++){
			for(int col=0; col<N; col++){
				if(grid[row][col] == -1){
					
					
					for(int k=1; k<=N; k++){
						if(isSafe(k, row, col)){
							grid[row][col] = k;
						}
						if(solveSudoku()){
							return true;
						}
						grid[row][col] = -1;
					}
				}
			}
		}
		return false;
	}
	
	private boolean hasUnassignedCell(){
		for(int m=0 ;m<N; m++){
			for(int n=0; n<N; n++){
				if(grid[m][n] == -1)
					return true;
			}
		}
		return false;
	}
	
	private boolean isSafe(int val, int row, int col){
		return isRowSafe(val, row) && isColumnSafe(val, col) && isBoxSafe(val, row, col);
	}
	
	private boolean isRowSafe(int val, int row){
		for(int i=0; i<N; i++){
			if(grid[row][i] == val)
				return false;
		}
		return true;
	}
	
	private boolean isColumnSafe(int val, int col){
		for(int i=0; i<N; i++){
			if(grid[i][col] == val)
				return false;
		}
		return true;
	}
	
	private boolean isBoxSafe(int val, int row, int col){
		int boxSize = (int)Math.sqrt(N);
		int boxStartRow = (row/boxSize) * boxSize;
		int boxStartCol = (col/boxSize) * boxSize;
		for(int i=boxStartRow; i < boxStartRow+boxSize; i++){
			for(int j=boxStartCol; j<boxStartCol+boxSize; j++){
				if(grid[i][j] == val)
					return false;
			}
		}
		return true;
	}
	
	public void printSudokuBox(int [][] grid){
		StringBuffer sb = new StringBuffer();
		for(int m=0 ;m<N; m++){
			for(int n=0; n<N; n++){
				sb.append(grid[m][n]).append("\t");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
