import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private final String AM = "AM";
    private final String PM = "PM";
    static String timeConversion(String s) {
        String[] time = s.split(":");
        String amOrPm = time[2].substring(2);
        StringBuilder stringBuilder = new StringBuilder();

        if(amOrPm.equals("AM")) {
            if(time[0].equals("12")){
                stringBuilder.append("00");
            } else {
                stringBuilder.append(time[0]);
            }
        } else {
            if(time[0].equals("12")) {
                stringBuilder.append("12");
            }else {
                int hour = (Integer.parseInt(time[0]) + 12);
                stringBuilder.append(hour);
            }
        }
        stringBuilder.append(":");
        stringBuilder.append(time[1]);
        stringBuilder.append(":");
        stringBuilder.append(time[2].substring(0,2));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
