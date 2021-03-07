public class Solution {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int lastIndex = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            firstDiagonalSum += arr.get(i).get(i);
            secondDiagonalSum += arr.get(i).get(lastIndex);
            lastIndex--;
        }
        int result = firstDiagonalSum - secondDiagonalSum;
        return result >= 0 ? result : (result *= -1);
    }
}
