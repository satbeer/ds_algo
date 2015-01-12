package com.ds.utils;

import javax.print.attribute.standard.MediaSize.ISO;

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
	/**
	 * Reverses the list
	 * @param node
	 * @return
	 * @throws CloneNotSupportedException 
	 * 
	 */
	public static ListNode getReverse(ListNode node) throws CloneNotSupportedException
	{
		ListNode prev= null, next = null;
		ListNode current = (ListNode)node.clone();
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static ListNode reverseRecursive(ListNode node1, ListNode node2)
	{
		if(node2 == null)
		{
			return node1;
		}
		ListNode next = node2.next;
		node2.next = node1;
		return reverseRecursive(node2, next);
	}
	
	public static boolean areListsEqual(ListNode head1, ListNode head2)
	{
		if(head1 == null && head2 == null)
			return true;
		
		if(head1 == null && head2 != null || head1 != null && head2 == null)
			return false;
		boolean retval;
		if(head1.data == head2.data)
			retval =  true;
		else
			retval = false;
		return retval && areListsEqual(head1.next, head2.next);
		
	}
	
	public static boolean isListPalindrome(ListNode head) throws CloneNotSupportedException
	{
		ListNode slow = head;
		ListNode fast = head;
		ListNode prevSlow = null;
		boolean isListOddinSize = true;
		
		while(fast != null && fast.next != null)
		{
			prevSlow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast == null)
		{
			isListOddinSize = false;
		}
		ListNode head2 = null;
		if(isListOddinSize)
		{
			head2 = slow.next;
		}
		else
		{
			head2 = slow;
		}
		prevSlow.next = null;
		ListNode reverseHead2 = getReverse(head2);
		boolean isPlanindrome = areListsEqual(head, reverseHead2);
		if(isListOddinSize)
		{
			prevSlow.next = slow;
		}
		else
		{
			prevSlow.next = head2;
		}
		return isPlanindrome;
		
	}
	
	public static void printReverseRecursive(ListNode head)
	{
		if(head == null)
		{
			return;
		}
		printReverseRecursive(head.next);

		System.out.println(head.data);
	}

	public static ListNode mergeSortedLists(ListNode node1, ListNode node2)
	{
		ListNode result = null;
		
		if(node1 == null)
			return node2;
		else if(node2 == null)
			return node1;
		
		if(node1.data <= node2.data)
		{
			result = node1;
			result.next = mergeSortedLists(node1.next, node2);
		}
		else
		{
			result = node2;
			result.next = mergeSortedLists(node1, node2.next);
		}
		return result;
		
	}
}
