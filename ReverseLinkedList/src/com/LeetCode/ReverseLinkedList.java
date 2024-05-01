package com.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
		
		//Using stack reverse 
		Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        Node rHead=reverseListUsingStack(head);
		System.out.println("ReverseList Using Stack ***************");
		reveseList.printList(rHead);
        
		//detect Loop using Map timeComplexity on(n*2lognn)
        Node head1 = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head1.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        
        
        boolean loop=detectLoop(head1);
        System.out.println("Loop exit ?"+loop);
        
		
		
		
		reveseList.printList(reveseList.head);
		Node reversehead=reveseList.reverseList(reveseList.head);
		System.out.println("ReverseList ***************");
		reveseList.printList(reversehead);
		
		

	}

	private static boolean detectLoop(Node head) {
		Node temp=head;
		Map<Node, Integer >map =new HashMap<>();
		
		while(temp!=null) {
		
			if(map.containsKey(temp)) {
				 return true;
				
			}
				
			map.put(temp, 1);
			temp=temp.next;
		}
		return false;
	}

	private static Node reverseListUsingStack(Node head) {
	Node temp=head;
	Stack<Integer> stack =new Stack<>();
	while(temp!=null) {
		stack.push(temp.val);
		temp=temp.next;
	}
	temp=head;//reset the temp  var to head;
	while(temp!=null) {
		temp.val=stack.pop();
		temp=temp.next;
	}
		return head;
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
