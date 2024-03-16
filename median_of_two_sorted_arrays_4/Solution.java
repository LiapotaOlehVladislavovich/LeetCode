package median_of_two_sorted_arrays_4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int [] numsMerged = new int[nums1.length + nums2.length];

         int pointer1 = 0;
         int pointer2 = 0;
         int mergedPointer = 0;

         while (pointer1 < nums1.length && pointer2 < nums2.length) {
             if (nums1[pointer1] <= nums2[pointer2]) {
                 numsMerged[mergedPointer] = nums1[pointer1];
                 pointer1++;
             } else {
                 numsMerged[mergedPointer] = nums2[pointer2];
                 pointer2++;
             }
             mergedPointer++;
         }

         for (;pointer1 < nums1.length; pointer1++) {
             numsMerged[mergedPointer] = nums1[pointer1];
             mergedPointer++;
         }

        for (;pointer2 < nums2.length; pointer2++) {
            numsMerged[mergedPointer] = nums2[pointer2];
            mergedPointer++;
        }

        return (numsMerged.length % 2 == 0) ? ((double) (numsMerged[numsMerged.length / 2] + numsMerged[numsMerged.length / 2 - 1]) / 2) : (numsMerged[numsMerged.length / 2]);
    }
}
