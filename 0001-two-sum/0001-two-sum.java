class Solution {
    public int[] twoSum(int[] nums, int target) {
       /* for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};*/
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(Map.Entry<Integer,Integer> entry : ans.entrySet()){ //index,val;
                if(entry.getValue()+nums[i]== target){
                    return new int[] {entry.getKey(),i};
                }
            }
            ans.put(i,nums[i]);

        }
        return new int[]{};
   
    }
}