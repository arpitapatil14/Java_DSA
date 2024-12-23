class Solution {
    public List<Integer> ncr(int n){
        long ans=1;
        List<Integer> temp= new ArrayList<>();
        temp.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            temp.add((int)ans);
        }
        return temp;

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalans= new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            finalans.add(ncr(row));
        }
        return finalans;
        
    }
}

