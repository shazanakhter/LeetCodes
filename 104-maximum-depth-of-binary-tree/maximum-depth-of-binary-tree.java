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
    public int maxDepth(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null){
            return 0;
        }
        int count=0;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode rem=q.remove();
                temp.add(rem.val);
                if(rem.left!=null){
                    q.add(rem.left);
                }
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
            ans.add(temp);
            count++;
        }
        return count; 
    }
}