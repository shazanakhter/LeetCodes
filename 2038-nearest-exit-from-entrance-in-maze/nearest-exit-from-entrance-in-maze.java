class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m=maze.length;
        int n=maze[0].length;
        boolean vis[][]=new boolean[m][n];
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{entrance[0],entrance[1]});
        int level=0;
        vis[entrance[0]][entrance[1]]=true;
        int[][] dirs=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            level++;
            int size=q.size();
            while(size-->0){
                int[] curr=q.poll();
                for(int dir[]:dirs){
                    int newR=dir[0]+curr[0];
                    int newC=dir[1]+curr[1];
                    if(newR>=0&&newC>=0&&newR<m&&newC<n&&maze[newR][newC]=='.'&&vis[newR][newC]!=true){
                        if(newR==0||newC==0||newR==m-1||newC==n-1){
                            return level;
                        }
                        vis[newR][newC]=true;
                        q.offer(new int[]{newR,newC});
                    }
                }
            }
            
        }
        return -1;
    }
}