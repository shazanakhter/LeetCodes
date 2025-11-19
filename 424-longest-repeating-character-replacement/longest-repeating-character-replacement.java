class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int left=0;
        int maxFreq=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Math.max(maxFreq,hm.get(s.charAt(right)));
            while(((right-left+1)-maxFreq)>k){
                char lc= s.charAt(left);
                hm.put(lc,hm.get(lc)-1);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}