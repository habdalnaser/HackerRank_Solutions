public class Solution {
    static void plusMinus(int[] arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zerosCoount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zerosCoount++;
            }
        }
        int positive = (int) ((positiveCount / arr.length) * 1000000);
        int negative = (int) ((negativeCount / arr.length) * 1000000);
        int zeros = (int) ((zerosCoount / arr.length) * 1000000);
        System.out.println((double) positive / 1000000);
        System.out.println((double) negative / 1000000);
        System.out.println((double) zeros / 1000000);
    }
}
