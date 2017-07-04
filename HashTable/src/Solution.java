import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {

        int currentMax = ar[0];
        int count = 0;
        for(int x = 0; x < ar.length; x++) {

            if(currentMax < ar[x]){
                currentMax = ar[x];
                count = 1;
            } else if(currentMax == ar[x]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] ar = {5, 10, 9, 8, 10};
//        int n = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
