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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode node, int sum) {
        if(node == null) return sum;
        if(node.left != null) {
            if(node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            sum = sum(node.left, sum);
        }

        sum = sum(node.right, sum);

        return sum;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
