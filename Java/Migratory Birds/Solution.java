import java.util.*;

public class Solution {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> types = new HashMap();
        for(int i=0;i<arr.size();i++){
            int val = arr.get(i);
            if(types.get(val) == null){
                types.put(val, 1);
            }else{
                int count = types.get(val) +1;
                types.put(val, count);
            }
        }
        int type = 6;
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : types.entrySet()){
            if(entry.getValue() > count || (entry.getValue() == count
                    && entry.getKey() < type)){
                type = entry.getKey();
                count = entry.getValue();
            }
        }
        return type;
    }
}
