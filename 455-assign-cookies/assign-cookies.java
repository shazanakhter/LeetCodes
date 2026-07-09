class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int left=0;
        int right=0;
        Arrays.sort(s);
        Arrays.sort(g);
        while(left<n&&right<m){
            if(g[left]<=s[right]){
                left++;
            }
            right++;
        }
        return left;
    }
}