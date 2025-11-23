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
    public int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
    public int height(TreeNode node){
        if(node==null) return -1;
        int leftheight=height(node.left);
        int rightheight=height(node.right);
        ans=Math.max(ans,leftheight+rightheight+2);
        return Math.max(leftheight,rightheight)+1;
    }
}