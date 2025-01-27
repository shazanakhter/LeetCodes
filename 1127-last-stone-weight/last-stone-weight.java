class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        if(pq.size()==0){
            return 0;
        }
        if(pq.size()==1){
            return pq.peek();
        }
        while(pq.size()>1){
            int max1=pq.remove();
            int max2=pq.remove();
            if(max1!=max2){
                pq.add(max1-max2);
            }
        }
        if(pq.size()==0){
            return 0;
        }else{
            return pq.peek();
        }

        
    }
}