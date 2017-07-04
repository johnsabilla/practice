/**
 * Created by johnsabilla on 7/3/17.
 */
public class Recursion {

    public static void main(String[] args) {
        // 5 + 4 + 3 + 2 + 1 + 0 = 15
        System.out.println(Summation(5));

        // 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println(Factorial(5));

        // 5^3 = 5 * 5 * 5 = 125
        System.out.println(Exponentiation(5, 3));
    }

    public static int Factorial(int n) {
        if(n == 1) {
            /**
             * Factorial(1);
             */
            return 1;
        } else {
            /**
             * 5 * Factorial(4);
             * 5 * 4 * Factorial(3);
             * 5 * 4 * 3 * Factorial(2);
             * 5 * 4 * 3 * 2 * Factorial(1);
             */
            return n * Factorial(n - 1);
        }
    }

    public static int Exponentiation(int n, int p) {
            if(p <= 0){
                return 1;
            } else {
                /**
                 * 5 * Exponentiation(5, 2);
                 * 5 * 5 * Exponentiation(5, 1);
                 * 5 * 5 * 5 * Exponentiation(5, 0);
                 * 5 * 5 * 5 * 1
                 */
                return n * Exponentiation(n, p-1);
            }
    }

    public static int Summation(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + Summation(n - 1);
        }
    }
}
