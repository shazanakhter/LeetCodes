class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int decimal=0;
        for(int i=0;i<nums.length;i++){
            decimal=(decimal*2+nums[i])%5;
            ans.add(decimal==0);
        }
        return ans;
    }
}