package com.LeetCode;
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
	  }
public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		

	}
	public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int LeftH=maxDepth(root.left);
        int Righth=maxDepth(root.right);
        return Math.max(LeftH,Righth)+1;
        
    }

}
