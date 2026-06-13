class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            String str=words[i];
            for(char ch:str.toCharArray()){
                sum=sum+weights[(ch-'a')];
            }
            sum=sum%26;
            sb.append((char)('z'-sum));
        }

        return sb.toString();
    }
    
}