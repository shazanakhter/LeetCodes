class Solution {
    public int longestValidParentheses(String s) {
        int maxL=0;
        if(s==null || s.length()<2){
            return 0;
        }
        Deque<Integer>st=new ArrayDeque<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxL=Math.max(maxL,i-st.peek());
                }
            }
        }
        return maxL;
    }
}