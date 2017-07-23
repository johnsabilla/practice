import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given a base-10 integer,  convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] binary = toBinary(n);
        int count = checkOnes(binary);
        System.out.println(count);
    }

    public static int checkOnes(char[] binary) {
        int count = 0;
        int maxCount = 0;
        for(int x = 0; x < binary.length; x++){
            if(binary[x] == '1') {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
    public static char[] toBinary(int n){
        char[] binary = new char[32];
        int index = binary.length - 1;
        while(n > 0) {

            if(n%2 == 0) {
                binary[index] = '0';
            } else {
                binary[index] = '1';
            }
            n = n / 2;
            index--;
        }
        //padding
        for(int x = 0; x < binary.length; x++) {
            if(binary[x] == 0) {
                binary[x] = '0';
            }
        }

        return binary;
    }



}
