class Solution {
    public int minLengthAfterRemovals(String s) {
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count1++;
            }else{
                count2++;
            }
        }
        return Math.abs(count1-count2);
    }
}