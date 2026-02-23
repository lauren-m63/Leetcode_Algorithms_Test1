public class MedianTwoSortedArrays_4_Attempt2 {

/// soi jae two sortedt arrays and i need the median of the two

// the median is the exact middle not the mean which is the average
    // so i just need the middle one of both sets so do i put them in one list and find the middle one
// middl ehwen it is odd and when it is even its the average of the two middles -
    // its the median of combined data set so





/*
1. combine them
2. divide the length number in half
3. if its odd do total/2 index
4. if its even do the average of the two middle ones
4. go to that index
5. return
 */

public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    // first merge from back just other code i dont want to rewrite
    int m = nums1.length;
    int n = nums2.length;
    int m2 = m-1 ;
    int n2 = n-1 ;
    int i2= m+n-1;
    int [] merged = new int[m+n];

    while (m2>=0 && n2>=0){
        if (nums1[m2] > nums2[n2]){
            merged[i2] = nums1[m2]; // if the m2 is greater than bc im backwards then replace my tracking in nums2 with the element in list
            m2--;
        }
        else { // i overwrite bc i keep going in loo but i need to break to icnremeent so else
            merged[i2] = nums2[n2]; // same
            n2--;
        }
        i2--; // dont decrement inside the if that is for the smaller variables you should after one of them has been added
    }
    while (n2>=0){
        merged[i2] = nums2[n2];
        n2--;
        i2--;
    } // end while loop

    while (m2>=0){
        merged[i2] = nums1[m2];
        m2--;
        i2--;
    } // end while loop

    // its all inside nums1 now

    int middle = merged.length/2;
    if (merged.length % 2==0){
        // if its even
        return (merged[middle-1] + merged[middle])/2.0; // its minus 1 not plus one because the index goes from 0 where the length. goes from one
        // must be 2.0 to return a double
    } else {
        // if its odd
        return merged[middle];
    }



    // now im going to find median

} // last bracket



}// Last bracker
