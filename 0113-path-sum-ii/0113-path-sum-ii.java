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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList();
        if(root!=null) traverse(root, targetSum, result, new ArrayList());
        return result;
    }

    private void traverse(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> current) {
        
        if(root == null) return;
        current.add(root.val);
        // Check if it's a leaf and the sum matches
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<>(current));
        } else {
            // Recurse on children with the remaining sum
            traverse(root.left, targetSum - root.val, result, current);
            traverse(root.right, targetSum - root.val, result, current);
        }

        current.remove(current.size()-1);

    }
}