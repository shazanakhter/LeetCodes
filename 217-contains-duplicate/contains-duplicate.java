class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        HashSet<Integer>hm=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.add(nums[i])){
                return true;
            }
        }
        return false;

    }
}