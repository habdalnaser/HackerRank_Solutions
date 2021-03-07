public class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] > max && keyboards[i] + drives[j] <= b) {
                    max = keyboards[i] + drives[j];
                }
            }
        }
        return max;
    }
}
