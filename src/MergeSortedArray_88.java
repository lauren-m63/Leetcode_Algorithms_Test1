import java.util.Arrays;

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

sorting is one list and rearranging elements into order so i dont sort i merge since they are already sorted
this confuses me for some reaosn i was confused no that one too they are already sorted
merge is two lists that are already sorted so its linear bc you are just comparing the elemnts next to each other

thinking
- i ideally want to do it in m+n so that means i only run through each list once to sort them
so
     */

    public static void main (String[] args) {


        int [] nums1 = new int[]{1,2,3,0,0,0}; // 0 should be ignored
        int [] nums2 = new int[]{2,5,6};

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));



    } // END MAIN

// m and n are the amoutn of real values not total length - ignoring 0 how many ints

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int m2 = m-1 ;
        int n2 = n-1 ;
        int i2= m+n-1;
        //int[] merged = new int[m + n];

        // last elements are ALWAYS 0
        /*
        i want to say while the lvalues are numbers that exist
        loop through the lists at their index minus one and compare them so if
        the m2[i] is less than n2[i] then keep that there and then if
        the next m2i is greater than the same n2i then replace the next index in nums1 but
        am i overwriting should i doa  tracker no my i2 is tracker i dont needanother
         */
        while (m2>=0 && n2>=0){
            if (nums1[m2] > nums2[n2]){
                nums1[i2] = nums1[m2]; // if the m2 is greater than bc im backwards then replace my tracking in nums2 with the element in list
                m2--;
            }
            else { // i overwrite bc i keep going in loo but i need to break to icnremeent so else
                nums1[i2] = nums2[n2]; // same
                n2--;
            }
            i2--; // dont decrement inside the if that is for the smaller variables you should after one of them has been added

        } // end while loop

        // one outside the loop incase one of the lists is null wait no bc i dont say null up top
        while (n2>=0){
            nums1[i2] = nums2[n2];
            n2--;
            i2--;
        } // end while loop


       // nums1= merged;
        //return nums1; // wait do i not return at all or do i just return og variable
    } // END MERGE METHOD





}// LAST BRACKET
