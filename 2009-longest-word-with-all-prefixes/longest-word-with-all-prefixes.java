class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String>set=new HashSet<>();
        String longestValid="";

        for(String currWord:words){
            if(currWord.length()==1|| set.contains(currWord.substring(0,currWord.length()-1))){
                set.add(currWord);
                if(longestValid.length()<currWord.length()){
                    longestValid=currWord;
                }
            }
        }
        return longestValid;
    }
}