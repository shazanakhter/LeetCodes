class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int count=0;
        for(int i=happiness.length-1;i>=0;i--){
            sum=sum+Math.max(happiness[i]-count,0);
            count++;
            if(count>=k) break;
        }
        return sum;
    }
}