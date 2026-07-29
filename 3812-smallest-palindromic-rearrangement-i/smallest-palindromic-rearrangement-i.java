class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int[] freq=new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        char[] ans=new char[s.length()];
        int left=0;
        int right=s.length()-1;
        int middle=s.length()/2;
        for(int i=0;i<26;i++){
            while(freq[i]>=2){
                ans[left]=(char)('a'+i);
                ans[right]=(char)('a'+i);
                left++;
                right--;
                freq[i]=freq[i]-2;
            }
            if(freq[i]==1){
                ans[middle]=(char)('a'+i);
                freq[i]--;
            }
            
        }
        return new String(ans);
    }
}