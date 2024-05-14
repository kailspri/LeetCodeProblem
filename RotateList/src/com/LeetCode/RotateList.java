package com.LeetCode;

/*Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]*/
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
public class RotateList {
	public static void main(String[] args) {
		int k=2;
		ListNode head= new ListNode(1);
		ListNode one= new ListNode(2);
		ListNode two= new ListNode(3);
		ListNode three= new ListNode(4);
		ListNode four= new ListNode(5);
		
		head.next=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=null;
		
		printList(head);
		
		ListNode rotatedList= rotateRight(head, k);
		printList(rotatedList);
	}

	private static ListNode rotateRight(ListNode head, int k) {
		if(head==null || head.next==null||k==0)
			 return head;
		//calculate length 
		int length=1;
		ListNode current=head;
		while(current!=null) {
			current=current.next;
			length++;
		}
        // Calculate the actual rotation value
        k = k % length;
        if (k == 0) {
            return head;
        }
        
        // Connect the last node with the head to make it a circular linked list
        current.next = head;
        
        // Traverse (length - k) nodes to find the new head and the node before it
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        
        // Set the new head and break the connection before it
        ListNode newHead = current.next;
        current.next = null;
        
        return newHead;
	}

	private static ListNode rotateRight1(ListNode head, int k) {
		ListNode reverseHead=revserseList(head);
		System.out.println("After revesre");
		printList(reverseHead);
		return null;
	}

	private static ListNode revserseList(ListNode head) {
		ListNode curr=head;
		ListNode prev=null;
		while(curr!=null) {
			ListNode nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		head=prev;
		return head;
		
	}

	private static void printList(ListNode head) {
		ListNode trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}
		
	}

}
