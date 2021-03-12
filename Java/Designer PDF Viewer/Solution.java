public class Solution {
    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i);
            maxHeight = maxHeight < h[c - 97] ? h[c - 97] : maxHeight;
        }
        return word.length() * maxHeight;
    }
}
