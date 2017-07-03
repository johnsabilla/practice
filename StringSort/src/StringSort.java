import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;

        System.out.println("Please enter the number of words you like to be sorted: ");
        wordCount = scanner.nextInt();

        String[] words = new String[wordCount];
        String[] sortedWords = new String[wordCount];
        scanner.nextLine();

        System.out.println("Please enter the words: ");
        for(int x = 0; x < wordCount; x++) {
            words[x] = scanner.nextLine();
        }

        for(int x = 0; x < wordCount; x++) {
            sortedWords[x] = sortWord(words[x]);
        }

        for(int x = 0; x < wordCount; x++) {
            System.out.println(sortedWords[x]);
        }
    }

    public static String sortWord(String word){
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        char[] stringToChars = word.toCharArray();

        for(int x = 0; x < stringToChars.length; x++) {
            //System.out.println(stringToChars[x]);

            if( x % 2 == 0) {
                even.append(stringToChars[x]);
            }else {

                odd.append(stringToChars[x]);
            }
        }

        return (even.toString() + " " + odd.toString());
    }
}