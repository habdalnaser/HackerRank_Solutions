import java.util.*;
/**
 * Generating Magic squares Dynamically
 **/
public class Solution2 {
    static int formingMagicSquare(int[][] s) {
        List<Object> magicSquareList = new ArrayList<>();
        String[] startingPoints = new String[]{"1,0", "0,1", "2,1", "1,2"};
        for (String startingPoint : startingPoints) {
            int startingX = Integer.valueOf(startingPoint.split(",")[0]);
            int startingY = Integer.valueOf(startingPoint.split(",")[1]);
            int round = 1, xShift = 1, yShift = 1, xShift2 = 1, yShift2 = 1;
            while (round <= 2) {
                int x = startingX;
                int y = startingY;
                if (startingX == 0 && startingY == 1) {
                    xShift = -1;
                    yShift = -1 * yShift;
                    xShift2 = 1;
                    yShift2 = 0;
                } else if (startingX == 2 && startingY == 1) {
                    xShift = 1;
                    yShift = -1 * yShift;
                    xShift2 = -1;
                    yShift2 = 0;
                } else if (startingX == 1 && startingY == 0) {
                    xShift = -1 * xShift;
                    yShift = -1;
                    xShift2 = 0;
                    yShift2 = 1;
                } else if (startingX == 1 && startingY == 2) {
                    xShift = -1 * xShift;
                    yShift = 1;
                    xShift2 = 0;
                    yShift2 = -1;
                }
                int[][] magicSquare = new int[3][3];
                int number = 1;
                while (number <= 9) {
                    magicSquare[x][y] = number;
                    number++;
                    int[] newIndex = shiftToNextIndex(x, y, xShift, yShift, xShift2, yShift2, magicSquare);
                    x = newIndex[0];
                    y = newIndex[1];
                }
                round++;
                magicSquareList.add(magicSquare);
            }
        }
        int minimumCost = 50;
        for (Object o : magicSquareList) {
            int diff = 0;
            int[][] magicSquare = (int[][]) o;
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

    private static int[] shiftToNextIndex(int x, int y, int xShift, int yShift, int xShift2, int yShift2, int[][] magicSquare) {
        int tempX = getSquareIndex(x, xShift);
        int tempY = getSquareIndex(y, yShift);
        if (magicSquare[tempX][tempY] == 0) {
            x = tempX;
            y = tempY;
        } else {
            x = getSquareIndex(x, xShift2);
            y = getSquareIndex(y, yShift2);
        }
        int[] newIndex = {x, y};
        return newIndex;
    }

    private static int getSquareIndex(int index, int shift) {
        int newIndex = index + shift;
        if (newIndex > 2)
            newIndex -= 3;
        else if (newIndex < 0)
            newIndex += 3;
        return newIndex;
    }
}
