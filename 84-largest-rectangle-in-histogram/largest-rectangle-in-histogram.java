class Solution {

    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ans=Integer.MIN_VALUE;
        int[] value1=nseRight(heights);
        int[] value2=nseLeft(heights);
        for(int i=0;i<n;i++){
            int x1=value1[i]-1;
            int x2=value2[i]+1;
            int width=x1-x2+1;
            int area=width*heights[i];
            ans=Math.max(ans,area);
        }
        return ans;
    }
    public int[] nseRight(int[] heights){
        int n=heights.length;
        int NSEonRight[]=new int[n];
        Stack<Integer> st=new Stack<>();
        Arrays.fill(NSEonRight,n);
        for(int i=0;i<n;i++ ){
            while(!st.isEmpty()&&heights[i]<heights[st.peek()]){
                int idx=st.pop();
                NSEonRight[idx]=i;
            }
            st.push(i);
        }
        return NSEonRight;
    }
    public int[] nseLeft(int[] heights){
        int n=heights.length;
        int NSEonLeft[]=new int[n];
        Stack<Integer> st=new Stack<>();
        Arrays.fill(NSEonLeft,-1);
        for(int i=n-1;i>=0;i-- ){
            while(!st.isEmpty()&&heights[i]<heights[st.peek()]){
                int idx=st.pop();
                NSEonLeft[idx]=i;
            }
            st.push(i);
        }
        return NSEonLeft;
    }
}