import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        int[] rounded = new int[grades.length];
        for(int x = 0; x < grades.length; x++) {
            if(grades[x] < 38) {
                rounded[x] = grades[x];
            } else {
                if(grades[x] % 5 >= 3) {
                     rounded[x] = grades[x] + (5 - (grades[x] % 5));
                } else {
                     rounded[x] = grades[x];
                }
            }
        }
        return rounded;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        int[] grades = {73, 67, 38, 33};
//        for(int grades_i=0; grades_i < n; grades_i++){
//            grades[grades_i] = in.nextInt();
//        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
