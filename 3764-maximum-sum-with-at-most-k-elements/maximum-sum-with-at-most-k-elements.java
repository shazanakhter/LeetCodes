class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        ArrayList<Long> arr=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
            int j=m-1;
            while(limits[i]>0){
                arr.add((long)grid[i][j]);
                j--;
                limits[i]--;
            }
        }
        Collections.sort(arr);
        long maxSum=0;
        int z=arr.size()-1;
        while(k>0){
            maxSum+=arr.get(z);
            z--;
            k--;
        }
        return maxSum;
    }
}