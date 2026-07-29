class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Integer>[] adj=new ArrayList[numCourses];
        boolean[][] prereq=new boolean[numCourses][numCourses];
        int[] inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] graph: prerequisites){
            int a=graph[0];
            int b=graph[1];
            adj[a].add(b);
            prereq[b][a]=true;
            inDegree[b]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int rem=q.poll();
            for(int r:adj[rem]){
                for(int i=0;i<numCourses;i++){
                    if(prereq[rem][i]==true){
                        prereq[r][i]=true;
                    }
                }
                inDegree[r]--;
                if(inDegree[r]==0){
                    q.add(r);
                }
            }
        }

        List<Boolean> ans=new ArrayList<>();
        for(int [] query:queries){
            int u=query[0];
            int v=query[1];
            ans.add(prereq[v][u]);
        }
        return ans;
    }
}