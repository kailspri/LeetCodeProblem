package com.LeetCode;
/*Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]*/
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
public class PartitionList {

	public static void main(String[] args) {
		int x=3;
		ListNode head= new ListNode(1);
		ListNode one= new ListNode(4);
		ListNode two= new ListNode(3);
		ListNode three= new ListNode(2);
		ListNode four= new ListNode(5);
		ListNode five= new ListNode(2);
		
		head.next=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=null;
		ListNode partionList=partition(head, x);
		printList(partionList);

	}

	private static ListNode partition(ListNode head, int x) {
		ListNode leftList=new ListNode(0);
		ListNode rightList=new ListNode(0);
		
		ListNode left_pointer=leftList;
		ListNode right_pointer=rightList;
		
		
		while(head!=null) {
			if(head.val<x) {
				left_pointer.next=head;
				left_pointer=left_pointer.next;
			}
			else {
				right_pointer.next=head;
				right_pointer=right_pointer.next;
			}
			head=head.next;
		}
		left_pointer.next=rightList.next;
		right_pointer.next=null;
		
		return leftList.next;
	}
	private static void printList(ListNode head) {
		ListNode trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}
	}
}
