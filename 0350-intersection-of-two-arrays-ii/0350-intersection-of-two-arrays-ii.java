class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n= nums1.length;
        int m= nums2.length;
        int[] temp= new int[ Math.min(n,m)];
        int i=0;
        int j=0;
        int index=0;
        while(i<n && j<m ){
            if(nums1[i]==nums2[j]){
                temp[index++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
       return Arrays.copyOfRange(temp,0,index); 
    }
}