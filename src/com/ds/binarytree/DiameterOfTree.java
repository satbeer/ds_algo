package com.ds.binarytree;

public class DiameterOfTree {
	
	//plain version O(n^2)
	static int diameter(TreeNode node){
		
		
		
		int rh=0,lh=0,rdia=0,ldia=0;
		
		rh = height(node.right);
		lh = height(node.left);
		
		rdia = diameter(node.right);
		ldia = diameter(node.left);
		
		return Math.max(rh+lh+1, Math.max(ldia, rdia));
		
	}
	
	static int height(TreeNode node){
		
		if(node==null)
			return 0;
		
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	//optimized version O(n)
	static int diameterOtimized(TreeNode node){
		return 0;
		
			
	}
	
	public static void main(String[] args) {
		System.out.println(diameter(Treeutils.createTree()));
	}

}
