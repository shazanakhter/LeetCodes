class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //1st Solution using HashMap
       /*HashMap<Character,Integer> hm= new HashMap<>();
       for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c=t.charAt(i);
            if(!hm.containsKey(c)){
                return false;
            }
            hm.put(c,hm.get(c)-1);
            if(hm.get(c)==0){
                hm.remove(c);
            }
        }
        return hm.isEmpty();
        */
        //2nd Solution Using Array
        int count[]= new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int x:count){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}