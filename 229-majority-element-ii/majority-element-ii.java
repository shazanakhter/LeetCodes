class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        int occ=nums.length/3;
        List<Integer> ans=new ArrayList<>();
        for(int key:hm.keySet()){
            if(hm.get(key)>occ){
                ans.add(key);
            }
        }
        return ans;
    }
}