/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiff;

    private void maxDiffUtil(TreeNode root, TreeNode child) {
        if(root==null || child==null) return;

        maxDiff = Math.max(maxDiff, Math.abs(root.val - child.val));

        maxDiffUtil(root, child.left);
        maxDiffUtil(root, child.right);
    }

    private void findMaxDiff(TreeNode root) {
        if(root==null) return;

        maxDiffUtil(root, root.left);
        maxDiffUtil(root, root.right);

        findMaxDiff(root.left);
        findMaxDiff(root.right);
    }


    public int maxAncestorDiff(TreeNode root) {
        maxDiff = -1;
        findMaxDiff(root);
        return maxDiff;
    }
}