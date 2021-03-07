import java.util.List;

public class Solution {
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for(int i=0;i<s.size();i++){
            int sum = 0;
            int barsCount = 0;
            for(int j=i;j<j+m;j++){
                if(j>=s.size() || sum >= d){
                    break;
                }
                barsCount++;
                sum+=s.get(j);
            }
            if(sum == d && barsCount == m){
                count++;
            }
        }
        return count;
    }
}
