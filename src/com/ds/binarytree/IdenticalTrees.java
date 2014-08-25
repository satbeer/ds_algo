package com.ds.binarytree;

public class IdenticalTrees {

	public static boolean isIdentical(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null)
			return true;
		
		if(root1 !=null && root2!=null){
			return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isIdentical(Treeutils.createTree(), Treeutils.createTree()));
		System.out.println(isIdentical(Treeutils.createTree(), null));
		System.out.println(Treeutils.getMaxDepth(Treeutils.createTree()));
		int[] paths = new int[10];
		Treeutils.printPaths(Treeutils.createTree(), paths, 0);
	}
	
}
