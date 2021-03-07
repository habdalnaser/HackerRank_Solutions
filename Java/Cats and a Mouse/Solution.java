public class Solution {
    static String catAndMouse(int x, int y, int z) {
        int catA = x - z >= 0 ? x - z : z - x;
        int catB = y - z >= 0 ? y - z : z - y;
        String result = "Mouse C";
        if (catA > catB) {
            result = "Cat B";
        } else if (catA < catB) {
            result = "Cat A";
        }
        return result;
    }
}
