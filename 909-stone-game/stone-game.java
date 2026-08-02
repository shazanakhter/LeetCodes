class Solution {
    int t[][]=new int [501][501];
    public boolean stoneGame(int[] piles) {
        int totalPoint=0;
        for(int pile:piles){
            totalPoint+=pile;
        }
        for(int [] row:t){
            Arrays.fill(row,-1);
        }
        
        int Alice=stonePoint(piles,0,piles.length-1);
        int bob=totalPoint-Alice;

        return Alice>bob;
    }

    public int stonePoint(int[] piles, int i, int j){
        if(i>j) return 0;
        if(t[i][j]!=-1) return t[i][j];
        int stonei=Math.min(stonePoint(piles,i+2,j),stonePoint(piles,i+1,j-1))+piles[i];
        int stonej=Math.min(stonePoint(piles,i,j-2),stonePoint(piles,i+1,j-1))+piles[j];

        return t[i][j]=Math.max(stonei,stonej);
    }
}