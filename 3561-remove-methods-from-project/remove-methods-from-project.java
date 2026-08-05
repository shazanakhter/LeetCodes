class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] edges=new ArrayList[n];
        for(int i=0;i<n;i++){
            edges[i]=new ArrayList<>();
        }
        int[] inDegree=new int[n];
        for(int[] invocation:invocations){
            int u=invocation[0];
            int v=invocation[1];
            edges[u].add(v);
            inDegree[v]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.add(k);
        boolean[] sus=new boolean[n];
        sus[k]=true;
        while(!queue.isEmpty()){
            int u=queue.poll();
            for(int v:edges[u]){
                inDegree[v]--;
                if(!sus[v]){
                    queue.offer(v);
                    sus[v]=true;
                }
            }
        }
        boolean canRemoveAll=true;
        List<Integer> remaining=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(sus[i]&&inDegree[i]>0){
                canRemoveAll=false;
                break;
            }else if(!sus[i]){
                remaining.add(i);
            }
        }
        if(!canRemoveAll){
            List<Integer> allNodes=new ArrayList<>(n);
            for(int i=0;i<n;i++){
                allNodes.add(i);
            }
            return allNodes;
        }
        return remaining;
    }
}