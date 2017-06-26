import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int k = 4;
        int a[] = {1,2,3,4,5};

        int[] output = new int[n];
        output = arrayLeftRotationB(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();
        output = arrayLeftRotationA(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

    public static int[] arrayLeftRotationA(int[] a, int n, int k) {
        // temporary array
        ArrayList<Integer> arrayList = new ArrayList<>(a.length);

        // O(N)
        for(int x = 0; x < a.length ; x++){
            arrayList.add(x, a[x]);
        }

        // O(k)
        for(int x = 0; x < k ; x++) {
            arrayList.add(arrayList.remove(0));
            a[x] = arrayList.get(x);
        }

        // (O)N
        for(int x = 0; x < a.length ; x++){
            a[x] = arrayList.get(x);
        }
        // time cost (O)2N + (O)K = (O)N+K
        return a;
    }

    public static int[] arrayLeftRotationB(int[] a, int n, int k) {
        // temporary array
        int[] b = new int[a.length];

        // shift the values O(N)
        for(int x = 0; x < a.length; x++) {
            b[ (n-k+ x) % n] = a[x];
        }
        return b;
    }
}
