public class Solution {
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int n = i; n <= j; n++) {
            String reversed = new StringBuilder("" + n).reverse().toString();
            count = Math.abs(n - Integer.valueOf(reversed)) % k == 0 ? count + 1 : count;
        }
        return count;
    }
}
