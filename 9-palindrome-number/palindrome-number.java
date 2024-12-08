class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        boolean ans=false;;
        int temp=x;
        int ans1=0;
        int rem=0;
        int que=0;
        while(temp>0){
            rem=temp%10;
            ans1=ans1*10+rem;
            temp=temp/10;
        }
        if(ans1==x){
            ans=true;
            return ans;
            }
        return ans; 
    }
   
}