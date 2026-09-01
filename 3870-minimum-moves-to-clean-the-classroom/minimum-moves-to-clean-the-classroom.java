class Solution {
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};

    static class state{
        int row;
        int col;
        int energyLeft;
        int collectedMask;

        state(int row,int col,int energyLeft, int collectedMask){
            this.row=row;
            this.col=col;
            this.energyLeft=energyLeft;
            this.collectedMask=collectedMask;
        }
    }
    public int minMoves(String[] classroom, int energy) {
        int m=classroom.length;
        int n=classroom[0].length();
        int moves=0;
        int startRow=0;
        int startCol=0;
        int maxEnergy=energy;
        int[][] litterBit=new int[20][20];
        int litterCount=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                litterBit[i][j]=-1;
                if(classroom[i].charAt(j)=='S'){
                    startRow=i;
                    startCol=j;
                }else if(classroom[i].charAt(j)=='L'){
                    litterBit[i][j]=litterCount;
                    litterCount++;
                }
            }
        }
        int allCollected=(1<<litterCount)-1;
        if(litterCount==0){
            return 0;
        }
        boolean[][][][] seen=new boolean[m][n][maxEnergy+1][1<<litterCount];

        Queue<state>que=new LinkedList<>();
        que.add(new state(startRow,startCol,maxEnergy,0));
        seen[startRow][startCol][maxEnergy][0]=true;
        
        while(!que.isEmpty()){
            int currSize=que.size();
            while(currSize-- > 0){
                state curr=que.poll();
                if(curr.collectedMask==allCollected){
                    return moves;
                }
                if(curr.energyLeft==0) continue;

                for(int[] dir:dirs){
                    int nextRow=curr.row+dir[0];
                    int nextCol=curr.col+dir[1];
                    if(nextRow<0||nextRow>=m||nextCol<0||nextCol>=n) continue;

                    char cell=classroom[nextRow].charAt(nextCol);

                    if(cell=='X') continue;

                    int nextEnergy=curr.energyLeft-1;
                    int nextMask=curr.collectedMask;

                    if(cell=='R'){
                        nextEnergy=maxEnergy;
                    }else if(cell=='L'){
                        nextMask |=(1<<litterBit[nextRow][nextCol]);
                    }

                    if(!seen[nextRow][nextCol][nextEnergy][nextMask]){
                        seen[nextRow][nextCol][nextEnergy][nextMask]=true;
                        que.add(new state(nextRow,nextCol,nextEnergy,nextMask));
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}