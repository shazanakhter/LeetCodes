class Solution {
    public int[] findBuildings(int[] heights) {
        int n=heights.length;
        int maxHeight=heights[n-1];
        List<Integer> ans=new ArrayList<>();
        ans.add(n-1);
        for(int i=n-2;i>=0;i--){
            if(heights[i]>maxHeight){
                ans.add(i);
                maxHeight=heights[i];
            }
        }
        Collections.reverse(ans);
        int size=ans.size();
        int[] result=new int[size];
        for(int i=0;i<size;i++){
            result[i]=ans.get(i);
            
        }

        return result;
    }
}