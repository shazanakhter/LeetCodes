class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st= new Stack<>();
        Stack<Integer> count=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch){
                int temp=count.pop();
                temp+=1;
                count.push(temp);
                if(temp==k){
                    st.pop();
                    count.pop();
                }
            }else{
                st.push(ch);
                count.push(1);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            char ch=st.pop();
            int freq=count.pop();
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.reverse().toString();          
    }
}