/**
 * This is my solution for the problem: "Strings: Making Anagrams"
 * at Hackerrank: https://www.hackerrank.com/challenges/ctci-making-anagrams
 * Created by johnsabilla on 6/25/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] alphabet = new int[26];
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        int counter = 0;

        /**
         * Loop through the first array and increment for each letter
         */
        for(int x = 0; x < firstArray.length; x++) {
            //System.out.println(Character.getNumericValue(firstArray[x]) - 10);
            alphabet[Character.getNumericValue(firstArray[x]) - 10 ]++;
        }

        /**
         * Loop through the second array and decrement for each letter
         */
        for(int y = 0; y < secondArray.length; y++) {
            alphabet[Character.getNumericValue(secondArray[y]) - 10 ]--;
        }

        /**
         * Count and sum all of the elements that are non-zero.
         * For each element that is equal to zero, The char that corresponds with that
         * index exist on both strings or it does not exist at all.
         * For each element that is non-zero, Those chars that corresponds with that
         * array index mean that they only exist in one string.
         */
        for(int x = 0; x < alphabet.length; x++) {
            System.out.print(alphabet[x] + " ");
            if(alphabet[x] != 0) {
                counter += Math.abs(alphabet[x]);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

          String a = "edcc";
          String b = "aaabc";
        System.out.println(numberNeeded(a, b));
    }
}