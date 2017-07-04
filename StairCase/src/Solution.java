import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[][] stairCase = new int[n][n];
        int stairs = n;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {

                if(y+1 >= stairs){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            stairs--;
        }
    }

}
