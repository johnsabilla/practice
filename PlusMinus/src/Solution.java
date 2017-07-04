import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int arr[] = { 5, 10, 0, -15, -3};
//        for(int arr_i=0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }

        double[] output = plusMinus(n, arr);

        for(int x = 0; x < output.length; x++) {
            System.out.printf("%.6f %n", output[x]);
        }
    }

    public static double[] plusMinus(int size, int[] arr) {
        double posCount = 0, negCount = 0, zerCount =0;
        double[] count = new double[3]; // positive, negative, zero

        for(int x = 0; x < size; x++) {

            if(arr[x] > 0){
                posCount++;
            } else if( arr[x] < 0) {
                negCount++;
            } else {
                zerCount++;
            }
        }


        count[0] = (posCount/size);
        count[1] = (negCount/size);
        count[2] = (zerCount/size);


        return count;
    }
}
