class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] answer= new int[n];
        Arrays.fill(answer,0);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0&&temperatures[st.peek()]<temperatures[i]){
                int temp=st.pop();
                answer[temp]=i-temp;
            }
            st.push(i);
        }
        return answer;
    }
}