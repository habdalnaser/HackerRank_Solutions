import java.util.*;

public class Solution {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> colorsCount = new HashMap();
        for (int i = 0; i < ar.length; i++) {
            if (colorsCount.get(ar[i]) == null) {
                colorsCount.put(ar[i], 1);
            } else {
                colorsCount.put(ar[i], colorsCount.get(ar[i]) + 1);
            }
        }
        int pairs = 0;
        for (Map.Entry<Integer, Integer> entry : colorsCount.entrySet()) {
            pairs += entry.getValue() / 2;
        }
        return pairs;
    }
}
