package com.ds.list;


import com.ds.elements.ListNode;
import com.ds.utils.ListUtils;

public class MergeSort {

  private static ListNode head = null;
  private static ListNode newHead = null;

  public static void main(String[] args) {
    head = ListUtils.getlinkedList();
    ListUtils.printList(head);
    mergeSort(head);
  }

  public static void mergeSort(ListNode node) {
    ListNode head1 = null;
    ListNode head2 = null;
    if (node == null || node.next == null) {
      return;
    }
    /*
     * Logic to break the list into two halves
     */
    ListNode slow = node;
    ListNode fast = node;
    if (node == null || node.next == null) {
      head1 = node;
      head2 = null;
      return;
    }
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    head1 = node;
    head2 = slow.next;
    slow.next = null;
    /***********************************************************/
    ListUtils.printList(head1);
    ListUtils.printList(head2);

    if (head1.next != null) {
      mergeSort(head1);
    }
    if (head2.next != null) {
      mergeSort(head2);
    }
    newHead = mergeList(newHead, head1);
    newHead = mergeList(newHead, head2);
    ListUtils.printList(newHead);
    /* Logic to merge the sorted elements */
    
    
    /**************************************************************/
  }
  
  public static ListNode mergeList(ListNode head1, ListNode head2){
    ListNode head = new ListNode(-1, null);
    ListNode next = head;
    while(!(head1 == null && head2 == null)){
      if(head1 == null){
        next.next = new ListNode(head2.data, null);
        next = next.next;
        head2 = head2.next;
        continue;
      }

      if(head2 == null){
        next.next = new ListNode(head1.data, null);
        next = next.next;
        head1 = head1.next;
        continue;
      }
      if(head1.data >= head2.data){
        next.next = new ListNode(head2.data, null);
        next = next.next;
        head2 = head2.next;
      }
      else{
        next.next = new ListNode(head1.data, null);
        next = next.next;
        head1 = head1.next;
      }
    }
    //ListUtils.printList(head);
    return head.next;
  
  }
}
