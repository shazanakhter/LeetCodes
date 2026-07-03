class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        int start=2;
        while(start<arr.length){
            if(arr[start]-arr[start-1]!=diff){
                return false;
            }
            start++;
        }
        return true;
    }
}