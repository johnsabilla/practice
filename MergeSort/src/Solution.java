import java.util.Arrays;

/**
 * Created by johnsabilla on 7/24/2017.
 */
public class Solution
{

    public static void merge(int[] original, int[] left, int leftSize, int[] right, int rightSize){
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {

            // If left element is less than right element, insert it to original array
            if(left[i] < right[j]){
                original[k] = left[i];
                k++;
                i++;
            // If right element is less than left element, insert it to original array
            } else {
                original[k] = right[j];
                k++;
                j++;
            }
        }

        //If there are leftovers, we add them to original array
        while(i < leftSize){
            original[k] = left[i];
            k++;
            i++;
        }

        while(j < rightSize){
            original[k] = right[j];
            k++;
            j++;
        }
    }

    public static int[] mergeSort(int[] a, int size){
        int mid = size/2;
        int[] left = new int[mid];
        int[] right = new int[size-mid];


        // if the array has 1 element, it is sorted.
        if(size < 2){
            return a;
        }

        // left sub-array
        for(int x = 0; x < mid; x++) {
            left[x] = a[x];
        }

        // right sub-array
        for(int y = mid; y < size; y++) {
            right[y - mid] = a[y];
        }

        mergeSort(left, mid); // sort the left sub-array
        mergeSort(right, (size-mid)); // sort the right sub-array
        merge(a, left, mid, right, (size-mid));
        return a;
    }

    public static void main (String[] args){

        int[] input = {9, 1, 0, 2, 3, 7, 4, 6, 5, 8};
        //int[] input = {2, 4, 1, 6};
        //Arrays.sort();
        int size = input.length;
        System.out.println("Unsorted: ");
        for(int num : input){
            System.out.print(num + " ");
        }

        int[] sorted = mergeSort(input, size);

        System.out.println("\n\nSorted:");
        for(int num : sorted){
            System.out.print(num + " ");
        }
    }
}
