import java.util.List;

public class Solution {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sum += bill.get(i);
            }
        }
        int annaBill = sum / 2;
        if (annaBill == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaBill);
        }
    }
}
