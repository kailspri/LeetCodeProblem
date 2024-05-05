package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

class Node{
	int val;
	Node next;
	public Node(int val) {
     this.val=val;
}
}
//Input: head = [1,1,1,2,3]
//Output: [2,3]
public class RemoveDuplicatesfromSortedListII {

	public static void main(String[] args) {
		Node one =new Node(1);
		Node two =new Node(1);
		Node three =new Node(1);
		Node four =new Node(2);
		Node five=new Node(3);
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		printList(one);
		Node newhead= deleteDuplicates(one);
		System.out.println("*******");
		printList(newhead);

	}
 private static Node deleteDuplicates(Node head) {
	//use two pointers, slow - track the node before the dup nodes, 
     // fast - to find the last node of dups.
		Node dummy=new Node(0);
		Node fast=head;
		Node slow;
		slow=dummy;
		slow.next=fast;
		while(fast!=null) {
			while(fast.next!=null && fast.val==fast.next.val) {
				fast=fast.next;//while loop to find the last node of the dups.
			}
			if(slow.next!=fast) {  //duplicates detected.
				slow.next=fast.next;  //remove the dups
				fast=slow.next;  //reposition the fast pointer.
			}
			else {  //no dup, move down both pointer
				slow=slow.next;
				fast=fast.next;
			}
		}
		
		return dummy.next;
	}
	//Second approch using map to remove duplicate from list
	private static Node RemoveDuplicates(Node head) {
		Node trav=head;
		Map<Integer ,Integer> map=new HashMap<>();
		 // Count the frequency of each element
		while(trav!=null) {
			map.put(trav.val, map.getOrDefault(trav.val, 0)+1);
			trav=trav.next;
		}
		
		 // Remove nodes with frequency greater than 1
		Node dummy=new Node(0);
		dummy.next=head;
		trav=head;
		
		while( trav.next!=null) {
			if(map.get(trav.next.val)>1) {
				trav.next=trav.next.next;
			}
			else
			trav=trav.next;
		}
		System.out.println(map.toString());
		return dummy.next;
	}

	private static void printList(Node head) {
		Node trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}	
	}

}
