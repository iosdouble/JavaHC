package com.niuke.treedeep;

/**
 * com.niuke.treedeep
 * create by admin nihui
 * create time 2021/4/23
 * version 1.0
 **/
public class Test {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return 1 + Math.max(leftDepth, rightDepth);

        }
    }
}
