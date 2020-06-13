package com.ds.binarytree;

public class SymmetryCheck {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
//	class Solution {
//	    public boolean isSymmetric(TreeNode root) {
//	        if(root == null) return true;
//	        boolean symm = true;
//	        Stack<Integer> left = new Stack<>();
//	        Stack<Integer> right = new Stack<>();
//	        TreeNode lr = null;
//	        TreeNode rr = null;
//	        if(root.left != null || root.right != null){
//	            if(root.left == null) return false;
//	            else {
//	                lr = root.left;
//	                left = getElements(lr, 1);
//	            }
//	            if(root.right == null) return false;
//	            else {
//	                rr = root.right;
//	                right = getElements(rr, 2);
//	            }
//	        } else return true;
//	    }
//	    
//	    public Stack<Integer> getElements(TreeNode root, int side){
//	        TreeNode curr = root;
//	        Stack<Integer> elements = new Stack<>();
//	        if(side == 1){
//	            while(curr != null || !elements.empty()){
//	                while(curr != null){
//	                    elements.push
//	                }
//	            }
//	        }
//	    }
//	}
}
