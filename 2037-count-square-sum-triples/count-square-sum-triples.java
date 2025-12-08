class Solution {
    public int countTriples(int n) {
        Set<Integer> set=new HashSet<>();
        for(int i=1;i<=n;i++){
            set.add(i*i);
        }
        int count=0;
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
                if(set.contains(a*a+b*b)){
                    count++;
                }
            }
        }
        return count;
    }
}