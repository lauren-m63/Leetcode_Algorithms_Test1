public class MergeSortedArray_88 {

    /*
    directions:
you have two integer arrays SORTED going from low to high
you have two integers that are the length of the arrays
merge the two lists into single sorted array from low to high

do not return new array but put it in nums1 array so length of nums1 is m+n
why are we ignoring elements- you ignore the 0s
nums 2 has length n its just original
should run in 0*m+n) time - doesnt matter
     */

    public static void main (String[] args) {


        int [] nums1 = new int[]{1,2,3,0,0,0}; // 0 should be ignored
        int [] nums2 = new int[]{2,5,6};


    } // END MAIN



    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        m = nums1.length;
        n = nums2.length;
        int[] merged = new int[m + n];





        nums1= merged;
        return nums1; // wait do i not return at all or do i just return og variable
    } // END MERGE METHOD





}// LAST BRACKET
