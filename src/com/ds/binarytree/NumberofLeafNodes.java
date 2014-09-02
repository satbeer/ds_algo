package com.ds.binarytree;


public class NumberofLeafNodes {

	public static int numLeafNodes(TreeNode node){
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		return numLeafNodes(node.left) + numLeafNodes(node.right);
	}
	
	public static void main(String[] args) {
		System.out.println(numLeafNodes(Treeutils.createTree()));
	}
}
