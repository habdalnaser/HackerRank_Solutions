public class Solution {
    static int findDigits(int n) {
        int digits = 0;
        int temp = n;
        int part = 0;
        while (temp != 0) {
            part = temp % 10;
            if (part != 0 && n % part == 0) {
                digits++;
            }
            temp /= 10;
        }
        return digits;
    }
}
