class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> n1= new HashSet<>();
        Set<Integer> n2= new HashSet<>();
        int count1=0;
        int count2=0;
        for(int num: nums1){
            n1.add(num);
        }
        for(int num: nums2){
            n2.add(num);
        }
        for(int num: nums1){
            if(n2.contains(num)){
                count1++;
            }
        }
        for(int num: nums2){
            if(n1.contains(num)){
                count2++;
            }
        }
        return new int[]{count1,count2};
        
       
    }
}