class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans=false;
        
        for(int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix[i].length-1;
            while(left<=right){
                int mid=(right-left)/2+left;
                if(target==matrix[i][mid]){
                    return true;
                }else if(target>matrix[i][mid]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            
        }
        return false;
    }
}