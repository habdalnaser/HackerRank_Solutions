import java.util.List;

public class Solution {
    public static int pickingNumbers(List<Integer> a) {
        int[] arr = new int[100];
        for (int n : a) {
            arr[n]++;       // equal to arr[n] = ++arr[n];
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i - 1] + arr[i]);
        }
        return max;
    }
}
