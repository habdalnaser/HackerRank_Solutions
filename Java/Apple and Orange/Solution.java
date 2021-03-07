public class Solution {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0;
        int orangesCount = 0;
        int minLoop = apples.length > oranges.length ? oranges.length
                : apples.length;
        for (int i = 0; i < minLoop; i++) {
            if (a + apples[i] >= s && a + apples[i] <= t) {
                applesCount++;
            }
            if (b + oranges[i] >= s && b + oranges[i] <= t) {
                orangesCount++;
            }
        }
        if (apples.length > oranges.length) {
            for (int i = minLoop; i < apples.length; i++) {
                if (a + apples[i] >= s && a + apples[i] <= t) {
                    applesCount++;
                }
            }
        } else if (apples.length < oranges.length) {
            for (int i = minLoop; i < oranges.length; i++) {
                if (b + oranges[i] >= s && b + oranges[i] <= t) {
                    orangesCount++;
                }
            }
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}
