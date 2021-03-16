public class Solution {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = (queries[i] - k) > 0 ? (queries[i] - k) % (a.length - 1)
                    : (queries[i] - (k % a.length) + a.length) % a.length;
            result[i] = a[index];
        }
        return result;
    }
}
