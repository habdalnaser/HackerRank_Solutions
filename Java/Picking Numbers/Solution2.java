import java.util.*;

public class Solution2 {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int firstNumber = 1, secondNumber = 0, currentNumber = a.get(0), max = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) == currentNumber) {
                firstNumber++;
            } else if (Math.abs(a.get(i) - currentNumber) == 1) {
                secondNumber++;
            }
            if (Math.abs(a.get(i) - currentNumber) > 1 || i == a.size() - 1) {
                if (firstNumber != 0 && secondNumber != 0) {
                    max = firstNumber + secondNumber > max ? firstNumber + secondNumber
                            : max;
                    if (i == a.size() - 1) {
                        break;
                    }
                    firstNumber = secondNumber;
                    secondNumber = 0;
                    i--;
                    currentNumber = a.get(i);
                } else {
                    if (firstNumber > max) {
                        max = firstNumber;
                    }
                    if (i == a.size() - 1) {
                        break;
                    }
                    firstNumber = 0;
                    secondNumber = 0;
                    currentNumber = a.get(i);
                    i--;
                }
            }
        }
        return max;
    }
}
