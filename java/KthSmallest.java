/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[2];
        inTraversal(root, k, result);
        return result[1];
    }

    public void inTraversal(TreeNode node, int k, int[] result) {
        if(node != null) {
            inTraversal(node.left, k, result);
            result[0] = result[0] + 1;
            if(result[0] == k) {
                result[1] = node.val;
            } else if(result[0] < k) {
                inTraversal(node.right, k, result);
            }
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
