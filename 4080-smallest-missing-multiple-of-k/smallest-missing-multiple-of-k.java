class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        for(int i=1;i<=101;i++){
            if(!set.contains(k*i)){
                ans=k*i;
                break;
            }
        }
        return ans;
    }
}