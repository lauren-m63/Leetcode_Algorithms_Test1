public class MedianOfTwoSortedArrays_4 {

    /*
    Given two sorted arrays nums1 and nums2 of size m and n respectively,
    return the median of the two sorted arrays.

    The overall run time complexity should be O(log (m+n)).
     */

    /*
    how do i find the median so can i just add up all the numbers and then do math thats not right complexity though
    can i do it like the cummaltive count sorter or is that weird- it has to be log of both list lengths
    are these sorted lists -- yes! so i find the median value

    median is jsut average so add over two
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double num= 0;

        // m is length of nums1 and n is the length of nums2

        // binary to find the middle one
        int low = nums1[0];
        int high = nums1[nums1.length-1];
        int nums2count= 0;
        int nums1count= 0;
        for  (int i = 1; i < nums2.length; i++) {

            while (low <= high) { // while not at the middle yet
                int middle = (low + high) / 2;
                // from java book i honelsy confused on comparater
                int comp = nums1[i]; // shoot this is value based- I NEED POS

               // - i want the middle one so can i just do like the overall list length divided by 2 bc its that
//
            }
        } // end for.oop


        // oops i did the mean not median bruh
        for (int k = 0; k < nums2.length; k++) {
            nums2count = nums2[k]+ nums2count;
        }
        for (int k = 0; k < nums1.length; k++) {
            nums1count = nums1[k]+ nums1count;
        }
//        if (nums1.length==0 && nums2.length==0) {
//            return num;
//        }
//        if (nums1.length%2!= 0) {
//            // if it isn't even do a different thang - if its odd then you dont have to average twice bc jsut one mddile num
//        }

        int median= (nums2count + nums1count)/2;


        return median;
    }


}
