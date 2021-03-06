import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isBalanced(String expression) {
        Stack<Character> characters = new Stack<Character>();

        for (Character character: expression.toCharArray()) {
            if( character == '(') {
                characters.push(')');
            } else if( character == '[') {
                characters.push(']');
            } else if( character == '{') {
                characters.push('}');
            } else if( characters.isEmpty() || character != characters.pop()) {
                return false;
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
