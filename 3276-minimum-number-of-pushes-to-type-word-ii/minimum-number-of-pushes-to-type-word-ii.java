class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int[] freq=new int[26]; 
        for(char c:word.toCharArray()){ 
            freq[c-'a']++; 
        } 
        int count=0; 
        int value=1; 
        int ans=0; 
        Arrays.sort(freq); 
        int start=25; 
        while(start>=0){ 
            if(count<8){ 
                ans+=freq[start]*value; 
                count++; 
            }else if(count<16){ 
                value=2; 
                ans+=freq[start]*value; 
                count++; 
            }else if(count<24){ 
                value=3; 
                ans+=freq[start]*value; 
                count++; 
            }else{
                value=4;
                ans+=freq[start]*value;
                count++;
            } 
            start--;
        }
        return ans;
    }
}