public class Solution {
    static String appendAndDelete(String s, String t, int k) {
        String result = "No";
        while (k >= 0) {
            if (s.isEmpty()) {
                return t.length() <= k ? "Yes" : "No";
            } else if (s.length() <= t.length() && s.equals(t.substring(0, s.length()))) {
                if (t.length() - s.length() == k)
                    return "Yes";
            }
            s = s.substring(0, s.length() - 1);
            k--;
        }
        return result;
    }
}
