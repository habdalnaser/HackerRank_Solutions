public class Solution2 {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0;
        int orangesCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if (a + apples[i] >= s && a + apples[i] <= t) {
                applesCount++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            if (b + oranges[i] >= s && b + oranges[i] <= t) {
                orangesCount++;
            }
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}
