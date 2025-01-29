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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        int level=1, maxLevel=1;
        while(!q.isEmpty()){
            int n=q.size();
            int currlevsum=0;
            for(int i=0;i<n;i++){
                TreeNode rem=q.poll();
                currlevsum+=rem.val;
                if(rem.left!=null){
                    q.add(rem.left);
                }
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
            if(currlevsum>max){
                max=currlevsum;
                maxLevel=level;
            }
            level++;
        }
        return maxLevel;
    }
}