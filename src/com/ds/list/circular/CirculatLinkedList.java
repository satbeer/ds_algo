package com.ds.list.circular;

import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class CirculatLinkedList {
	
	private ListNode _head = null;
	
	public CirculatLinkedList(ListNode head) 
	{
		this._head = head;
	}
	void printCLL(ListNode head)
	{
		StringBuilder sb = new StringBuilder();
		ListNode temp = head;
		if(temp != null){
			do{
				sb.append(temp.data).append(">");
				temp = temp.next;
			}while(temp != head);
		}
		System.out.println(sb.toString());
	}
	
	void printCLL()
	{
		StringBuilder sb = new StringBuilder();
		ListNode temp = _head;
		if(temp != null){
			do{
				sb.append(temp.data).append(">");
				temp = temp.next;
			}while(temp != _head);
		}
		System.out.println(sb.toString());
	}
	/**
	 * Split circular linked list into two halves.
	 * Use tortoise and hare algorithm to find midpoints.
	 * @param head
	 */
	void splitCLLinHalves(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		if(head != null && head.next != null){
			boolean flag = true;
			do{
				slow = slow.next;
				fast = fast.next.next;
				if(fast == head || fast.next == head){
					flag = false;
				}
			}while(flag);
		}
		ListNode head1 = head;
		ListNode head2 = slow.next;
		slow.next = head1;
		fast.next = head2;
		printCLL(head1);
		printCLL(head2);
	}
	
	//inserts a value in correct position in a sorted circular list
	public void insert(ListNode node)
	{
		//case 1 : when the list is empty
		if(_head == null)
		{
			_head = node;
			return;
		}
		
		//case 2 : When the val to be inserted in smallest in the list
		ListNode temp = _head;
		while(temp.next != _head)
		{
			temp = temp.next;
		}
		ListNode last = temp;
		
		if(node.data <= _head.data)
		{
			node.next = _head;
			_head = node;
			last.next = _head;
			return;
		}
		
		//case 3: when the val to be inserted is largest
		if(node.data >= last.data)
		{
			last.next = node;
			node.next = _head;
			return;
		}
		
		// case 4 : when the val to be inserted is between two nodes
		temp = _head;
		while(temp.next != _head && temp.next.data <= node.data)
		{
			temp = temp.next;
		}
		ListNode right = temp.next;
		temp.next = node;
		node.next = right;
	}
	
	public static void main(String[] args) {
		CirculatLinkedList cll = new CirculatLinkedList(ListUtils.getCircularLinkedList());
		cll.printCLL();
		cll.insert(new ListNode(14, null));
		cll.printCLL();
		//cll.printCLL(ListUtils.getCircularLinkedList());
		//cll.splitCLLinHalves(ListUtils.getCircularLinkedList());
		
	}

}
