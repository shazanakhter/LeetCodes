class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int val1=nums[0];
        int val2=Integer.MIN_VALUE;
        int count1=1;
        int count2=0;
        for(int i=1;i<nums.length;i++){
            if(val1==nums[i]){
                count1++;
            }else if(val2==nums[i]){
                count2++;
            }else if(count1==0){
                val1=nums[i];
                count1++;
            }else if(count2==0){
                val2=nums[i];
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val1){
                c1++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val2){
                c2++;
            }
        }
        if(c1>nums.length/3){
            ans.add(val1);
        }
        if(c2>nums.length/3){
            ans.add(val2);
        }
        return ans;
        
    }
}