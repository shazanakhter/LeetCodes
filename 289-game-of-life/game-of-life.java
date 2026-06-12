class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                int liveNeighbors=countLiveNeighbors(board,r,c,n,m);
                if(board[r][c]==1&& (liveNeighbors<2|| liveNeighbors>3)){
                    board[r][c]=-1;
                }else if(board[r][c]==0&& liveNeighbors==3){
                    board[r][c]=2;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=board[i][j]>0?1:0;
            }
        }
    }

    private int countLiveNeighbors(int [][] board, int r, int c, int n, int m){
        int count=0;
        for(int dr=-1;dr<2;dr++){
            for(int dc=-1;dc<2;dc++){
                if(dr==0&& dc==0) continue;
                int nr=r+dr;
                int nc=c+dc;
                if(nr>=0&&nr<m&&nc>=0&&nc<n&&Math.abs(board[nr][nc])==1){
                    count++;
                }
            }
        }
        return count;
    }
}