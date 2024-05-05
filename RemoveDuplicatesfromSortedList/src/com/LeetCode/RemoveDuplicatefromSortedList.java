package com.LeetCode;

class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val = val;
	}
	public Node() {
		this.val=val;
	}
}
public class RemoveDuplicatefromSortedList {
	Node head;
	
	public static void main(String[] args) {
		RemoveDuplicatefromSortedList List=new RemoveDuplicatefromSortedList();
		List.addLast(5);
		List.addLast(5);
		List.addLast(3);
		List.addLast(2);
		List.printList(List.head);
		Node newList= deleteDuplicates( List.head);
		System.out.println("*******");
		List.printList(newList);

	}

	private static Node deleteDuplicates(Node head) {	
		Node trav=head;
		while(trav!=null && trav.next!=null) {
			if(trav.val == trav.next.val) {
				trav.next=trav.next.next;
			}
			else
			trav=trav.next;
		}
		return head;
	}

	private void printList(Node head) {
		Node trav=this.head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
			
		}
		
	}

	private void addLast(int val) {
		Node newNode=new Node(val);
		if(this.head==null) {
			 head=newNode;
		}
		else {
			Node trav=this.head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newNode;
			newNode.next=null;
		}
	}

}
