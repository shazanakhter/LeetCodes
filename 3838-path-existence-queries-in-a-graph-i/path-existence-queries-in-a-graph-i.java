class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] components=new int[n];
        int compId=0;
        boolean ans[]=new boolean[queries.length];
        components[0]=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                compId++;
            }
            components[i]=compId;
        }
        for(int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
            if(components[u]==components[v]){
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }
        return ans;
    }
}