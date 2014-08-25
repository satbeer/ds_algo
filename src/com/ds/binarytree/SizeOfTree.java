package com.ds.binarytree;

public class SizeOfTree {
	
	public int getTreeSize(TreeNode root){
		if(root == null){
			return 0;
		}
		else{
			return 1 + getTreeSize(root.left) + getTreeSize(root.right);
		}
			
	}
	
	
	public static void main(String[] args) {
		SizeOfTree s = new SizeOfTree();
		System.out.println(s.getTreeSize(Treeutils.createTree()));
	}
}
