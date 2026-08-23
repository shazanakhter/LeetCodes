class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int leftSum=0;
        int rightSum=0;
        int leftCount=0;
        int rightCount=0;
        for(int i=0;i<n;i++){
            if(num.charAt(i)=='?'){
                if(i<n/2){
                    leftCount++;
                }else{
                    rightCount++;
                }
            }else{
                if(i<n/2){
                    leftSum+=num.charAt(i)-'0';
                }else{
                    rightSum+=num.charAt(i)-'0';
                }
            }
        }
        if((leftCount+rightCount)%2!=0){
            return true;
        }
        int LEFT=2*leftSum+9*leftCount;
        int RIGHT=2*rightSum+9*rightCount;

        return !(LEFT==RIGHT);
    }
}