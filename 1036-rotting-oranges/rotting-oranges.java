class Solution {


    class Pair{
        int row;
        int col;
        int time;
        Pair(int row, int col, int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    count1++;
                }
                if(grid[i][j]==1){
                    count2++;
                }
            }
        }
        if(count2==0) return 0;
        if(count1==0) return -1;
        
        int ans=-1;
        while(q.size()>0){
            Pair rem=q.poll();
            int r=rem.row;;
            int c=rem.col;
            int t=rem.time;
            ans=t;

            if(r-1>=0&& grid[r-1][c]==1){
                q.add(new Pair(r-1,c,t+1));
                grid[r-1][c]=2;
            }
            if(c-1>=0&& grid[r][c-1]==1){
                q.add(new Pair(r,c-1,t+1));
                grid[r][c-1]=2;
            }
            if(r+1<n&& grid[r+1][c]==1){
                q.add(new Pair(r+1,c,t+1));
                grid[r+1][c]=2;
            }
            if(c+1<m&& grid[r][c+1]==1){
                q.add(new Pair(r,c+1,t+1));
                grid[r][c+1]=2;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
}