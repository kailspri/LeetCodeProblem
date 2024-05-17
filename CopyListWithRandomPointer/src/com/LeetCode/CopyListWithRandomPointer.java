package com.LeetCode;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		Node head =new Node(10);
		Node copyNode=copyRandomList( head);
	}

	private static Node copyRandomList(Node head) {
		Node curr=head;
		while(curr!=null) {// Create new list w/ same values
			Node newNode=new Node(curr.val);
			newNode.next=curr.next;
			curr.next=newNode;
			curr=newNode.next;
		}
		
		curr=head;//copy the random pointers
		while(curr!=null) {
			if (curr.random != null)
		        curr.next.random = curr.random.next;
			curr=curr.next.next;
		}
		curr=head;
		Node newHead=head.next;// Separate the two lists
		Node newCurr=newHead;
		while(curr!=null) {
			curr.next=newCurr.next;
			curr=curr.next;
			if(curr!=null) {
				newCurr.next=curr.next;
				newCurr=newCurr.next;
			}
		}
		return newHead;
	}

}
