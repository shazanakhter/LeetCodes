class Solution {
    public int[][] highFive(int[][] items) {
        int n=items.length;
        HashMap<Integer,PriorityQueue<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int id=items[i][0];
            int marks=items[i][1];
            hm.computeIfAbsent(id,k->new PriorityQueue<>()).add(marks);
            if(hm.get(id).size()>5){
                hm.get(id).poll();
            }
        }
        List<int[]> ans=new ArrayList<>();

        for(int id:hm.keySet()){
            int sum=0;
            for(int i=0;i<5;++i){
                sum+=hm.get(id).poll();
                
            }
            ans.add(new int[]{id,sum/5});
        }
        int[][] solutionArray=new int[ans.size()][];
        return ans.toArray(solutionArray);
    }
}