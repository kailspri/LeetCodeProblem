package leetcode.com;
//class Node{
//	int data;
//	Node next;
//	public Node(int data) {
//		this.data = data;
//	}
//	
//}

public class Test {
	Node head;
	

	public static void main(String[] args) {
		Test t1= new Test();
		t1.add(5);
		t1.add(4);
		t1.add(3);
		t1.add(7);
		t1.printList(t1.head);
		System.out.println("2nd List ");
		Test t2= new Test();
		t2.add(1);
		t2.add(2);
		t2.add(6);
		t2.add(8);
		t2.printList(t2.head);
		
	Test combineList=new Test();
	Node mergeList=combineList.mergeList(t1.head,t2.head);
	System.out.println("Unsorted Merge  List ");
	//combineList.printList(mergeList);
	
	Node sortedList=combineList.mergeSortList(mergeList);
	combineList.printList(sortedList);

	}


	private Node mergeSortList(Node head) {
		 if (head == null || head.next == null) {
	            return head;
	        }
        Node prev=null;
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null) {
        	prev=slow;
        	slow=slow.next;
        	fast=fast.next.next;
        }
		System.out.println("middle valye is "+slow.val);
		
		prev.next=null;
		
		Node left=mergeSortList(head);
		Node right=mergeSortList(slow);
		
		return mergeList(left, right);
	}


	private Node mergeList(Node list1, Node list2) {
		Node newNode =new Node();
		Node trav=newNode;
		while(list1!=null & list2 !=null) {
			if(list1.val<list2.val) {
				trav.next=list1;
				list1=list1.next;
			}
			else {
				trav.next=list2;
				list2=list2.next;
			}
			trav=trav.next;
		}
		if(list1!=null) {
			trav.next=list1;
		}
		if(list2!=null) {
			trav.next=list2;
		}
		
		
		return newNode.next;
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
		if(head==null) {
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
