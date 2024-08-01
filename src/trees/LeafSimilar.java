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
class LeafSimilar {
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        func(root1, t1);
        func(root2, t2);
        if(t1.size() != t2.size()) {
            return false;
        }
        return t1.equals(t2);
    }
    public void func(TreeNode root, List<Integer> ans) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            ans.add(root.val);
        }
        func(root.left, ans);
        func(root.right, ans);
    }
}
