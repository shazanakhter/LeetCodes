class Solution {
    int n;
    int dp[][][];
    public int solve(int[] piles, int person,int i, int M){
        //dp=new int[2][101][101];
        if(i>=n){
            return 0;
        }
        if(dp[person][i][M]!=-1){
            return dp[person][i][M];
        }
        int result=(person==1)?-1:Integer.MAX_VALUE;
        int stones=0;
        for(int x=1;x<=Math.min(2*M,n-i);x++){
            stones+=piles[i+x-1];
            if(person==1){
                result=Math.max(result,stones+solve(piles,0,i+x,Math.max(M,x)));
            }else{
                result=Math.min(result,solve(piles,1,i+x,Math.max(M,x)));
            }
        }
        return dp[person][i][M]=result;
    }
    public int stoneGameII(int[] piles) {
        n=piles.length;
        dp=new int[2][101][101];
        for(int i=0;i<2;i++){
            for(int j=0;j<101;j++){
                for(int k=0;k<101;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solve(piles,1,0,1);
    }
}