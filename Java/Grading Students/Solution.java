import java.util.*;

public class Solution {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < grades.size(); i++) {
            int oldResult = grades.get(i);
            int newResult = oldResult >= 38 ? oldResult % 5 >= 3
                    ? (oldResult + 5 - (oldResult % 5))
                    : oldResult
                    : oldResult;
            result.add(newResult);
        }
        return result;
    }
}
