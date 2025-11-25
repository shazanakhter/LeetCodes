class Solution {
    public boolean isSubsequence(String s, String t) {
        int start=0;
        int i=0;
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        while(start<t.length()&&i<s.length()){
            if(s.charAt(i)==t.charAt(start)){
                i++;
            }
            start++;
        }
        if(i==s.length()){
            return true;
        }else{
            return false;
        }
    }
}