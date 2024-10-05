class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> ans= new ArrayList<>();
        for(int num: stones){
            ans.add(num);
        }
        while(ans.size()>1){
            int num1= Collections.max(ans);
            ans.remove(Integer.valueOf(num1));
            int num2=Collections.max(ans);
            ans.remove(Integer.valueOf(num2));
            int diff= num1-num2;
            if(diff>0){
                ans.add(diff);
            }
        }
        if(ans.isEmpty()){
            return 0;
        }else{
            return ans.get(0);
        }
        
    }
}