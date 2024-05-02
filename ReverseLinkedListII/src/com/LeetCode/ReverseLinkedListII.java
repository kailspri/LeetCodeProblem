package com.LeetCode;
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]

class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
	}
}
public class ReverseLinkedListII {
	Node head;
	public static void main(String[] args) {
	ReverseLinkedListII r1=new ReverseLinkedListII();
	r1.add(5);
	r1.add(4);
	r1.add(3);
	r1.add(2);
	r1.add(1);
	r1.printList(r1.head);
	int left=2,right=4;
	Node head=reverseBetween( r1.head,  left,  right);
	System.out.println("After Reversing in between ");
	r1.printList(head);

	}
private void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
		
	}
private void add(int val) {
	Node newNode =new Node(val);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
public static Node reverseBetween(Node head, int left, int right) {
	Node dummy =new Node(0);
	dummy.next=head;
	Node prev=dummy;
	
	for(int i=0;i<left-1;i++) {
		prev=prev.next;
	}
	
	Node currNode=prev.next;
	Node nextNode;
	for(int i =0;i<right-left;i++) {
		nextNode=currNode.next;
		currNode.next=nextNode.next;
		nextNode.next=prev.next;
		prev.next=nextNode;
	}
       return dummy.next; 
    }
}
