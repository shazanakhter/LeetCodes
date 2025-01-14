class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String ans="";
        while(i<word1.length()&&j<word2.length()){
            ans=ans+word1.charAt(i);
            ans=ans+word2.charAt(j);
            i++;
            j++;
        }
        if(word1.length()>word2.length()){
            while(i<word1.length()){
                ans=ans+word1.charAt(i);
                i++;
            }
        }
        if(word1.length()<word2.length()){
            while(j<word2.length()){
                ans=ans+word2.charAt(j);
                j++;
            }
        }
        return ans;
    }
}