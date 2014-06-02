package com.ds.elements;

public class ListNode {
	
	public int data;
	public ListNode next;
	
	public ListNode(int data, ListNode next){
		this.data = data;
		this.next = next;
	}
	
	public static class ListBuilder{
		private int data;
		private ListNode next= null;
		
		public ListBuilder(int data){
			this.data = data;
		}
		public ListBuilder next(ListNode next){
			this.next = next;
			return this;
		}
		
		public ListNode build(){
			return new ListNode(this);
		}
	}
	
	private ListNode(ListBuilder builder){
		data = builder.data;
		next = builder.next;
	}
}
