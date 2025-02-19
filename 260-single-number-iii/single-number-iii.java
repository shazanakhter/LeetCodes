class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        int v=0;
        for(int i=0;i<nums.length;i++){
            v=v^nums[i];
        }
        int idx=0;
        for(int i=0;i<32;i++){
            if((v&(1<<i))!=0){
                idx=i;
                break;
            }
        }
        int set1=0;
        int set2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&(1<<idx))==0){
                set1=set1^nums[i];
            }else{
                set2=set2^nums[i];
            }
        }
        ans[0]=set1;
        ans[1]=set2;

        return ans;
    }
}