package com.LeetCode;
class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
	}
}
public class LinkedListCycleII {

	public static void main(String[] args) {
		Node head=new Node(1);
		Node Second=new Node(2);
		Node Third =new Node(3);
		Node Fourth =new Node(4);
		Node Fivth =new Node(5);
		head.next=Second;
		Second.next=Third;
		Third.next=Fourth;
		Fourth.next=Fivth;
		
		Fivth.next=Third;
		
		Node pos=detectCyclePos(head);
		System.out.println(pos.val);
		print(pos);
		
		
		

	}

	private static void print(Node head) {
		
		
	}

	private static Node detectCyclePos(Node head) {
		if(head==null || head.next==null)
			 return null;
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null ) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				//reset slow to the head;
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
		return null;
	}

}
