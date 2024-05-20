package com.LeetCode;
class Node{
	int val;
	Node next;
	public Node() {
		
	}
	public Node(int val) {
		this.val=val;
	}
}
public class AddTwoNumbers {
//	Input: l1 = [2,4,3], l2 = [5,6,4]
//			Output: [7,0,8]
//			Explanation: 342 + 465 = 807.
	
	public static void main(String[] args) {
		Node head1=new Node(2);
		Node second=new Node(4);
		Node third=new Node(3);
		head1.next=second;
		second.next=third;
		
		Node head2=new Node(5);
		Node second2=new Node(6);
		Node third2=new Node(4);
		head2.next=second2;
		second2.next=third2;
		
	Node sum=addTwoNumbers(head1,head2);
	printList(sum);
		
		

	}

	private static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
		
	}																																		
	private static Node addTwoNumbers(Node l1, Node l2) {
		Node dummy=new Node();
		Node temp=dummy;
		int carry=0;
		while(l1!=null || l2!=null || carry!=0) {
			int sum=0;//every time two digit sum 
			if(l1!=null) {
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null) {
				sum+=l2.val;
				l2=l2.next;
			}
			sum+=carry;
			carry=sum/10;
			Node newNodetoStoreSum= new Node(sum%10);
			temp.next=newNodetoStoreSum;
			temp=temp.next;
		}
		return dummy.next;
	}

}
