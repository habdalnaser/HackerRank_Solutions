/**
 * Solution with static magic squares
**/
public class Solution {
    static int formingMagicSquare(int[][] s) {
        int[][][] magicSquares = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};
        int minimumCost = 50;
        for (int[][] magicSquare : magicSquares) {
            int diff = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    diff += (magicSquare[i][j] - s[i][j] >= 0 ? magicSquare[i][j] - s[i][j] : (magicSquare[i][j] - s[i][j]) * -1);
                }
            }
            if (diff < minimumCost) {
                minimumCost = diff;
            }
        }
        return minimumCost;
    }
}
