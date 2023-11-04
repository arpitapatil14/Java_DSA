import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int[] merge = new int[n + m];
       int k = 0;
       for (int i = 0; i < n; i++) {
           merge[k++] = nums1[i];
       }
       for (int i = 0; i < m; i++) {
           merge[k++] = nums2[i];
       }
       Arrays.sort(merge);
       if (merge.length % 2 == 0) {
           double mid1 = merge[merge.length / 2 - 1];
           double mid2 = merge[merge.length / 2];
           return (double)(mid1 + mid2) / 2.0;
       } else {
           return (double)merge[merge.length / 2];
       }
    }
}
