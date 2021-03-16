public class Solution {
    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int[] result = new int[n];
        for (int x = 1; x <= n; x++) {
            int firstIndex = -1;
            for (int i = 0; i < n; i++) {
                if (x == p[i]) {
                    firstIndex = i + 1;
                    break;
                }
            }
            int secondIndex = -1;
            for (int j = 0; j < n; j++) {
                if (firstIndex == p[j]) {
                    secondIndex = j + 1;
                    break;
                }
            }
            result[x - 1] = secondIndex;
        }
        return result;
    }
}
