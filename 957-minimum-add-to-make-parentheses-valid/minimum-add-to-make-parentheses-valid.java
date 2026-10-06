class Solution {
    public int minAddToMakeValid(String s) {
        int openCount=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openCount++;
            }else{
                openCount--;
                if(openCount<0){
                    openCount=0;
                    ans++;
                }
            }
        }
        if(openCount>0){
            return openCount+ans;
        }else{
            return ans;
        }
    }
}