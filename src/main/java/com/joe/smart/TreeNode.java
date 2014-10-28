package com.joe.smart;

import java.util.Stack;

/**
 * Created by zouyanjian on 2014/10/28 0028.
 */
public class TreeNode {
    int val;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int val){
	this.val = val;
    }
    public int getVal() {
	return val;
    }

    public void setVal(int val) {
	this.val = val;
    }

    public void addLeft(TreeNode left) {
	this.left = left;
    }

    public void addRight(TreeNode right) {
	this.right = right;
    }

    public static boolean isSymmetricTree(TreeNode root) {
	if (root == null) return true;
	Stack<TreeNode> stack = new Stack<TreeNode>();
	stack.push(root.left);
	stack.push(root.right);
	while(!stack.isEmpty()){
	    TreeNode right = stack.pop();
	    TreeNode left = stack.pop();
	    if(right == null && left ==null) continue;
	    if(right == null || left == null) return false;
	    if(right.val != left.val) return false;
	    stack.push(right.left);
	    stack.push(left.right);
	    stack.push(right.right);
	    stack.push(left.left);
	}
	return true;
//	isSymmetricTree(root.left,root.right);
    }

    //递归.
    public static boolean isSymmetricTree(TreeNode left, TreeNode right) {
	if(left == null && right == null) return true;
	if(left == null || right == null) return false;

	return (left.val == right.val && isSymmetricTree(left.left,right.right) && isSymmetricTree(left.right,right.left));
    }

}
