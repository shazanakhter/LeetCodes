class Solution {
    public int nextGreaterElement(int n) {
        char[] number=(n+"").toCharArray();
        int idx=-1;
        for(int i=number.length-2;i>=0;i--){
            if(number[i]<number[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return -1;
        }
        int val=number[idx];
        int smallestindex=idx+1;
        for(int i=idx+1;i<number.length;i++){
            if(number[i]>val&&number[i]<=number[smallestindex]){
                smallestindex=i;
            }
        }
        char temp=number[smallestindex];
        number[smallestindex]=number[idx];
        number[idx]=temp;
        int start=idx+1;
        int end=number.length-1;
        while(start<end){
            char swap=number[start];
            number[start]=number[end];
            number[end]=swap;
            start++;
            end--;
        }
        long ans=Long.parseLong(new String(number));
        if(ans>Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)ans;
        }
    }
}