import java.math.BigInteger;

public class Solution {
    static void extraLongFactorials(int n) {
        BigInteger b = BigInteger.valueOf(1);
        for (int i = n; i > 0; i--) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b);
    }
}
