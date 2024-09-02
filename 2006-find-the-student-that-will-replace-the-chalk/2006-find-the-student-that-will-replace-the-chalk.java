class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total=0;
        for(int num:chalk){
            total+=num;
        }
        k%=total;
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]){
                return i;
            }
            k-=chalk[i];
        }
        return -1;
        
    }
}