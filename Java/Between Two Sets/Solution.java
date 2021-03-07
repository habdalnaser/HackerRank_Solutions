import java.util.*;

public class Solution {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int fact = b.get(0);
        int maxA = a.get(a.size() -1);
        List<Integer> factNumsA = new ArrayList();
        List<Integer> factNums = new ArrayList();
        while(fact >= maxA){
            boolean valid = true;
            for(int i=0;i<a.size();i++){
                if(fact % a.get(i) !=0){
                    valid = false;
                    break;
                }
            }
            if(valid){
                factNumsA.add(fact);
            }
            fact--;
        }
        for(int i=0; i<factNumsA.size();i++){
            int factor = factNumsA.get(i);
            boolean valid = true;
            for(int j =0;j<b.size();j++){
                if(b.get(j)%factor !=0){
                    valid = false;
                    break;
                }
            }
            if(valid){
                factNums.add(factor);
            }
        }
        return factNums.size();
    }
}
