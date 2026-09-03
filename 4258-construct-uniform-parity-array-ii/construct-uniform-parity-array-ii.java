class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int minOdd=nums1[0];
        int evenCount=0;
        int oddCount=0;
        for(int num:nums1){
            if(num<minOdd){
                minOdd=num;
            }
            if(num%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(minOdd%2== 1){
            return true;
        }else{
            if(evenCount==n){
                return true;
            }
        }  
        return false;
    }
}