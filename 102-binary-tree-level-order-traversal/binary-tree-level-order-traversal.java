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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
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
        }
        return ans;
    }
}