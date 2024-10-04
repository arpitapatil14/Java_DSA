class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        int len = (m+n);
        int gap = ((m+n)/2)+(m+n)%2;
        while(gap>=1){
            int left=0,right=left+gap;
            while(right<len){
                if(nums1[left]>nums1[right]){
                    int temp = nums1[left];
                    nums1[left]=nums1[right];
                    nums1[right]=temp;
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);
        }
    }
}