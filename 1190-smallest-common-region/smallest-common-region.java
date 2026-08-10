class Solution {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        HashMap<String,String> childMap=new HashMap<>();

        for(List<String> regionArray:regions){
            String parentNode=regionArray.get(0);
            for(int i=1;i<regionArray.size();i++){
                childMap.put(regionArray.get(i),parentNode);
            }
        }
        List<String> path1=fetchPathForRegion(region1,childMap);
        List<String> path2=fetchPathForRegion(region2,childMap);

        int i=0,j=0;
        String lowestCommon="";
        while(i<path1.size()&&j<path2.size()&&path1.get(i).equals(path2.get(j))){
            lowestCommon=path1.get(i);
            i++;
            j++;
        }
        return lowestCommon;
    }

    public List<String>fetchPathForRegion(String region, Map<String,String> childMap){
        List<String> path=new ArrayList<>();
        path.add(region);

        while(childMap.containsKey(region)){
            String parentNode=childMap.get(region);
            path.add(parentNode);
            region=parentNode;
        }
        Collections.reverse(path);
        return path;
    }
}