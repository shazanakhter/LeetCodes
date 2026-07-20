class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
       // for(int i=0;i<m;i++){
          //  result.add(new ArrayList<>());
        //}
        k=k%(m*n);
        int[] nums=new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int idx=(i*n)+j;
                nums[idx]=grid[i][j];
            }
        }
        reverse(nums,0,(m*n)-1);
        reverse(nums,0,k-1);
        reverse(nums,k,(m*n)-1);

        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(nums[(i*n)+j]);
            }
            result.add(row);
        }
        return result;
    }

    /*public int reverse(int[][] grid, int start, int k){
        while(start<end){
            int temp=grid[start%grid.length][start/grid.length];
            grid[start%grid.length][start/grid.length]=grid[end%grid.length][end/grid.length];
            grid[end%grid.length][end/grid.length]=temp;
            start++;
            end--;
        }

    }*/
    public int[] reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}