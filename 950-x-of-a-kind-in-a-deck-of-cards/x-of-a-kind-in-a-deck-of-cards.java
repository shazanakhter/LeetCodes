class Solution {
    public int gcd(int a , int b){
        if(a==0){
            return b;
        }
        int temp=gcd(b%a,a);
        return temp;
    }
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<deck.length;i++){
            if(hm.containsKey(deck[i])){
                int temp=hm.get(deck[i]);
                hm.put(deck[i],temp+1);
            }else{
                hm.put(deck[i],1);
            }
        }
        int ans=0;
        for(int element:hm.keySet()){
            ans=gcd(ans,hm.get(element));
        }
        if(ans==1){
            return false;
        }
        return true;
    }
}