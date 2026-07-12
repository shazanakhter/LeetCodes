class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] temp=arr.clone();
        int[] result=new int[arr.length];
        Arrays.sort(temp);
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(i>0&&temp[i]>temp[i-1]){
                rank++;
            }
            hm.put(temp[i],rank);
        }
        for(int i=0;i<arr.length;i++){
            result[i]=hm.get(arr[i]);
        }
        return result;
    }
}