class Solution {
    public int firstMatchingIndex(String s) {
        int start=0;
        while(start<s.length()){
            if(s.charAt(start)==s.charAt(s.length()-start-1)){
                return start;
            }
            start++;
        }
        return -1;
    }
}