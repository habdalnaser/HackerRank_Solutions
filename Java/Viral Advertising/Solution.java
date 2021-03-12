public class Solution {
    static int viralAdvertising(int n) {
        int count = 0;
        int shared = 5;
        for (int i = 0; i < n; i++) {
            shared /= 2;
            count += shared;
            shared *= 3;
        }
        return count;
    }
}
