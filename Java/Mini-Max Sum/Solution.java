public class Solution {
    static void miniMaxSum(int[] arr) {
        long sum = arr[0];
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("" + (sum - max) + " " + (sum - min));
    }
}
