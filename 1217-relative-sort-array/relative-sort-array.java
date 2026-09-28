class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int[] ans=new int[n];
        int[] freq=new int[1001];

        for(int num:arr1){
            freq[num]++;
        }
        int start=0;
        for(int i=0;i<arr2.length;i++){
            while(freq[arr2[i]]>0){
                ans[start]=arr2[i];
                freq[arr2[i]]--;
                start++;
            }
        }
        for(int i=0;i<1001;i++){
            while(freq[i]>0){
                ans[start]=i;
                freq[i]--;
                start++;
            }
        }
        return ans;
    }
}