package com.ds.utils;

import com.ds.elements.ListNode;

public class ListUtils {

	public static ListNode getlinkedList() {
		ListNode node = new ListNode(6, null);
		ListNode head = new ListNode.ListBuilder(1).next(
				new ListNode.ListBuilder(6).next(
						new ListNode.ListBuilder(6).next(
								new ListNode.ListBuilder(6).next(
										new ListNode.ListBuilder(1).next(node).build())
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

}
