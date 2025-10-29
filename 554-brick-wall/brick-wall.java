class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(List<Integer> BigList:wall){
            int len=0;
            for(int i=0;i<BigList.size()-1;i++){
                len=len+BigList.get(i);
                map.put(len,map.getOrDefault(len,0)+1);
                ans=Math.max(ans,map.get(len));
            }
        }
        return wall.size()-ans;
    }
}