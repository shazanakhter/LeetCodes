class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ans=k-nums[i];
            if(hm.getOrDefault(ans,0)>0){
                count++;
                hm.put(ans,hm.get(ans)-1);
            }else{
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}