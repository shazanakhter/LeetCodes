class RandomizedCollection {
    HashMap<Integer,HashSet<Integer>> map;
    Random r;
    ArrayList<Integer> list;

    public RandomizedCollection() {
        map=new HashMap<>();
        r=new Random();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        HashSet<Integer>set;
        boolean flag;
        if(map.containsKey(val)){
            flag=false;
            set=map.get(val);
        }else{
            flag=true;
            set=new HashSet<>();
        }
        set.add(list.size());
        list.add(val);
        map.put(val,set);
        return flag;
    }
    
    public boolean remove(int val) {
        HashSet<Integer>set;
        if(map.containsKey(val)){
            set=map.get(val);
        }else{
            return false;
        }
        int remidx=-1;
        for(int x:set){
            remidx=x;
            break;
        }
        set.remove(remidx);
        map.put(val,set);
        if(remidx==list.size()-1){
            list.remove(list.size()-1);
        }else{
            int idx2=list.size()-1;
            int temp=list.get(idx2);
            swap(remidx,idx2);
            list.remove(list.size()-1);
            HashSet<Integer>s=map.get(temp);
            s.remove(idx2);
            s.add(remidx);
            map.put(temp,s);
        }
        if(map.get(val).size()==0){
            map.remove(val);
        }
        return true;

    }
    
    public int getRandom() {
        int idx=r.nextInt(list.size());
        return list.get(idx);
    }

    public void swap(int i, int j){
        int a=list.get(i);
        int b=list.get(j);
        list.set(i,b);
        list.set(j,a);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */