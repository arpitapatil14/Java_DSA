class Solution {
    public String largestNumber(int[] nums) {
        String ans="";
        String[] arr= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder sb= new StringBuilder();
        for(String ch: arr){
            sb.append(ch);
        }
        return sb.toString();

    }
}