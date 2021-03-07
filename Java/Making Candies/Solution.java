import java.math.BigInteger;

public class Solution {
    static long minimumPasses(long m, long w, long p, long n) {
        long passes = 0;
        long newPasses = 0;
        long sum = 0;
        long tempPasses = Long.MAX_VALUE;
        if (BigInteger.valueOf(m).multiply(BigInteger.valueOf(w)).compareTo(BigInteger.valueOf(n)) > 0) {
            return 1;
        }
        while (sum < n) {
            long diff = n - sum;
            long remain = (diff % (w * m) == 0) ? (diff / (w * m)) : ((diff / (w * m)) + 1);
            if ((remain + passes) < tempPasses) {
                tempPasses = remain + passes;
            }
            if (tempPasses < passes) {
                break;
            }
            newPasses = p > ((m * w) + sum) ? ((p - sum) % (m * w) == 0) ? (p - sum) / (m * w) : (((p - sum) / (m * w)) + 1) : 1;
            sum += newPasses * m * w;
            passes += newPasses;
            System.out.println("t " + tempPasses);
            System.out.println("p " + passes);
            if (sum < n) {
                if (sum >= p) {
                    long units = sum / p;
                    while (units > 0) {
                        if (m < w) {
                            long oldM = m;
                            m += units > (w - m) ? (w - m) : units;
                            units = units > (w - oldM) ? (units - (w - oldM)) : 0;
                        } else if (m > w) {
                            long oldW = w;
                            w += units > (m - w) ? (m - w) : units;
                            units = units > (m - oldW) ? (units - (m - oldW)) : 0;
                        } else if (m == w) {
                            m += (units / 2) + (units % 2);
                            w += units / 2;
                            break;
                        }
                    }
                    sum = sum % p;
                }
            } else {
                break;
            }
        }
        passes = passes <= tempPasses ? passes : tempPasses;
        return passes;
    }
}
