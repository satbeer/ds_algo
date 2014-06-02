package com.ds.list;

import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class ListReversal {
	ListNode head = null;
	public static void main(String[] args) {
		ListNode head = ListUtils.getlinkedList();
		//head = reverseList(head);
		ListUtils.printList(head);
		//reverseByRecursion(head);
	}
	
	public static ListNode reverseList(ListNode head){
		ListNode prev = head;
		ListNode node = head.next;
		while(node != null){
			ListNode ret = node.next;
			node.next = prev;
			prev = node;
			node = ret;
		}
		head.next = null;
		return prev;
	}
	
	public static void reverseByRecursion(ListNode node, ListNode next){
		if(next.next != null){
			reverseByRecursion(node.next, next.next);
		}
		next.next = node;
	}

}
