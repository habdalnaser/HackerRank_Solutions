public class Solution {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        return y1 > y2 ? (y1 - y2) * 10000
                : y1 < y2 ? 0
                : m1 > m2 ? (m1 - m2) * 500
                : m1 < m2 ? 0
                : d1 > d2 ? (d1 - d2) * 15
                : 0;
    }
}
