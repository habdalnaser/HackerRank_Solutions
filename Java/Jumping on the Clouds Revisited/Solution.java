public class Solution {
    static int jumpingOnClouds(int[] c, int k) {
        int index = 0;
        int n = c.length;
        int energy = 100;
        do {
            int val = c[(index + k) % n];
            if (val == 0) {
                energy = energy - 1;
            } else {
                energy = energy - 3;
            }
            index = (index + k) % n;
        } while (index != 0);
        return energy;
    }
}
