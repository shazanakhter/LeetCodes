class Solution {
    public int minimumCost(int[] nums) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int i=1;i<nums.length;i++){
        pq.add(nums[i]);
      }
      int ans=nums[0];
      for(int i=0;i<2;i++){
        ans+=pq.poll();
      }
      return ans;  
    }
}