class Solution {
    public String removeOuterParentheses(String s) {
        int start=0;
        StringBuilder sb=new StringBuilder();
        int openCount=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='('){
                openCount++;
            }else{
                openCount--;
            }
            if(openCount==0){
                sb.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return sb.toString();
    }
}