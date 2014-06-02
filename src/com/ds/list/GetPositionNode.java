package com.ds.list;

import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class GetPositionNode {
	public static void main(String[] args) {
		ListNode head = ListUtils.getlinkedList();
		//printNthNode(head, 4);
		ListUtils.printList(head);
		//printMiddleNode(head);
		NthNodeFromEnd(head, 5);
	}

	public static void printNthNode(ListNode head, int n) {
		int count = 1;
		if (n < 1 || n > ListUtils.length(head)) {
			System.out.println("index out of bounds");
			return;
		}
		while (count != n && head != null) {
			count++;
			head = head.next;
		}
		System.out.println(head.data);

	}
	
	public static void printMiddleNode(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
	
	public static void NthNodeFromEnd(ListNode head, int n){
		printNthNode(head, ListUtils.length(head) - n + 1);
	}
}
