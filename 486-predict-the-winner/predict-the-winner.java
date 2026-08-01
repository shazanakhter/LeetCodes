class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int totalScore=0;
        for(int score:nums){
            totalScore+=score;
        }
        int player1_score=solve(0,n-1,nums);
        int player2_score=totalScore-player1_score;

        return player1_score>=player2_score;
    }

    public int solve(int i, int j,int[] nums){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int scorei=nums[i]+Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int scorej=nums[j]+Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));

        return Math.max(scorei,scorej);
    }
}