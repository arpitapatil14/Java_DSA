class Solution {
    public int numTeams(int[] rating) {
        int count=0;
        for(int i=0;i<rating.length-2;i++){
            for(int j=i+1;j<rating.length-1;j++){
                for(int k=j+1;k<rating.length;k++){
                    if(rating[i]<rating[j] && rating[j]<rating[k] && rating[i]<rating[k] || rating[i]>rating[j] && rating[j]>rating[k] && rating[i]>rating[k]){
                        count++;
                    }
                }
            }

        }
        return count;
        
    }
}