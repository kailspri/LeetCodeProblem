package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

class Node{
	int key;
	int value;
	Node prev;
	Node next;
	public Node(int key,int value) {
		this.key=key;
		this.value=value;
	}
}
public class LRUCache {
	Node head;
	Node tail;
	
	Map<Integer, Node> map=new HashMap<>();
	int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        //created dummy Node so that Insert delete will handle in b/w them.
        Node head=new Node(0, 0);
        Node tail=new Node(0, 0);
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key) {
    	Node node=map.get(key);
    	if(node==null) {
    		return -1;
    	}
    	//first remove that from that location
    	remove(node);
    	//insert at next to head 
    	insert(node);
        
    	return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
        	remove(map.get(key));
        }
        if(map.size()==capacity)
        	 remove(tail.prev);
        insert(new Node(key,value));
    }
    public void insert(Node node) {
    	map.put(node.key, node);
    	
//    	node.next = head.next;
//		head.next.prev = node;
//		node.prev = head;
//		head.next = node;
    	head.next.prev=node;
    	node.next=head.next;
    	node.prev=head;
    	head.next=node;
    	
    }
    public void remove(Node node) {
    	map.remove(node.key);
    	node.prev.next=node.next;
    	node.next.prev=node.prev;
    }
	
	
	public static void main(String[] args) {
		

	}

}
