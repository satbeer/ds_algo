package com.ds.list;
import java.util.HashSet;

import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		ListNode head = ListUtils.getlinkedList();
		ListUtils.printList(head);
		removeDuplicates(head);
		ListUtils.printList(head);
	}
	
	public static void removeDuplicates(ListNode head){
		HashSet<Integer> set = new HashSet<Integer>();
		ListNode prev = null;
		while(head != null){
			if(set.contains(head.data)){
				prev.next = head.next;
			}else{
				set.add(head.data);
				prev = head;
			}
			head = head.next;
		}
		//ListUtils.printList(head);
	}
}
