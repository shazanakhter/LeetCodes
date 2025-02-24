class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.charAt(i)-'0');
        }
        for(int i=1;i<=n-2;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<a.size()-1;j++){
                int sum=(a.get(j)+a.get(j+1))%10;
                temp.add(sum);
            }
            a=temp;
        }
        return a.get(0)==a.get(1);
    }
}