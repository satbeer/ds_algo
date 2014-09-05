package com.ds.binarytree;

public class PrintAncestors {
	
	static boolean printAncestors(TreeNode root, int data){
		if(root==null)
			return false;
		if(root.data == data)
			return true;
		if(printAncestors(root.left, data) || printAncestors(root.right, data))
		{
			System.out.print(root.data + ",");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		printAncestors(Treeutils.createTree(), 4);
	}

}
