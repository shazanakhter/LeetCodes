class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int asteroid:asteroids){
            boolean destroy=false;
                while(!st.isEmpty()&&asteroid<0&&st.peek()>0){
                    if(Math.abs(st.peek())>Math.abs(asteroid)){
                        destroy=true;
                        break;
                    }else if(Math.abs(st.peek())==Math.abs(asteroid)){
                        destroy=true;
                        st.pop();
                        break;
                    }else{
                        st.pop();
                    }
                }
                if(!destroy){
                    st.push(asteroid);
                }
        }
        int[] ans=new int[st.size()];
        for(int k=st.size()-1;k>=0;k--){
            ans[k]=st.pop();
        }
        return ans;
    }
}