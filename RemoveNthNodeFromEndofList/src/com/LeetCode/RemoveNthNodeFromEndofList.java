package com.LeetCode;
class  Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//Example 2:
//
//Input: head = [1], n = 1
//Output: []
//Example 3:
//
//Input: head = [1,2], n = 1
//Output: [1]
public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		Node one =new Node(1);
		Node two =new Node(2);
		Node three =new Node(3);
		Node four =new Node(4);
		Node five =new Node(5);
		
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		printList(one);
		int n=2;
		Node newList= removeNthFromEnd(one,n);
		printList(newList);
		
	}
private static void printList(Node head) {
		Node trav=head;
		while(trav!=null) {
			System.out.println(trav.val);
			trav=trav.next;
		}
		
	}
public static Node removeNthFromEnd(Node head, int n) {
     //take help of Dummy Node
	Node dummyNode= new Node(-1);
	dummyNode.next=head;
	
	Node firstPtr=dummyNode;
	Node secondPtr=dummyNode;
	
	//move secondPtr to n spaces ahead
	for(int i =0;i<n;i++) {
		secondPtr=secondPtr.next;
	}
	//move both now untill the secondPtr next in null now u will see that your nth node is next to firstPtr
	while(secondPtr.next!=null) {
		firstPtr=firstPtr.next;
		secondPtr=secondPtr.next;
	}
	firstPtr.next=firstPtr.next.next;
	
	
	return dummyNode.next;
    }

}
