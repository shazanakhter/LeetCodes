class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int x: nums) set.add(x);
        int num=original;
        while(set.contains(num)){
            num=num*2;
        }
        return num;
    }
}