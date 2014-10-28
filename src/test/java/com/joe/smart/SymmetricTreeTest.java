package com.joe.smart;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by zouyanjian on 2014/10/28 0028.
 */
public class SymmetricTreeTest {

    @Test
    public void should_is_symmetric_Tree() {
	TreeNode root = createSymmetricTree();

	boolean result = TreeNode.isSymmetricTree(root);
	assertThat(result).isTrue();
    }
    @Test
    public void should_is_not_symmetric_Tree() {
	TreeNode root = createNotSymmetricTree();

	boolean result = TreeNode.isSymmetricTree(root);
	assertThat(result).isFalse();
    }


    private TreeNode createSymmetricTree() {
	TreeNode root = new TreeNode(1);
	TreeNode left = new TreeNode(2);
	TreeNode right = new TreeNode(2);
	root.addLeft(left);
	root.addRight(right);
	TreeNode left1 = new TreeNode(3);
	TreeNode right1 = new TreeNode(4);
	left.addLeft(left1);
	left.addRight(right1);
	TreeNode left2 = new TreeNode(4);
	TreeNode right2 = new TreeNode(3);
	right.addLeft(left2);
	right.addRight(right2);
	return root;
    }

    private TreeNode createNotSymmetricTree(){
	TreeNode root = new TreeNode(1);
	TreeNode left = new TreeNode(2);
	TreeNode right = new TreeNode(2);
	root.addLeft(left);
	root.addRight(right);

	TreeNode right1 = new TreeNode(3);
	left.addRight(right1);

	TreeNode right2 = new TreeNode(3);
	right.addRight(right2);

	return root;
    }
}
