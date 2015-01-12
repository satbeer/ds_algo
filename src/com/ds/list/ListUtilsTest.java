package com.ds.list;

import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class ListUtilsTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ListNode head = ListUtils.getlinkedList();
		ListUtils.printList(head);
		
		ListNode reverse = ListUtils.getReverse(head);
		ListUtils.printList(reverse);
		ListNode temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = reverse;
		ListUtils.printList(head);
		
		System.out.println(ListUtils.isListPalindrome(head));
		ListUtils.printList(head);
		ListUtils.printReverseRecursive(reverse);
		ListNode list1 = ListUtils.getlinkedList();
		ListNode list2 = ListUtils.getlinkedList();
		ListUtils.printList(list1);
		ListUtils.printList(list2);
		ListUtils.printList(ListUtils.mergeSortedLists(list1, list2));
	}

}
