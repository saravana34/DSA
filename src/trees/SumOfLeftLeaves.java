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
class SumOfLeftLeaves {
    int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        // Your code  
         func(root);
         return count;
    }
    public void func(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left != null && root.left.left == null && root.left.right == null) {
            count += root.left.val;
        }
        func(root.left);
        func(root.right);
    }
}
