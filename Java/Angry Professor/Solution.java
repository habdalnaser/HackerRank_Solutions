public class Solution {
    static String angryProfessor(int k, int[] a) {
        int attendant = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                attendant++;
            }
        }
        return attendant >= k ? "NO" : "YES";
    }
}
