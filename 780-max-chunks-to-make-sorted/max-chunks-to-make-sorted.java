class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxVal=Integer.MIN_VALUE;
        int chunks=0;
        for(int i=0;i<arr.length;i++){
            maxVal=Math.max(maxVal,arr[i]);
            if(maxVal==i){
                chunks++;
            }
        }
        return chunks;
    }
}