class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        /*Arrays.sort(arr);
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])>1){
                arr[i]=arr[i-1]+1;
            }else{
                continue;
            }
        }
        return arr[arr.length-1];*/
        int[] freq=new int[arr.length+1];
        for(int a:arr){
            int idx=Math.min(a,arr.length);
            freq[idx]++;
        }
        int ans=1;
        for(int i=2;i<freq.length;i++){
           int curr=ans+freq[i];
           ans=Math.min(curr,i);
        }

        return ans;
    }
}