public class Solution {
    static int saveThePrisoner(int n, int m, int s) {
        int chair = ((m % n) + s - 1);
        return chair == n ? n : chair == 0 ? n : chair % n;
    }
}
