public class Solution {
    static int utopianTree(int n) {
        int height = 1, s = 1;
        for (int i = 0; i < n; i++) {
            if (s == 1) {
                height += height;
            } else {
                height++;
            }
            s *= -1;
        }
        return height;
    }
}
