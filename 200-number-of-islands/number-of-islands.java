class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null|| grid.length==0) return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        int islands=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1'){
                    islands++;
                    bfs(grid,r,c,dir);
                }
            }
        }
        return islands;
    }

    private void bfs(char[][] grid, int r, int c, int[][] dir){
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{r,c});
        grid[r][c]='0';
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];

            for(int[] dirs:dir){
                int newRow=row+dirs[0];
                int newCol=col+dirs[1];
                if(newRow>=0&&newRow<grid.length&&newCol>=0&&newCol<grid[0].length&&grid[newRow][newCol]=='1'){
                    q.offer(new int[]{newRow,newCol});
                    grid[newRow][newCol]='0';
                }
            }
        }
    }


}