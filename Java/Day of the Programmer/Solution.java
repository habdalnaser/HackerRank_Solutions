public class Solution {
    static String dayOfProgrammer(int year) {
        String programmerDay = "";
        if (year == 1918) {
            return "26.09.1918";
        }
        if ((year % 100 == 0 && year % 400 == 0)
                || (year > 1918 && year % 4 == 0 && year % 100 != 0)
                || (year < 1918 && year % 4 == 0)) {
            programmerDay = "12.09." + year;
        } else {
            programmerDay = "13.09." + year;
        }
        return programmerDay;
    }
}
