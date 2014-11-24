package com.ds.utils;

import com.ds.elements.ListNode;

public class ListUtils {

	public static ListNode getlinkedList() {
		ListNode head = new ListNode.ListBuilder(2).next(
				new ListNode.ListBuilder(4).next(
						new ListNode.ListBuilder(6).next(
								new ListNode.ListBuilder(7).next(
										new ListNode.ListBuilder(10).next(null).build())
										.build()).build()).build()).build();
		//node.next = head;
		return head;
	}

	public static void printList(ListNode head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.data).append(">");
			head = head.next;
		}
		System.out.println(sb.toString());
	}

	public static int length(ListNode head) {
		int len = 0;
		while (head != null && len <= Integer.MAX_VALUE) {
			len++;
			head = head.next;
		}
		return len;
	}
	
	public static ListNode getCircularLinkedList(){
		ListNode head = getlinkedList();
		ListNode temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;
		return head;
	}

}
