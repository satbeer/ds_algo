package com.ds.binarytree;

public class Treeutils {

	public static TreeNode createTree(){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		return root;
	}
	
	public static boolean isIdentical(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null)
			return true;
		
		if(root1 !=null && root2!=null){
			return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
		}
		return false;
	}
	
	public static int getTreeSize(TreeNode root){
		if(root == null){
			return 0;
		}
		else{
			return 1 + getTreeSize(root.left) + getTreeSize(root.right);
		}
			
	}
	
	public static int getMaxDepth(TreeNode root){
		
		if(root == null)
			return 0;
		
		int depthLeft = getMaxDepth(root.left);
		int depthRight = getMaxDepth(root.right);
		if(depthLeft > depthRight)
			return depthLeft + 1;
		else
			return depthRight + 1;
	}
	
	public static void printPaths(TreeNode root, int[] path, int pathlen){
		if(root == null)
			return;
		if(root != null){
			path[pathlen] = root.data;
			pathlen++;
		}
		if(root.left == null && root.right == null){
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i<pathlen; i++)
				builder.append(path[i]).append(">");
			System.out.println(builder.toString());
		}
		printPaths(root.left, path, pathlen);
		printPaths(root.right, path, pathlen);
		
	}
}
