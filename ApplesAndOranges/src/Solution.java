import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int applesLanded = inRange(s, t, a, m, apple);
        int orangesLanded = inRange(s, t, b, n, orange);

        System.out.println(applesLanded + " " + orangesLanded);
    }

    /**
     *
     * @param s start of house
     * @param t end of house
     * @param a  tree
     * @param m number of apples
     * @param items apple coordinates
     * @return number of apples that feel within the house
     */
    public static int inRange(int s, int t, int a, int m, int[] items){
        int count = 0;
        for(int x = 0; x < m; x++) {
            if( (a + items[x] >= s) && (a + items[x] <= t) ) {
                count++;
            }
        }
        return count;
    }
}
