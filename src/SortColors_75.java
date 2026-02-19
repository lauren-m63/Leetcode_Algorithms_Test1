import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SortColors_75 {


    /*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of
    the same color are adjacent, with the colors in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

    You must solve this problem without using the library's sort function.

     */

    /*
    this one is sorting not merging finally so i can use a sorting alg
    i might do like a bucket sort vibe do we care about complexity no
    ill do merge sort then since its faster

     */

    public static void main (String[] args) {

        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);

    }// END MAIN


    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) { // if the left is small already - if its less then not split
            int mid = (left + right) / 2; // split array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    // its recursive so calss itself obvi

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;      // left half
        int j = mid + 1;   // right half
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // actually sorting in this method and just doing the usual
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, temp.length);

    } // end sort method


    public static void sortColors(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));



    }// END SORTCOLORS




} // LAST BRACKET
