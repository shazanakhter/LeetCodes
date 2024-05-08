class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] count=new int[score.length];
        int n=score.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(score[i]<score[j]){
                    count[i]=count[i]+1;
                }
            }
        }
        String [] ans=new String[n];
        for(int i=0;i<n;i++){
            if(count[i]==0){
                ans[i]="Gold Medal";
            }else if(count[i]==1){
                ans[i]="Silver Medal";
            } else if(count[i]==2){
                ans[i]="Bronze Medal";
            }else if(count[i]>2){
                ans[i]=String.valueOf(count[i]+1);
            }
        }
        return ans;
    }
}