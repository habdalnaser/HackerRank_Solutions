import java.util.*;

public class Solution {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles, Collections.reverseOrder());
        int count = 0;
        int tallest = candles.get(0);
        int i = 0;
        while (i < candles.size()) {
            if (candles.get(i) == tallest)
                count++;
            else
                break;
            i++;
        }
        return count;
    }
}
