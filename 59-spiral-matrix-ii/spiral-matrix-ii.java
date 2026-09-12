class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans=new int[n][n];

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int count=1;
        while(left<=right&&top<=bottom){
            for(int j=left;j<=right;j++){
                ans[top][j]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=count++;
            }
            right--;
            for(int j=right;j>=left;j--){
                ans[bottom][j]=count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                ans[i][left]=count++;
            }
            left++;
        }
        return ans;
    }
}