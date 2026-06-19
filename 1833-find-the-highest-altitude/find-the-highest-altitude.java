class Solution {
    public int largestAltitude(int[] gain) {
        int psum[]= new int[gain.length+1];
        psum[0]=0;
        int max=0;
        for(int i=1;i<psum.length;i++){
            psum[i]=psum[i-1]+gain[i-1];
            if(psum[i]>max){
                max=psum[i];
            }
        }
        return max;

    }
}