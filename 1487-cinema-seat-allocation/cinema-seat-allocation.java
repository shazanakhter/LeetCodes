class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> hmap=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            int row=reservedSeats[i][0];
            int seat=reservedSeats[i][1];
            if(!hmap.containsKey(row)){
                hmap.put(row,new HashSet<>());
            }
            hmap.get(row).add(seat);
        }
        int result=(n-hmap.size())*2;
        
        for(Map.Entry<Integer,Set<Integer>> entry:hmap.entrySet()){
            Set<Integer> bookedSeats=entry.getValue();

            boolean groupA=!bookedSeats.contains(2)&&!bookedSeats.contains(3)&&!bookedSeats.contains(4)&&!bookedSeats.contains(5);
            boolean groupB=!bookedSeats.contains(4)&&!bookedSeats.contains(5)&&!bookedSeats.contains(6)&&!bookedSeats.contains(7);
            boolean groupC=!bookedSeats.contains(6)&&!bookedSeats.contains(7)&&!bookedSeats.contains(8)&&!bookedSeats.contains(9);

            if(groupA&&groupC){
                result+=2;
            }else if(groupA||groupB||groupC){
                result++;
            }
        }
        return result;
    }
}