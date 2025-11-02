class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Set<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            set.add(i);
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}