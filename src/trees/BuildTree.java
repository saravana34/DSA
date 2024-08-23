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


class BuildTree {
    int index;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode helper(int[] preorder, int[] inorder, int low, int high) {
        if(low > high) {
            return null;
        }
        int rootval = preorder[index];
        index++;
        TreeNode root = new TreeNode(rootval);
        int rootIndex = map.get(rootval);
        root.left = helper(preorder, inorder, low, rootIndex - 1);
        root.right = helper(preorder, inorder, rootIndex + 1, high);
        return root;
    }
}
