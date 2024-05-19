package com.LeetCode;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]
public class ReverseNodes_in_k_Group {
	public static void main(String[] args) {
		Node head =new Node(1);
		Node one =new Node(2);
		Node two =new Node(3);
		Node three =new Node(4);
		Node four =new Node(5);
		
		head.next=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=null;
		int k=2;
		
		Node reverseKHead=reverseKGroup( head,  k);
        printList(reverseKHead);
	}

	private static void printList(Node head) {
		Node trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}
		
		
	}

	private static Node reverseKGroup(Node head, int k) {
		Node prev=null;
		Node curr=head;
		Node next=null;
		int count =0;
		while(count<k && curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
			count++;
		}
		if(next!=null) {
			//visualize from the waterloo 
			//putting next to the head's next;
			head.next=reverseKGroup(next, k);
		}
		return prev;
	}

}
