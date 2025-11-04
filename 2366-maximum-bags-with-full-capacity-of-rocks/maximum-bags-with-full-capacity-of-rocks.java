class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] need= new int[capacity.length];
        for(int i=0;i<rocks.length;i++){
            need[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        int count=0;
        for(int i=0;i<need.length;i++){
            if(need[i]==0){
                count++;
            }else if(need[i]<=additionalRocks){
                additionalRocks=additionalRocks-need[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}