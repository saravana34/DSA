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
class CountNodes {
    List<Integer> ans = new ArrayList<>();
    public int countNodes(TreeNode root) {
        postorder(root);
        return ans.size();
    }
    public void postorder(TreeNode root) {
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        ans.add(root.val);
    }
}
