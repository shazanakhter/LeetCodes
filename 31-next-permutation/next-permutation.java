class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int j=nums.length-1;
        int index=-1;
        while(j>=1){
            if(nums[j]>nums[j-1]){
                index=j-1;
                break;
            }
            j--;
        }
        int left=0;
        int right=n-1;
        if(index==-1){
            while(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            return;
        }
        int smallIndex=-1;
        for(int i=n-1;i>=0;i--){
           if(nums[index]<nums[i]){
                smallIndex=i;
                break;
            }
        }
        int temp=nums[index];
        nums[index]=nums[smallIndex];
        nums[smallIndex]=temp;

        Arrays.sort(nums,index+1,n);
    
        
    }
}