class Solution {
    public int firstMissingPositive(int[] nums) {
      /*  int i=0;
        while(i<nums.length){
            if(nums[i]<1||nums[i]>nums.length||i==nums[i]-1){
                i++;
            }else{
                int index=nums[i]-1;
                if(nums[i]==nums[index]){
                    i++;
                }
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                return k+1;
            }
        }
        return nums.length+1;*/
        int n = nums.length;

        int i =0;
        while(i<n){
            if(nums[i] == i+1||nums[i] <= 0 || nums[i] > n){
                i++;
                continue;
            }
            int idx1 = i;
            int idx2 = nums[i] - 1;

            if(nums[idx1] == nums[idx2]){
                i++;
                continue;
            }
            int temp = nums[idx1];
            nums[idx1] = nums[idx2];
            nums[idx2] = temp; 

        }

        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }

        return n+1;

    }
}