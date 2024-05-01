package com.LeetCode;

class Node{
	int val;
	Node left;
	Node right;
}

public class SameTree {
    Node root;
    
    public boolean isSameTree(Node p, Node q) {
        if(p==null || q==null)
          return p==q;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
		SameTree same =new SameTree();
		
	}
}
