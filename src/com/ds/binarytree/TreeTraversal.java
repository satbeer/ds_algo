package com.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

	static void preOrder(TreeNode node){
		if(node== null)
			return;
		System.out.print(node.data + ",");
		
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	static void inOrder(TreeNode node){
		
		if(node== null)
			return;
		inOrder(node.left);
		System.out.print(node.data + ",");
		inOrder(node.right);
	}
	
	static void postOrder(TreeNode node){
		if(node== null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ",");
	}
	
	public static void main(String[] args) {
		TreeNode node = Treeutils.createTree();
		//preOrder(node);
		//inOrder(node);
		//postOrder(node);
		levelOrer(node);
	}
	
	public static void levelOrer(TreeNode node){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(node);
		TreeNode n;
		while(!q.isEmpty()){
			n = q.poll();
			System.out.print(n.data + ",");
			if(n.left != null)
				q.add(n.left);
			if(n.right != null)
				q.add(n.right);
		}
	}
}
