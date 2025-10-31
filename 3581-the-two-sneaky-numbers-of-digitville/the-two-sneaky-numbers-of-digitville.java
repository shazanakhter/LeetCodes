class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.getOrDefault(nums[i],0)>1){
                ans[count]=nums[i];
                count++;
            }
        }
        return ans;

    }
}