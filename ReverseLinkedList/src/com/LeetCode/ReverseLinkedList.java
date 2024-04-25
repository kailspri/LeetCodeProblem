package com.LeetCode;

class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
	}
}

public class ReverseLinkedList {
Node head;
	public static void main(String[] args) {
		ReverseLinkedList reveseList=new ReverseLinkedList();
		reveseList.add(5);
		reveseList.add(6);
		reveseList.add(7);
		reveseList.add(8);
		reveseList.printList(reveseList.head);
		Node reversehead=reveseList.reverseList(reveseList.head);
		reveseList.printList(reversehead);
		

	}

	private Node reverseList(Node head) {
		Node prev=null;
		Node curr=head;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
		
	}

	private void printList(Node head) {
		Node trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}
		
	}

	private void add(int val) {
		Node newNode=new Node(val);
		if(head==null){
			head=newNode;
			newNode.next=null;
		}
		else {
			Node trav=head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newNode;
			newNode.next=null;
		}
		
	}

}
