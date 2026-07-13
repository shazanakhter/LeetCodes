class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        int minLen=String.valueOf(low).length();
        int maxLen=String.valueOf(high).length();
        List<Integer> ans=new ArrayList<>();
        for(int i=minLen;i<=maxLen;i++){
            for(int start=0;start+i<=9;start++){
                String temp=s.substring(start,start+i);
                int val=Integer.parseInt(temp);
                if(val>=low&&val<=high){
                    ans.add(val);
                }
            }
        }
        return ans;
    }
}