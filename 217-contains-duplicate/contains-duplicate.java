class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans=false;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
                return true;
            }else{
                hm.put(nums[i],1);
            }
        }
        return false;

    }
}