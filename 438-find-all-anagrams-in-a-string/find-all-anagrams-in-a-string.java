class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans= new ArrayList<>();
        if(p.length()>s.length()) return ans;
        HashMap<Character, Integer> hms= new HashMap<>();
        HashMap<Character, Integer> hmp=new HashMap<>();
        int matchingChar=0;
        
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<p.length();i++){
            char ch=s.charAt(i);
            hms.put(ch, hms.getOrDefault(ch,0)+1);
            if(hms.get(ch)<=hmp.getOrDefault(ch,0)) matchingChar++;
            if(matchingChar==p.length()) ans.add(0);
        }
        int sp=0;
        int ep=p.length();
        while(ep<s.length()){
            char ch1=s.charAt(ep);
            char ch2=s.charAt(sp);
            hms.put(ch1,hms.getOrDefault(ch1,0)+1);
            if(hms.get(ch1)<=hmp.getOrDefault(ch1,0)){
                matchingChar++;
            }
            hms.put(ch2,hms.get(ch2)-1);
            if(hms.get(ch2)<hmp.getOrDefault(ch2,0)){
                matchingChar--;
            }
            
            if(matchingChar==p.length()) ans.add(sp+1);
            sp++;
            ep++;
            
        }
        return ans;
    }
}