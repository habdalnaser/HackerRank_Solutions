public class Solution {
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
