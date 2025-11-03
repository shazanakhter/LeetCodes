class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalcost=0;
        int n=colors.length();
        char cArray[]= colors.toCharArray();
        int prev=0, curr=1;

        while(curr<n){
            if(cArray[prev]==cArray[curr]){
                totalcost=totalcost+Math.min(neededTime[curr],neededTime[prev]);
                if(neededTime[prev]<neededTime[curr]){
                    prev=curr;
                }
            }else{
                prev=curr;
            }
            curr=curr+1; 
        }
        return totalcost;
    }    
}