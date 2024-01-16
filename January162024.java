import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RandomizedSet {

    Map<Integer,Integer> randomMap;
    List<Integer> randomList;
    int size;

    public RandomizedSet() {
        randomMap = new HashMap<>();
        randomList = new ArrayList<>();
        size = 0;
    }

    public boolean insert(int val) {
        if(randomMap.containsKey(val)){
            return false;
        }
        randomList.add(val);
        randomMap.put(val,size);
        size++;
        return true;
    }

    public boolean remove(int val) {
        if(!randomMap.containsKey(val)){
            return false;
        }
        randomList.remove(Integer.valueOf(val));
        randomMap.remove(val);
        size--;
        return true;
    }

    public int getRandom() {
        return randomList.get((int)(Math.random()*size));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */