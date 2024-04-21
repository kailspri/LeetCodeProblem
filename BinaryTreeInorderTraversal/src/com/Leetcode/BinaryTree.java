package com.Leetcode;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode (int val){
		this.val=val;
	}
	
}
public class BinaryTree {
	int index=-1;
	public static void main(String[] args) {
		int[] nodes = {1,2,3,-1,-1,4,-1,-1,5,6,-1,7,8,-1,9,-1,-1,-1,-1};
		BinaryTree tree=new BinaryTree();
		TreeNode root=tree.buildTree(nodes);
		System.out.println("\nPreOrder.....");
		tree.preOrder(root);
		System.out.println("\nPostOrder.....");
		tree.postOrder(root);
		System.out.println("\nInOrder.....");
		tree.inOrder(root);
	}

	private void inOrder(TreeNode root) {
		if(root==null)
			 return;
		inOrder(root.left);
		System.out.println(root.val);
		inOrder(root.right);
	}

	private void postOrder(TreeNode root) {
	 if(root==null)
		  return;
	 postOrder(root.left);
	 postOrder(root.right);
	 System.out.println(root.val);
		
	}

	private void preOrder(TreeNode root) {
		if(root==null)
			 return;
		System.out.println(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}

	private TreeNode buildTree(int[] nodes) {
		index++;
		if(nodes[index]==-1)
			 return null;
		TreeNode root=new TreeNode(nodes[index]);
		System.out.println("Inseting Left node "+nodes[index]);
		root.left=buildTree(nodes);
		System.out.println("Inseting right node "+nodes[index]);
		root.right=buildTree(nodes);
		return root;
	}

}
