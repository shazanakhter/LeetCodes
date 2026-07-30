class Solution {

    class Pair{
        int row;
        int col;
        int dist;
        Pair(int row, int col, int dist){
            this.row=row;
            this.col=col;
            this.dist=dist;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 ||grid[n-1][n-1]==1) return -1;
        if(n==1) return 1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,1));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.row;
            int c=curr.col;
            int dist=curr.dist;

            if(r==n-1 && c==n-1) return dist;

            if(r-1>=0&& grid[r-1][c]!=1){
                q.add(new Pair(r-1,c,dist+1));
                grid[r-1][c]=1;
            }
            if(r+1<n&& grid[r+1][c]!=1){
                q.add(new Pair(r+1,c,dist+1));
                grid[r+1][c]=1;
            }
            if(c+1<n&& grid[r][c+1]!=1){
                q.add(new Pair(r,c+1,dist+1));
                grid[r][c+1]=1;
            }
            if(c-1>=0&& grid[r][c-1]!=1){
                q.add(new Pair(r,c-1,dist+1));
                grid[r][c-1]=1;
            }
            if(r+1<n&& c+1<n&& grid[r+1][c+1]!=1){
                q.add(new Pair(r+1,c+1,dist+1));
                grid[r+1][c+1]=1;
            }
            if(r+1<n&& c-1>=0&& grid[r+1][c-1]!=1){
                q.add(new Pair(r+1,c-1,dist+1));
                grid[r+1][c-1]=1;
            }
            if(r-1>=0&& c+1<n&& grid[r-1][c+1]!=1){
                q.add(new Pair(r-1,c+1,dist+1));
                grid[r-1][c+1]=1;
            }
            if(r-1>=0&& c-1>=0&& grid[r-1][c-1]!=1){
                q.add(new Pair(r-1,c-1,dist+1));
                grid[r-1][c-1]=1;
            }

        }
        return -1;
    }
}