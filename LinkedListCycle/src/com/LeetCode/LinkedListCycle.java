package com.LeetCode;
class Node{
	 int val;
	 Node next;
	 Node(int val){
		 this.val=val;
	 }
}
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, 
//where the tail connects to the 1st node (0-indexed).
public class LinkedListCycle {

	public static void main(String[] args) {
	Node head=new Node(3);
	Node one=new Node(2);
	Node two=new Node(0);
	Node three=new Node(-4);
	
	head.next=one;
	one.next=two;
	two.next=three;
	three.next=one;
	
	//printList(head); infinite loop
	
	boolean hascycle=hasCycle(head);
	System.out.println(hascycle);
	

	}

	private static boolean hasCycle(Node head) {
		 if(head==null || head.next==null)
	           return false;
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}

	private static void printList(Node head) {
		Node trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}
		
	}

}
