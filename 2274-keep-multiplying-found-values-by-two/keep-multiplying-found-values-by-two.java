class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int num=original;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        while(hm.containsKey(num)){
            if(hm.containsKey(num)){
                num=num*2;
            }
        }
        return num;
    }
}