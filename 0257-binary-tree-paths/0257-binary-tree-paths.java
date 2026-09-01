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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        List<String> result = new ArrayList<>();
        dfs(root, result, path);
        return result;
    }

    private void dfs(TreeNode node, List<String> result, List<String> path) {
        if(node == null) return;
        path.add(String.valueOf(node.val));
        if(node.left == null && node.right == null) {
            result.add(String.join("->", path));
        } else {
            dfs(node.left, result, path);
            dfs(node.right, result, path);
        }
        path.remove(path.size()-1);
    }
}