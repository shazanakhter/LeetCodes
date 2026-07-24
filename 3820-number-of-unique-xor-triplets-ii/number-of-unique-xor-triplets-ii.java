class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] pairXor=new boolean[2048];
        boolean[] tripletXor=new boolean[2048];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pairXor[nums[i]^nums[j]]=true;
            }
        }
        for(int i=0;i<2048;i++){
            if(pairXor[i]==true){
                for(int v:nums){
                    tripletXor[i^v]=true;
                }
            }
        }

        int count=0;
        for(int i=0;i<2048;i++){
            if(tripletXor[i]==true){
                count++;
            }
        }
        return count;
    }
}