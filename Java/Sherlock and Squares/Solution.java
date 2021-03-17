public class Solution {
    static int squares(int a, int b) {
        int count = 0, n = 1;
        while (n * n < a) n++;
        while (n * n >= a && n * n <= b) {
            count++;
            ++n;
        }
        return count;
    }
}
