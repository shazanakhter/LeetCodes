class Solution {
    public int numRookCaptures(char[][] board) {
        int x=0;
        int y=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        int ans=0;
        int[] [] dirs=new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
        for(int[] dir:dirs){
            for(int a=dir[0]+x, b=dir[1]+y; a<8 && a>=0 && b<8 && b>=0;a=a+dir[0] , b=b+dir[1]){
                if(board[a][b]=='p'){
                    ans++;
                }
                if(board[a][b]!='.'){
                    break;
                }
            }
        }
        return ans;

    }
}