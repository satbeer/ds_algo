package com.ds.list;

import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class LoopInList {

	public static void main(String[] args) {
		ListNode head = ListUtils.getlinkedList();
		//ListUtils.printList(head);
		System.out.println(detectLoop(head));
	}

	public static boolean detectLoop(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}
