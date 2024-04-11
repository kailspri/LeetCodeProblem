package leetcode.com;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node() {
    }
}

public class MergeSortedLL {
    private Node head;

    public MergeSortedLL() {
        this.head = null;
    }

    private void addLast(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            newNode.next = null;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
            newNode.next = null;
        }
    }

    private void printList(Node head) {
        Node trav = head;
        while (trav != null) {
            System.out.println(trav.val);
            trav = trav.next;
        }
    }

    private Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node();
        Node trav = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                trav.next = l1;
                l1 = l1.next;
            } else {
                trav.next = l2;
                l2 = l2.next;
            }
            trav = trav.next;
        }

        if (l1 != null) {
            trav.next = l1;
        }
        if (l2 != null) {
            trav.next = l2;
        }

        return dummy.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node slow = head;
        Node fast = head;
 //this gives the middle of the linked list 
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(slow);
              

        return mergeTwoLists(left, right);
    }

    public static void main(String[] args) {
        MergeSortedLL m1 = new MergeSortedLL();
        m1.addLast(1);
        m1.addLast(5);
        m1.addLast(7);
        m1.addLast(3);
        System.out.println("List 1:");
        m1.printList(m1.head);

        MergeSortedLL m2 = new MergeSortedLL();
        m2.addLast(4);
        m2.addLast(2);
        m2.addLast(4);
        System.out.println("\nList 2:");
        m2.printList(m2.head);

        MergeSortedLL mergeSort = new MergeSortedLL();
        Node unsortedlist=mergeSort.mergeTwoLists(m1.head, m2.head);
        
        //Node mergedList = mergeSort.mergeSort(unsortedlist);
        mergeSort.printList(unsortedlist);
        System.out.println("\nMerged and Sorted List:");
        //mergeSort.printList(unsortedlist);
//        System.out.println("\nMerged and Sorted List:");
//        mergeSort.printList(mergedList);
    }
}
