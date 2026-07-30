class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[]edge: times){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj.get(u).add(new int[]{v,w});
        }
        int[] dist= new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] rem=pq.poll();
            int dis=rem[1];
            int node=rem[0];
            if(dis>dist[node]) continue;

             for(int[] it:adj.get(node)){
                int adjNode=it[0];
                int wt=it[1];
                if(dis+wt<dist[adjNode]){
                    dist[adjNode]=dis+wt;
                    pq.offer(new int[]{adjNode,dist[adjNode]});
                }
             }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
         
    }
}