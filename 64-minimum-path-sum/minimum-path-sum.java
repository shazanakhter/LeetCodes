class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(grid,m-1,n-1,dp);
    }
    public int helper(int[][]grid, int i,int j, int dp[][]){
        if(i<0||j<0) return (int)1e9;
        if(i==0&&j==0) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int a=helper(grid,i-1,j,dp);
        int b=helper(grid,i,j-1,dp);
        int ans=Math.min(a,b)+grid[i][j];
        dp[i][j]=ans;
        return ans;
    }
}