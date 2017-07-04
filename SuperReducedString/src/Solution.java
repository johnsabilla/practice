import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        char[] letters = s.toCharArray();
        char[] shorter = new char[s.length()];
        for(int x = 0; x < letters.length; x++){

            if(letters[x] == letters[x+1]){

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
