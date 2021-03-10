public class Solution {
    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        if (max > k) {
            return max - k;
        }
        return 0;
    }
}
