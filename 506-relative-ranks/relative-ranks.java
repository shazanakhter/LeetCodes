class Solution {

    public static int findMax(int[] score){
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<score.length;i++){
            if(score[i]>maxVal){
                maxVal=score[i];
            }
        }
        return maxVal;
    }
    public String[] findRelativeRanks(int[] score) {
        int maxVal=findMax(score);
        int[] index=new int[maxVal+1];
        for(int i=0;i<score.length;i++){
            index[score[i]]=i+1;
        }
        String[] ans=new String[score.length];
        int rank=1;
        for(int i=maxVal;i>=0;i--){
            if(index[i]!=0){
                int originalIndex=index[i]-1;
                if(rank==1){
                    ans[originalIndex]="Gold Medal";
                }else if(rank==2){
                    ans[originalIndex]="Silver Medal";
                }else if(rank==3){
                    ans[originalIndex]="Bronze Medal";
                }else{
                    ans[originalIndex]=String.valueOf(rank);
                }
                rank++;
            }
            if(rank>score.length){
                break;
            }
        }
        return ans;
    }
}