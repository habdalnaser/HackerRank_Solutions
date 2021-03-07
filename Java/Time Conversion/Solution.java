public class Solution {
    static String timeConversion(String s) {
        String[] parts = s.split(":");
        String hours = "";
        String Hours24 = "";
        if (parts[2].contains("AM")) {
            hours = parts[0];
            int hoursInt = Integer.parseInt(hours);
            Hours24 = (hoursInt == 12 ? "00" : hoursInt > 9 ? "" + hoursInt : "0" + hoursInt) + ":" + parts[1] + ":" + parts[2].substring(0, 2);
        } else if (parts[2].contains("PM")) {
            hours = parts[0];
            int hoursInt = Integer.parseInt(hours);
            hoursInt = hoursInt == 12 ? 12 : (hoursInt + 12);
            Hours24 = "" + hoursInt + ":" + parts[1] + ":" + parts[2].substring(0, 2);
        }
        return Hours24;
    }
}
